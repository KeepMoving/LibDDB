<%@ page language="java" pageEncoding="utf-8" %>  
<%@ taglib prefix = "s" uri="/struts-tags" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>图书管理系统</title>
	<meta name="book" content="library MS" />
	<style>
#ltitle{ background:#efefef; height:30px;}
#ltitle li{ font-weight:bold;}
ul{ clear:both;list-style:none; margin:0;padding:0;}
ul li{ float:left;clear:right;text-align:center;line-height:16px;padding:5px;}
ul li.lm{ width:20%;}
ul li.lo{ width:15%;}
ul li.lt{ width:15%;}
A{
color:#2D7DB3;
text-decoration:none;	
}
A:HOVER{
	color:#fdb462;
	text-decoration:none
	}
	.font_01{
	color:#2D7BB3;
	font-family:Arial,sans-serif;	
	}
	</style>
	<body align="center" width="auto" height="auto">
	<table width="100%" height="100%" align="top" valign="top">
	<thead>
	<!--
	头部标签
	--> 
	<table width="100%" valign="top" height="auto">
	<tr>
      <td height="35" align="center" bgcolor="#0082FF" ><center style="font-size:28px;color:white;">
        用户个人信息
      </center>
      </td>
      </tr>
   </table>
	<tbody><!--中间部分400px-->
	<table width="100%" height="425px">
	<tr>
	<td width="100%" height="380px" valign="top">
	<div align="center">
	<div>
	<table>
	<form action="updateReader.action" method="post" >
		  <input type=hidden name="operator" VALUE="${readerObj.operator}">
		  <input type=hidden name="createDate" VALUE="${readerObj.createDate}">
		<tr>
			<td><div align="left"><span>读者编号(不可更改)</span></div></td>
			<td><input name="readerID" value="${readerObj.readerID}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>读者类型(不可更改)</span></div></td>
			<td><input name="typeID" value="${readerObj.typeID}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>证件类型(不可更改)</span></div></td>
			<td><input name="cardType" value="${readerObj.cardType}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>证件号码</span></div></td>
			<td><input name="cardNo" value="${readerObj.cardNo}" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>条形码(不可更改)</span></div></td>
			<td><input name="barCode" value="${readerObj.barCode}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
			<tr>
			<td><div align="left"><span>读者姓名</span></div></td>
			<td><input name="readerName" value="${readerObj.readerName}" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><div align="left"><span>性别</span></div></td>
			<td><input name="sex" value="${readerObj.sex}" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><div align="left"><span>联系电话</span></div></td>
			<td><input name="tel" value="${readerObj.tel}" size=25 maxsize=25 type="text" /></td>
		</tr>
				<tr>
			<td><div align="left"><span>邮件</span></div></td>
			<td><input name="email" value="${readerObj.email}" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>读者密码</span></div></td>
			<td><input name="password" value="${readerObj.password}" size=25 maxsize=8 type="text"/></td>
		</tr>
		<tr>
		<td><div align="left">
		  <input type="submit" value="确定" name="submit" id="submit"/>
		  </div></td>
		<td><div align="left">
		  <input type="reset" value="重置" name="reset" id="reset"/>
		  </div></td>
		</tr>
	</table>
	<p><br/>
	  
	  </p>
	</div>  
	</div>
	</td>
	</tr>
	<tfoot valign="bottom" height="30px" align="center">
			<!--结尾部分50px-->
	<tr>
	<td>
	<table width="100%" height="20%">
	<tr>
	<td >
	<hr/>
	</td>
	</tr>
		<tr>
			<td align="center" style="font-family:Verdana;color:#515151"> 数据库课程特别培养计划</td>
		</tr>
	</table>
	</td>
	</tr>
	  </tfoot>
	</table>
	</body>

<body>
	
</body>
</html>
