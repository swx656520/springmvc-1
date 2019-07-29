package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RequestMapping("/springmvc")
@Controller
public class SpringMvcTest {
	
	public final static String SUCCESS = "success";
	
	
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
