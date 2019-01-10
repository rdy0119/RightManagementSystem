<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.rms.domain.*" %>
<%@ page import="java.lang.*" %>  
<%@ page import="java.util.*" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>users</title>
</head>
<body>
    <form action="batchDlete.do" id="batchDelete" ></form>
	<form action="batchUpload.do" id="batchUpload" method="post" enctype="multipart/form-data"></form>
	<form action="batchDownload.do" id="batchDownload" ></form>
    <h3 align="center">用户信息</h3>
    <p align="center">
		<a href="addUser.html">添加用户</a>
		||<input type="submit"  form="batchDelete" value="批量删除"/>
		||<input type="submit"  form="batchDownload" value="全部导出"/>
		||<input type="file" name="excel"  form="batchUpload" /><input type="submit"  form="batchUpload" value="提交"/>
	</p>
	<table  align="center"  border="1" cellspacing="0">
		<thead >
           <tr bordercolor="blue" >
			   <td height="30" width="30px" ></td>
	          <td height="30" width="60px" >id</td>
			  <td width="90px" align="left">用户名</td>
			  <td width="90px" align="left">密码</td>
			  <td width="90px" align="left">真实姓名</td>
			  <td width="100px" align="center">操作</td>
           </tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.Users}" var="user" >
		           <tr>
			   <td height="30" width="30px" ><input type="checkbox" value="${user.uid }" name="uid" form="batchDelete"/></td>
	          <td height="30" width="60px">${user.uid }</td>
			  <td width="90px">${user.uname }</td>
			  <td width="90px">${user.upass }</td>
			  <td width="90px">${user.trueName }</td>
			  <td width="100px" align="center">
			  <a href="Update.jsp?uid=${user.uid }&uname=${user.uname }
			                          &upass=${user.upass }&trueName=${user.trueName }" >修改</a>
			  |<a href="deleteUser.do?uid=${user.uid }">删除</a>
			  </td>
           </tr>
		</c:forEach>

		
		</tbody>	
	</table>
</body>
</html>