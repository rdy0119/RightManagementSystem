<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.rms.domain.*" %>
<%@ page import="java.lang.*" %>  
<%@ page import="java.util.*" %>  
<%@ page import="java.text.SimpleDateFormat"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>top</title>
</head>
<body>
<a href="logout.do" target="_parent">退出</a>

<b><h1 align="center">欢迎登陆</h1></b>

<p align="right"><%=((User)request.getSession().getAttribute("loginUser")).getTrueName() %>@<%= new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %></p>
</body>
</html>
