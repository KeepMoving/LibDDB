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
      <td height="35" align="center" bgcolor="#0082FF" ><center style="font-size:28px;color:white;">编辑图书</center></td>
      </tr>
   </table>
	<tbody><!--中间部分400px-->
	<table width="100%" height="425px">
	<tr>
	<td width="100%" height="380px" valign="top">
	<div align="center">
	<div>
	<table>
	<form action="updateBook.action" method="post">
		<tr>
			<td><div align="left"><span>操作员ID(不可更改)</span></div></td>
			<td><input name="operator" value="${managerID}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>图书编号</span>(不可更改)</div></td>
			<td><input name="bookID" value="${bookObj.bookID}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>书名</span></div></td>
			<td><input name="bookName" value="${bookObj.bookName}" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>书籍类型(不可更改)</span></div></td>
			<td><input name="typeId" value="${bookObj.typeId}" size=25 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>作者姓名</span></div></td>
			<td><input name="author" value="${bookObj.author}" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>译者姓名</span></div></td>
			<td><input name="translator" value="${bookObj.translator}" size=25 maxsize=25 type="text"/></td>
		</tr>
			<tr>
			<td><div align="left"><span>出版社名</span></div></td>
			<td><input name="publisher" value="${bookObj.publisher}" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><div align="left"><span>标准号</span></div></td>
			<td><input name="isbn" value="${bookObj.isbn}" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><div align="left"><span>条形码</span></div></td>
			<td><input name="barCode" value="${bookObj.barCode}" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><div align="left"><span>索书号</span></div></td>
			<td><input name="indexNo" value="${bookObj.indexNo}" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><div align="left"><span>图书价格</span></div></td>
			<td><input name="price" value="${bookObj.price}" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td height="21"><div align="left"><span>当前状态</span></div></td>
		<td>
			<div align="left">
			  <select name="status" id="status">
			    <option value="可借" selected="true" size=25>可借</option>
			    <option value="不可借" size=25>不可借</option>
			    <option value="超期" size=25>超期</option>
			    </select>
            </div></td>
		</tr>
		<tr>
			<td><div align="left"><span>存书地点(不可更改)</span></div></td>
			<td><input name="location" value="${bookObj.location}" size=25 maxsize=25 type="text" readonly="true"/></td>
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
