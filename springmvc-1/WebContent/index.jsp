<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
		<br></br>
		<a href="springmvc/testRequestParam?username=zhangsan&age=10">Test RequestParam</a>
			<br></br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name= "_method" value="PUT">
		<input type="submit" value="Test Rest PUT">
	</form>
				<br></br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name= "_method" value="DELETE">
		<input type="submit" value="Test Rest DELETE">
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
	<a href="springmvc/testParamsAndHeaders?username=zhangsan&age=10">Test ParamsAndHeaders</a>
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