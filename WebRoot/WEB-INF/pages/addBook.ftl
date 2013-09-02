<!--
        index.html
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>图书管理系统</title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
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
	<table width="100%" valign="top" height="90px">
	<tr>
          <td bgcolor="#0082FF" align="center" ><center style="font-size:28px;color:white;">新书入库</center></td>
        </tr>
   </table>
	</thead>
	<tbody>
	<!--中间部分400px-->
	<table width="100%" height="425px">
	<tr>
	<td width="100%" height="380px" valign="top">
	<div align="center">
	<div>
	<table>
	<form action="addBook.action" method="post">
		<tr>
			<td><span>操作员ID</span></td>
			<td><input name="operator" value="${managerID}" size=15 maxsize=25 type="text" readonly="true"/></td>
		</tr>
		<tr>
			<td><span>图书编号</span></td>
			<td><input name="bookID" size=15 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><span>书名</span></td>
			<td><input name="bookName" size=15 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><span>书籍类型</span></td>
			<td>
				<label>
					<select name="typeId" id="typeId">    
					<#if btList?exists>
						<#list btList as bt>
						<option value="${bt.id}">${bt.bookType}</option>
						</#list>
					</#if>
					</select>
				</label>
			</td>
		</tr>
		<tr>
			<td><span>作者姓名</span></td>
			<td><input name="author" size=15 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><span>译者姓名</span></td>
			<td><input name="translator" size=15 maxsize=25 type="text"/></td>
		</tr>
			<tr>
			<td><span>出版社名</span></td>
			<td><input name="publisher" size=15 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><span>标准号</span></td>
			<td><input name="isbn" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><span>条形码</span></td>
			<td><input name="barCode" size=25 maxsize=25 type="text"/></td>
		</tr>
				<tr>
			<td><span>索书号</span></td>
			<td><input name="indexNo" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><span>图书价格</span></td>
			<td><input name="price" size=25 maxsize=25 type="text"/></td>
		</tr>
		<tr>
			<td><span>当前状态</span></td>
		<td>
			<select name="status" id="status">
				<option value="可借" selected="true" size=25>可借</option>
				<option value="不可借" size=25>不可借</option>
				<option value="超期" size=25>超期</option>
			</select>
		</td>
		</tr>
		<tr>
			<td><span>存书地点</span></td>
			<td>
				<select name="location" id="location">
					<option value="新区图书馆" selected="true" size=25>新区图书馆</option>
					<option value="老区图书馆" size=25>老区图书馆</option>
				</select>		
			</td>
		</tr>
		<tr>
		<td><input type="submit" value="确定" name="submit" id="submit"/></td>
		<td><input type="reset" value="重置" name="reset" id="reset"/></td>
		</tr>
	</table>
	<br/>
	
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
