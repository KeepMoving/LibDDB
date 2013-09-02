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
      <td colspan="9"><div align="center">管理员信息</div></td>
    </tr>
    <tr>
      <td width="204">ID</td>
      <td width="208">姓名</td>
      <td width="204">密码</td>
      <td width="204">权限</td>
      <td width="204">操作</td>
    </tr>
    
 <#if mList?exists>
     <#list mList as m>
      <tr>
	      <td>${(m.managerID)!0}</td>
	      <td>${(m.managerName)!0}</td>
	      <td>${(m.password)!0}</td>
	      <td>${(m.typeId)!0}</td>
          <td><a href="deleteManager.action?managerID=${m.managerID}">删除</a></td>
       </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
