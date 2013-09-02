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
<table width="100%" valign="top" height="59">
	<tr  >
   <td height="44" align="center" bgcolor="#0082FF" >
<center style="font-size:28px;color:white;">图书管理系统个人信息管理（当前读者ID:${readerID}）</center></td>
  </tr>
</table>
    <tbody>
</tbody>
<table width="100%" height="36">
	<tr>
	<td valign="top" align="center" height="32">
	<ul id="ltitle">
		<li class="lm"><a href="listRecordByReaderID.action?readerID=${readerID}" target="readerRecordDF">个人借阅信息</a></li>
		<li class="lo"><a href="displayReaderInfo.action?readerID=${readerID}" target="readerRecordDF">个人信息查询</a></li>
		<li class="lo"><a href="bookIndex/bookSearchMF.html" target="readerRecordDF">图书检索</a></li>
		<li class="lo"><a href="backDesk/findManager.html" target="_parent">后台入口</a></li>
    </ul>
	</td>
	</tr>
</table>
</body>
</html>
