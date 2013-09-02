<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>管理员信息列表</title>
</head>
<body>

  <table  width="1024" height="222" border="1">
    <tr>
      <td colspan="9"><div align="center">读者类型信息</div></td>
    </tr>
    <tr>
      <td width="256">类型编号</td>
      <td width="256">读者类型</td>
      <td width="256">借书期限</td>
      <td width="256">借书数量</td>
    </tr>
    
 <#if rtList?exists>
     <#list rtList as rt>
        <tr>
	      <td>${(rt.id)!0}</td>
	      <td>${(rt.jbType)!0}</td>
	      <td>${(rt.timeLimit)!0}</td>
	      <td>${(rt.quantityLimit)!0}</td>
       </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
