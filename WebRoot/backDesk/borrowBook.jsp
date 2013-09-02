<%@ page language="java" contentType="text/html; charset=gb2312"%>
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
<div align="center">
  <table>
	      <form action="addRecord.action" method="post" target="borrowBookDF" >
	      <tr>
	        <td>借阅图书</td>
			<td><span class="STYLE5">请按要求输入</span></td>
		  </tr>
	      <tr>
	        <td><span class="STYLE6">操作员ID</span></td>
		    <td>
		      <input name="operator" size=15 maxsize=25 type="text" value="${managerID}" readonly="true"/>	        
		    </td>
		  </tr>	
		  <tr>
	        <td><span class="STYLE6">记录ID</span></td>
		    <td>
		      <input name="id" size=15 maxsize=25 type="text"/></td>
		  </tr>	
	      <tr>
	        <td><span class="STYLE6">读者ID</span></td>
			    <td><input name="readerID" size=15 maxsize=25 type="text" /></td>
		  </tr>
	      <tr>
	        <td><span class="STYLE6">图书ID</span></td>
			    <td><input name="bookID" size=15 maxsize=25 type="text"/></td>
    </tr>
	      <tr>
	        <td><span class="STYLE6">借书地点</span></td>
			    <td>
			      <select name="locationNum" id="locationNum">
			        <option value="1" size=25 selected="true">新区图书馆</option>
			        <option value="2"  size=25>老区图书馆</option>
			      </select>		        
			    </td>
		  </tr>
	      <tr>
	        <td><input type="submit" value="确定"/></td>
		    <td><input type="reset" value="重置"/></td>
    </tr>
  </table>
</div>
</body>
</html>
