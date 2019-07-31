package com.atguigu.springmvc.handlers;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.entities.User;

@SessionAttributes(value={"user"},types={String.class})
@RequestMapping("/springmvc")
@Controller
public class SpringMvcTest {

	public final static String SUCCESS = "success";
	
	@RequestMapping("/testView")
	public String testView(){
		System.out.println("testView .........");
		return "helloView";
	}
	
	@RequestMapping(value = "/testViewAndViesResolver")
	public String testViewAndViesResolver() {		
		
		System.out.println("testViewAndViesResolver ... ...");
		return SUCCESS;
	}
	
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false) Integer id,
			Map<String, Object> map){
		System.out.println("This is @ModelAttribute......");
		if(id != null){
			User user = new User(1,"Tom","123456","q@QQ.com",20);
			map.put("user", user);
			System.out.println("从数据库中获取对象：" + user);
		}
	}
	
	
	@RequestMapping(value = "/testModelAttribute")
	public String testModelAttribute(@ModelAttribute("user") User user) {		
		
		System.out.println("修改："+ user);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testSessionAttributes")
	public String testSessionAttributes(Map<String, Object> map) {
		
		User user = new User("Tom","123456","tom@tom.com",19);
		map.put("user", user);
		map.put("school", "school");
		System.out.println(user.getClass().getName());
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testMap")
	public String testMap(Map<String, Object> map) {
		
		map.put("names", Arrays.asList("Tom","Jerry","Mike"));
		System.out.println(map.getClass().getName());
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testModelAndView")
	public ModelAndView testModelAndView() {
		String viewName = SUCCESS;
		ModelAndView  modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("time",new Date());
		System.out.println("modelAndView: "+modelAndView.getClass().getName());
		return modelAndView;
	}

	@RequestMapping(value = "/testServletAPI")
	public String testServletAPI(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("testServletAPI " + request + " , " + response );
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testPojo", method = RequestMethod.POST)
	public String testPojo(User user) {
		System.out.println("testPojo  username: " + user);
		return SUCCESS;
	}
	
	/**
	 * @RequestMapping 鏉ユ槧灏勮姹傚弬鏁� value 鍊煎嵆璇锋眰鍙傛暟鐨勫弬鏁板悕 required
	 *                 璇ュ弬鏁版槸鍚﹀繀椤伙紝榛樿涓簍rue defaultValue 璇锋眰鍙傛暟鐨勯粯璁ゅ��
	 * @param username
	 * @param age
	 * @return
	 */
	@RequestMapping(value = "/testRequestParam", method = RequestMethod.GET)
	public String testRequestParam(@RequestParam(value = "username") String username,
			@RequestParam(value = "age", required = false, defaultValue = "0") int age) {
		System.out.println("testRequestParam  username: " + username + " age: " + age);
		return SUCCESS;
	}

	/**
	 * Rest 椋庢牸鐨刄RL 浠RUD 涓轰緥 鏂板锛�/order POST update /order/1 PUT update?id=1
	 * get: /order/1 GET get?id=1 delete: /order/1 DELETE delete?id=1
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
	public String testRestPUT(@PathVariable Integer id) {
		System.out.println("TestRest PUT");
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id) {
		System.out.println("TestRest Delete");
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest", method = RequestMethod.POST)
	public String testRest() {
		System.out.println("testRest POST ");
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
	public String testRest(@PathVariable Integer id) {
		System.out.println("testRest GET Id:" + id);
		return SUCCESS;
	}

	/**
	 * rest 椋庢牸
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable ......:" + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testParamsAndHeaders", params = { "username", "age!=10" }, headers = {
			"Accept-Language=zh-CN,zh;q=0.8" })
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders ......");
		return SUCCESS;
	}

	/**
	 * 甯哥敤锛氫娇鐢╩ethod灞炴�ф潵鎸囧畾璇锋眰鏂瑰紡
	 * 
	 * @return
	 */
	@RequestMapping(value = "/testMethod", method = RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod......");
		return SUCCESS;
	}

	/**
	 * 1.@RequestMapping 闄や簡淇グ鏂规硶锛岃繕鍙互淇グ绫� 2.springmvc/testRequestMapping
	 * 
	 * @return
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
