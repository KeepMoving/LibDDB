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
      <td width="150">图书类型编号</td>
      <td width="*">图书类型名称</td>
    </tr>
    
 <#if btList?exists>
     <#list btList as bt>
      <tr>
	      <td>${(bt.id)!0}</td>
	      <td>${(bt.bookType)!0}</td>  
       </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
