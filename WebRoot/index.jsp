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
    <a href = "listBook.action">�鼮��ѯ</a><br>
    <a href = "queryBeforeAddBook.action">����鼮</a><br>
    <a href = "listBookType.action">��ѯ�鼮����</a><br>
    <a href = "backDesk/addBookType.html">����鼮����</a><br>
    <a href = "listManager.action">��ѯ����Ա��Ϣ</a><br>
    <a href = "backDesk/addManager.html">����¹���Ա</a><br>
    <a href = "backDesk/findManager.html">Ѱ���ض�����Ա</a><br>
    <a href = "listReaderType.action">��ѯ�û�����</a><br>
    <a href = "listReader.action">��ѯ������Ϣ</a><br>
    <a href = "backDesk/addReader.jsp">��Ӷ�����Ϣ</a><br>
	<a href = "index.html">���ߵ�½</a><br>	
  </body>
</html>
