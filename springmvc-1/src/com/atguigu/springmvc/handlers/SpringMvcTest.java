package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/springmvc")
@Controller
public class SpringMvcTest {
	
	public final static String SUCCESS = "success";
	
	/**
	 * @RequestMapping 来映射请求参数
	 * value 值即请求参数的参数名
	 * required 该参数是否必须，默认为true
	 * defaultValue 请求参数的默认值
	 * @param username
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/testRequestParam",method=RequestMethod.GET)
	public String testRequestParam(@RequestParam(value="username") String username,
			@RequestParam(value="age",required = false, defaultValue="0") int age){		
		System.out.println("testRequestParam  username: "+ username +" age: " +age);
		return SUCCESS;
	}
	
	/**
	 * Rest 风格的URL
	 * 以CRUD 为例
	 * 新增：/order POST
	 * update /order/1 PUT    	update?id=1
	 * get: /order/1 GET      	get?id=1
	 * delete: /order/1 DELETE  delete?id=1
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
	public String testRestPUT(@PathVariable Integer id){		
		System.out.println("TestRest PUT");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id){		
		System.out.println("TestRest Delete");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest",method=RequestMethod.POST)
	public String testRest(){		
		System.out.println("testRest POST ");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.GET)
	public String testRest(@PathVariable Integer id){		
		System.out.println("testRest GET Id:" +id);
		return SUCCESS;
	}
	/**
	 * rest 风格
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id){
		System.out.println("testPathVariable ......:" + id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testParamsAndHeaders",params={"username","age!=10"},headers={"Accept-Language=zh-CN,zh;q=0.8"})
	public String testParamsAndHeaders(){
		System.out.println("testParamsAndHeaders ......");
		return SUCCESS;
	}
	/**
	 * 常用：使用method属性来指定请求方式
	 * @return
	 */
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod(){
		System.out.println("testMethod......");
		return SUCCESS;
	}
	/**
	 * 1.@RequestMapping 除了修饰方法，还可以修饰类
	 * 2.springmvc/testRequestMapping
	 * @return
	 */
	@RequestMapping("/testRequestMapping")	
	public String testRequestMapping(){
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
