<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>借阅记录列表</title>
</head>
<body>

  <table  width="1024" height="222" border="1">
    <tr>
      <td colspan="9"><div align="center">借阅记录</div></td>
    </tr>
    <tr>
      <td width="113">id</td>
      <td width="113">readerID</td>
      <td width="113">bookID</td>
      <td width="120">borrowTime</td>
      <td width="113">ask_backTime</td>
      <td width="113">operator</td>
      <td width="113">isBack</td>
      <td width="113">real_backTime</td>
      <td width="113">location</td>
    </tr>
    
 <#if rList?exists>
     <#list rList as r>
      <tr>
	      <td>${(r.id)!0}</td>
	      <td>${(r.readerID)!0}</td>
	      <td>${(r.bookID)!0}</td>
	      <td>${(r.borrowTime)!0}</td>
	      <td>${(r.ask_backTime)!0}</td>
	      <td>${(r.operator)!0}</td>
	      <td>${(r.isBack)!0}</td>
	      <td>${(r.real_backTime)!0}</td>
	      <td>${(r.location)!0}</td>     
       </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
