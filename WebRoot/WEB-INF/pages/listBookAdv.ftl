<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>图书信息列表</title>
</head>
<body>

  <table  width="1024" height="222" border="1">
    <tr>
      <td colspan="9"><div align="center">图书信息</div></td>
    </tr>
    <tr>
      <td width="64">bookID</td>
      <td width="64">barCode</td>
      <td width="64">isbn</td>
      <td width="64">bookName</td>
      <td width="64">typeId</td>
      <td width="64">author</td>
      <td width="64">translator</td>
      <td width="64">publisher</td>
      <td width="64">indexNo</td>
      <td width="64">addTime</td>
      <td width="64">price</td>
      <td width="64">operator</td>
      <td width="64">status</td>
      <td width="64">location</td>
      <td width="64">编辑</td>
      <td width="64">删除</td>
    </tr>
    
 <#if bList?exists>
     <#list bList as b>
      <tr>
	      <td>${(b.bookID)!0}</td>
	      <td>${(b.barCode)!0}</td>
	      <td>${(b.isbn)!0}</td>
	      <td>${(b.bookName)!0}</td>
	      <td>${(b.typeId)!0}</td>
	      <td>${(b.author)!0}</td>
	      <td>${(b.translator)!0}</td>
	      <td>${(b.publisher)!0}</td>
	      <td>${(b.indexNo)!0}</td>
	      <td>${(b.addTime)!0}</td>
	      <td>${(b.price)!0}</td>
	      <td>${(b.operator)!0}</td>
	      <td>${(b.status)!0}</td>
	      <td>${(b.location)!0}</td> 
	      <td><a href="queryBeforeEditBook.action?bookID=${b.bookID}">编辑</a></td>  
	      <td><a href="deleteBook.action?bookID=${b.bookID}">删除</a></td> 
       </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
