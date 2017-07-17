<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function querylinkman(){
		document.linkmanForm.action="${pageContext.request.contextPath }/linkman/queryUser2.action";
		document.linkmanForm.submit();
	}

	function deletelinkman(){
		document.linkmanForm.action="${pageContext.request.contextPath }/linkman/deletelinkman.action";
		document.linkmanForm.submit();
	}
	
	function editAllLinkmanSubmit(){
		document.linkmanForm.action="${pageContext.request.contextPath }/linkman/editAllLinkmanSubmit.action";
		document.linkmanForm.submit();
	}
</script>
</head>
<body>
	<form name="linkmanForm" action="${pageContext.request.contextPath }/linkman/editAllLinkmanSubmit.action" method="post">
	<table>
	<tr><td><input type="text" name="linkmanCustomer.lkmname"></td>
		<td><input type="button" value="查询" onclick="querylinkman()"></td>
		<td><input type="button" value="批量删除"  onclick="deletelinkman()"></td>
		<td><input type="button" value="批量修改提交"  onclick="editAllLinkmanSubmit()"></td>
	</tr>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>固定电话</td>
			<td>手机</td>
			<td>客户</td>
		</tr>
		<c:forEach items="${list }" var="tLinkmanCustomer" varStatus="status">
				<tr>
					<td><input type="text" name="listTLinkmanCustomer[${status.index }].linkid"
						value="${tLinkmanCustomer.linkid }"></td>
					<td><input type="text" name="listTLinkmanCustomer[${status.index }].lkmname"
						value="${tLinkmanCustomer.lkmname }"></td>
					<td><input type="text" name="listTLinkmanCustomer[${status.index }].lkmgender"
						value="${tLinkmanCustomer.lkmgender }"></td>
					<td><input type="text" name="listTLinkmanCustomer[${status.index }].lkmphone"
						value="${tLinkmanCustomer.lkmphone }"></td>
					<td><input type="text" name="listTLinkmanCustomer[${status.index }].lkmmobile"
						value="${tLinkmanCustomer.lkmmobile }"></td>
					<td><input type="text" name="listTLinkmanCustomer[${status.index }].clid"
						value="${tLinkmanCustomer.clid }"></td>
			<td><a href="${pageContext.request.contextPath }/linkman/editLinkman.action?linkid=${linkman.linkid}">修改</a></td>	
		</tr>
		</c:forEach>		
	</table>
</form>
</body>
</html>