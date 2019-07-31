<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<H4>Success! Hello World!</H4>
<h5> time: ${requestScope.time }</h5>
<h5> names: ${requestScope.names }</h5>
<hr/>
<h5> request user: ${requestScope.user }</h5>
<h5> username: ${requestScope.user.username }</h5>
<h5> session user: ${sessionScope.user }</h5>
<br/>
<fmt:message key="i18n.username"></fmt:message>
<br/>
<fmt:message key="i18n.password"></fmt:message>
<br/>
</body>
</html>