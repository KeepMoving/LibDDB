<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <a href = "listBook.action">书籍查询</a><br>
    <a href = "queryBeforeAddBook.action">添加书籍</a><br>
    <a href = "listBookType.action">查询书籍类型</a><br>
    <a href = "backDesk/addBookType.html">添加书籍类型</a><br>
    <a href = "listManager.action">查询管理员信息</a><br>
    <a href = "backDesk/addManager.html">添加新管理员</a><br>
    <a href = "backDesk/findManager.html">寻找特定管理员</a><br>
    <a href = "listReaderType.action">查询用户类型</a><br>
    <a href = "listReader.action">查询读者信息</a><br>
    <a href = "backDesk/addReader.jsp">添加读者信息</a><br>
	<a href = "index.html">读者登陆</a><br>	
  </body>
</html>
