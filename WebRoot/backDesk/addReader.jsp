<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>图书管理系统</title>
    <style type="text/css">
<!--
body,td,th {
	font-size: x-large;
	color: #FFFFFF;
}
body {
	background-color: #66CCFF;
}
.STYLE5 {color: #FFFFFF; font-size: x-large; }
.STYLE6 {color: #FFFFFF}
-->
</style>
</head>
<body align="center" width="auto" height="300">
	<table width="100%" height="100" align="top" valign="top" >
	<div align="center">
	  <table align="center">
	      <form action="addReader.action" method="post" target="addReaderDF" >
	      <tr>
	        <td><span class="STYLE5">用户注册</span></td>
			<td><span class="STYLE5">请按要求输入</span></td>
		  </tr>
	      <tr>
	        <td><span class="STYLE6">操作员ID</span></td>
		    <td>
		      <input name="operator" size=15 maxsize=25 type="text" value="${managerID}" readonly="true"/></s:url>	        </td>
		  </tr>	
	      <tr>
	        <td><span class="STYLE6">读者ID</span></td>
			    <td><input name="readerID" size=15 maxsize=25 type="text" /></td>
		  </tr>
	      <tr>
	        <td><span class="STYLE6">读者姓名</span></td>
			    <td><input name="readerName" size=15 maxsize=25 type="text"/></td>
	      </tr>
	      <tr>
	        <td><span class="STYLE6">读者类型</span></td>
			    <td>
			      <select name="typeID" id="typeID">
			        <option value="1" size=25 selected="true">本科生</option>
			        <option value="2"  size=25>研究生</option>
			        <option value="3" size=25>教师</option>
		          </select>		        
	        </td>
		  </tr>
	      <tr>
	        <td>
	          <span class="STYLE6">证件类型</span>            </td>
		    <td>
		      <select name="cardType" id="cardType">
		        <option value="学生证" selected="true" size=25>学生证</option>
		        <option value="身份证" size=25>身份证</option>
	          </select></td>
	      </tr>
	      <tr>
	        <td><span class="STYLE6">证件号码</span></td>
		    <td><input name="cardNo" size=15 maxsize=25 type="text"/></td>
	      </tr>
	      <tr>
	        <td>
	          <span class="STYLE6">性别</span>	        </td>
		    <td>
		      <select name="sex" id="sex">
		        <option value="男" selected="true" size=25>男</option>
		        <option value="女" size=25>女</option>
	          </select>		   
	        </td>
	      </tr>
	      <tr>
	        <td><span class="STYLE6">联系电话</span></td>
			    <td><input name="tel" size=15 maxsize=25 type="text"/></td>
	      </tr>
	      <tr>
	        <td><span class="STYLE6">邮箱地址</span></td>
			    <td><input name="email" size=15 maxsize=25 type="text"/></td>
	      </tr>
	      <tr>
	        <td><span class="STYLE6">读者密码(最大8位)</span></td>
			    <td><input name="password" size=15 maxsize=25 type="password"/></td>
	      </tr>
	      <tr>
	        <td><input type="submit" value="确定"/></td>
		    <td><input type="reset" value="重置"/></td>
	      </tr>
      </table>
</div>
</body>
</html>
