<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set value="${pageContext.request.contextPath}" var="frontPath" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>操你大爷的</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="${frontPath}/js/jquery-2.1.1.js"></script>
		<script type="text/javascript">
  		$(function(){
	  		$("a#insert").click(function() {
	  			jQuery.ajax({
			 	      	type: "post",
						data:{name:$("input[name='name']").val()}, 
						dataType: "json",
						url:"${frontPath}/user/insertUser.json",
						success: function(data) {
							$.alert("success");
						},
						error:function(err){
							alert("faile"+err);	
						}
				});
			});
  		});
  		</script>
	</head>

	<body>
	<div class="name">
		name:
		<input name="name" value="">
		<a id="insert" href="javascrpt:void(0)">insert</a>
	</div>
	</body>
</html>
