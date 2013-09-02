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
a{
color:#2D7DB3;
text-decoration:none;	
}
a:HOVER{
	color:#fdb462;
	text-decoration:none
	}
	.font_01{
	color:#2D7BB3;
	font-family:Arial,sans-serif;	
	}
	</style>
</head>

<body align="center" width="auto" height="auto">
<table width="100%" valign="top" height="52">
	<tr  >
   <td height="46" align="center" bgcolor="#0082FF" >
<center style="font-size:28px;color:white;">图书管理系统后台程序（当前ID:${managerID}）</center></td>
  </tr>
</table>
    <tbody>
</tbody>
<table width="100%" height="72">
	<tr>
	<td valign="top" align="center" height="32">
	<ul id="ltitle">
		<li class="lm"><a href="borrowBookMF.html" target="backDeskDF">书籍借阅</a></li>	
		<li class="lo"><a href="recordSearchAdvMF.html" target="backDeskDF">书籍归还</a></li>
		<li class="lo"><a href="queryBeforeAddBook.action" target="backDeskDF">书籍入库</a></li>
		<li class="lo"><a href="bookSearchAdvMF.html" target="backDeskDF">书籍查询操作</a></li>	
		<li class="lo"><a href="listReader.action" target="backDeskDF">查询所有用户</a></li>
    </ul>
	</td>
	</tr>
	<tr>
	<td valign="top" align="center" height="32">
	<ul id="ltitle">
		<li class="lm"><a href="listRecord.action" target="backDeskDF">查询借阅记录</a></li>
		<li class="lo"><a href="listBook.action" target="backDeskDF">查询所有书籍</a></li>
		<li class="lo"><a href="addReaderMF.html" target="backDeskDF">用户注册</a></li>
		<li class="lo"><a href="addManager.html" target="backDeskDF">添加管理员</a></li>
		<li class="lo"><a href="addBookType.html" target="backDeskDF">添加书籍类型</a></li>
    </ul>
	</td>
	</tr>
</table>
</body>
</html>
