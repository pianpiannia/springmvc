<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${allErrors!=null }">
	<c:forEach items="${allErrors }" var="errors">
		${errors.defaultMessage }
	</c:forEach>
</c:if>
	
	<form id="linkmanForm" action="${pageContext.request.contextPath }/linkman/editLinkmanSubmit.action" 
	method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>编号</td>
				<td><input type="text" name="linkid" value="${tLinkmanCustomer.linkid }"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="lkmname" value="${tLinkmanCustomer.lkmname }"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" name="lkmgender" value="${tLinkmanCustomer.lkmgender }"></td>
			</tr>
			<tr>
				<td>固定电话</td>
				<td><input type="text" name="lkmphone" value="${tLinkmanCustomer.lkmphone }"></td>
			</tr>
			<tr>
				<td>手机</td>
				<td><input type="text" name="lkmmobile" value="${tLinkmanCustomer.lkmmobile }"></td>
			</tr>
			<tr>
				<td>客户</td>
				<td><input type="text" name="clid" value="${tLinkmanCustomer.clid }"></td>
			</tr>
			<%-- <tr>
				<td>上传图片</td>
				<td><c:if test="${itemsCustom.pic !=null}">
           	 			<img src="/file/${itemsCustom.pic}" width=100 height=100 /><br />
        			</c:if> 
        			<input type="file" name="items_pic"/>
    			</td>
			</tr> --%>
			<tr>
				<td><input type="submit" name="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>