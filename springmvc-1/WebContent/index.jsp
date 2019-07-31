<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="springmvc/testView">Test Views</a>
    <br/>
    <a href="springmvc/testViewAndViesResolver">Test ViewAndViesResolver</a>
    <br/>
	<form action="springmvc/testModelAttribute" method="post">
		<input type="hidden" name="id" value="1"/>
		user name:<input type="text" name="username" value="Tom"/> 
		<br/>		
		email:<input type="text" name="email" value="a@aa.com"/>
		<br/>
		age:<input type="text" name="age" value="20"/>
		<br/>	
		<input type="submit" value="Submit By ModelAttribute" />
	</form>


	<a href="springmvc/testSessionAttributes">Test SessionAttributes</a>
	<br></br>
	
	<a href="springmvc/testMap">Test Map</a>
	<br></br>

	<a href="springmvc/testModelAndView">Test ModelAndView</a>
	<br></br>
	<a href="springmvc/testServletAPI">Test	ServletAPI</a>
	<br></br>
	<form action="springmvc/testPojo" method="post">
		user name:<input type="text" name="username" > 
		<br/>
		password:<input type="password" name="password" >
		<br/>
		email:<input type="text" name="email" >
		<br/>
		age:<input type="text" name="age" >
		<br/>	
		city:<input type="text" name="address.city" >
		<br/>	
		province:<input type="text" name="address.province" >
		<br/>		
		<input type="submit" value="Submit By POJO">
	</form>
	<br></br>
	<a href="springmvc/testRequestParam?username=zhangsan&age=10">Test	RequestParam</a>
	<br></br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT"> 
		<input type="submit" value="Test Rest PUT">
	</form>
	<br></br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE"/> 
		<input type="submit" value="Test Rest DELETE"/>
	</form>
	<br></br>
	<form action="springmvc/testRest" method="post">
		<input type="submit" value="Test Rest Post">
	</form>
	<br></br>
	<a href="springmvc/testRest/1">Test Rest Get</a>
	<br></br>
	<a href="springmvc/testPathVariable/1">Test PathVariable</a>
	<br></br>
	<a href="springmvc/testParamsAndHeaders?username=zhangsan&age=10">Test
		ParamsAndHeaders</a>
	<br></br>
	<form action="springmvc/testMethod" method="post">
		<input type="submit" value="Test Method">
	</form>
	<br></br>
	<a href="springmvc/testRequestMapping">Test RequestMapping</a>
	<br></br>
	<a href="helloworld">Hello World</a>
</body>
</html>