<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>SCM System Manager</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script src="<%=basePath %>Javascript/jQuery/jquery-1.7.2.min.js"></script>
	<script type="text/javascript">
		$(function() {
			window.location.href = "<%=basePath %>index/show.do";
		})
	</script>
</head>
<body>

</body>
</html>