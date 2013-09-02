<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>读者信息列表</title>
</head>
<body>

  <table  width="1028" height="222" border="1">
    <tr>
      <td colspan="9"><div align="center">读者类型信息</div></td>
    </tr>
    <tr>
      <td width="73">读者编号</td>
      <td width="73">读者类型</td>
      <td width="73">证件类型</td>
      <td width="73">证件号码</td>
      <td width="73">所属操作员</td>
      <td width="73">创建时间</td>
      <td width="73">条形码</td>
      <td width="79">读者姓名</td>
      <td width="73">性别</td>
      <td width="73">联系电话</td>
      <td width="73">邮件</td>
      <td width="73">读者密码</td>
      <td width="73">编辑</td>
      <td width="73">删除</td>
    </tr>
    
 <#if rList?exists>
     <#list rList as r>
        <tr>
	      <td>${(r.readerID)!0}</td>
	      <td>${(r.typeID)!0}</td>
	      <td>${(r.cardType)!0}</td>
	      <td>${(r.cardNo)!0}</td>
	      <td>${(r.operator)!0}</td>
	      <td>${(r.createDate)!0}</td>
	      <td>${(r.barCode)!0}</td>
	      <td>${(r.readerName)!0}</td>
	      <td>${(r.sex)!0}</td>
	      <td>${(r.tel)!0}</td>
	      <td>${(r.email)!0}</td>
	      <td>${(r.password)!0}</td>
	      <td><a href="queryBeforeEditReader.action?readerID=${r.readerID}">编辑</a></td> 
	      <td><a href="deleteReader.action?readerID=${r.readerID}">删除</a></td>	 
       </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
