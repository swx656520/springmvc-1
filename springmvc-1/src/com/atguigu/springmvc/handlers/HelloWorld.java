package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	/**
	 * 1.使用注解@RequestMapping 来映射请求的URL
	 * 2. 使用 Prefix + returnVal + suffix 这样的方式得到实际的物理视图
	 * "/WEB-INFO/views/success.jsp"
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("Hello world...");
		return "success";
	}
}
