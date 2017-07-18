<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Json交互测试</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	function requestJson(){
		
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/requestJson.action',
			contentType:'application/json;charset=utf-8',
			data:'{"lkmname" : "手机","lkmphone" : "999"}',
	        success:function(data){//返回json结果
	            alert(data.lkmname);
		}
		});
	}
	function responseJson(){
		
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/responseJson.action',
			/* contentType:'application/json;charset=utf-8', */
			data:'{"lkmname" : "手机","lkmphone" : "999"}',
	        success:function(data){//返回json结果
	            alert(data);
		}
		});
		
	}
</script>

</head>
<body>
1
<input type="button" onclick="requestJson()" value="requestJson">
<input type="button" onclick="responseJson()" value="responseJson">
</body>
</html>