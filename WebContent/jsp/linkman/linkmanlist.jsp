<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function querylinkman(){
		document.linkmanForm.action="${pageContext.request.contextPath }/linkman/queryUser2.action";
		document.linkmanForm.submit();
	}

	function deletelinkman(){
		document.linkmanForm.action="${pageContext.request.contextPath }/linkman/deletelinkman.action";
		document.linkmanForm.submit();
	}
	
	function toupdateAlllinkman(){
		document.linkmanForm.action="${pageContext.request.contextPath }/linkman/toupdateAlllinkman.action";
		document.linkmanForm.submit();
	}
</script>
<body>
当前用户：${username }
<c:if test="${username!=null }">
	<a href="${pageContext.request.contextPath }/logout.action">退出</a>
</c:if>
<form name="linkmanForm" action="${pageContext.request.contextPath }/linkman/queryUser2.action" method="post">
	<table>
	<tr><td><input type="text" name="linkmanCustomer.lkmname"></td>
		<td><input type="button" value="查询" onclick="querylinkman()"></td>
		<td><input type="button" value="批量删除"  onclick="deletelinkman()"></td>
		<td><input type="button" value="批量修改"  onclick="toupdateAlllinkman()"></td>
	</tr>
		<tr>
			<td>选择</td>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>固定电话</td>
			<td>手机</td>
			<td>客户</td>
		</tr>
		<c:forEach items="${list }" var="linkman">
		<tr>	
			<td><input type="checkbox" name="linkid" value="${linkman.linkid }"></td>	
			<td>${linkman.linkid }</td>
			<td>${linkman.lkmname }</td>
			<td>${linkman.lkmgender }</td>
			<td>${linkman.lkmphone }</td>
			<td>${linkman.lkmmobile }</td>
			<td>${linkman.clid }</td>	
			<td><a href="${pageContext.request.contextPath }/linkman/editLinkman.action?linkid=${linkman.linkid}">修改</a></td>	
		</tr>
		</c:forEach>		
	</table>
</form>
</body>
</html>