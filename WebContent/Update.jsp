<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>UpdateUser</title>
</head>
<body>
<form action="UpdateUser.do">
<input type="hidden" name="uid" value="<%=request.getParameter("uid") %>"/>
	<table align="center">
		<tbody>
			<tr height="30px">
			   <td colspan="2" align="center"> 用户信息</td>
			</tr>
			<tr>
			  <td  align="left">Uname:</td>
			  <td  align="left">
			    <input type="text" name="uname" value="<%=request.getParameter("uname") %>"/>
			  </td>
			</tr>
			<tr>
			  <td  align="left">Upass:</td>
			  <td  align="left">
			    <input type="text" name="upass" value="<%=request.getParameter("upass") %>"/>
			   </td>
			</tr>
			<tr>
			  <td  align="left">TrueName:</td>
			  <td  align="left">
			     <input type="text" name="trueName" value="<%=request.getParameter("trueName") %>"/>
			   </td>
			</tr>
			   <tr height="30px">
			   <td colspan="2" align="right"><input type="submit" values="保存"/></td>
			</tr>
		</tbody>
	</table>
</form>

</body>
</html>