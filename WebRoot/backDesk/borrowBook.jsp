<%@ page language="java" contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>ͼ�����ϵͳ</title>
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
	        <td>����ͼ��</td>
			<td><span class="STYLE5">�밴Ҫ������</span></td>
		  </tr>
	      <tr>
	        <td><span class="STYLE6">����ԱID</span></td>
		    <td>
		      <input name="operator" size=15 maxsize=25 type="text" value="${managerID}" readonly="true"/>	        
		    </td>
		  </tr>	
		  <tr>
	        <td><span class="STYLE6">��¼ID</span></td>
		    <td>
		      <input name="id" size=15 maxsize=25 type="text"/></td>
		  </tr>	
	      <tr>
	        <td><span class="STYLE6">����ID</span></td>
			    <td><input name="readerID" size=15 maxsize=25 type="text" /></td>
		  </tr>
	      <tr>
	        <td><span class="STYLE6">ͼ��ID</span></td>
			    <td><input name="bookID" size=15 maxsize=25 type="text"/></td>
    </tr>
	      <tr>
	        <td><span class="STYLE6">����ص�</span></td>
			    <td>
			      <select name="locationNum" id="locationNum">
			        <option value="1" size=25 selected="true">����ͼ���</option>
			        <option value="2"  size=25>����ͼ���</option>
			      </select>		        
			    </td>
		  </tr>
	      <tr>
	        <td><input type="submit" value="ȷ��"/></td>
		    <td><input type="reset" value="����"/></td>
    </tr>
  </table>
</div>
</body>
</html>
