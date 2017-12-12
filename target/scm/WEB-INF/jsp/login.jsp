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
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>SCM Syestem Manager</title>
	<!--[if lt IE 9]>
		<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<script src="<%=basePath %>Javascript/Flot/excanvas.js"></script>
	<![endif]-->
	<!-- The Fonts -->
	<link href="http://fonts.googleapis.com/css?family=Oswald|Droid+Sans:400,700" rel="stylesheet">
	<!-- The Main CSS File -->
	<link rel="stylesheet" href="<%=basePath %>CSS/style.css">
	<!-- jQuery -->
	<script src="<%=basePath %>Javascript/jQuery/jquery-1.7.2.min.js"></script>
	<!-- Flot -->
	<script src="<%=basePath %>Javascript/Flot/jquery.flot.js"></script>
	<script src="<%=basePath %>Javascript/Flot/jquery.flot.resize.js"></script>
	<script src="<%=basePath %>Javascript/Flot/jquery.flot.pie.js"></script>
	<!-- DataTables -->
	<script src="<%=basePath %>Javascript/DataTables/jquery.dataTables.min.js"></script>
	<!-- ColResizable -->
	<script src="<%=basePath %>Javascript/ColResizable/colResizable-1.3.js"></script>
	<!-- jQuryUI -->
	<script src="<%=basePath %>Javascript/jQueryUI/jquery-ui-1.8.21.min.js"></script>
	<!-- Uniform -->
	<script src="<%=basePath %>Javascript/Uniform/jquery.uniform.js"></script>
	<!-- Tipsy -->
	<script src="<%=basePath %>Javascript/Tipsy/jquery.tipsy.js"></script>
	<!-- Elastic -->
	<script src="<%=basePath %>Javascript/Elastic/jquery.elastic.js"></script>
	<!-- ColorPicker -->
	<script src="<%=basePath %>Javascript/ColorPicker/colorpicker.js"></script>
	<!-- SuperTextarea -->
	<script src="<%=basePath %>Javascript/SuperTextarea/jquery.supertextarea.min.js"></script>
	<!-- UISpinner -->
	<script src="<%=basePath %>Javascript/UISpinner/ui.spinner.js"></script>
	<!-- MaskedInput -->
	<script src="<%=basePath %>Javascript/MaskedInput/jquery.maskedinput-1.3.js"></script>
	<!-- ClEditor -->
	<script src="<%=basePath %>Javascript/ClEditor/jquery.cleditor.js"></script>
	<!-- Full Calendar -->
	<script src="<%=basePath %>Javascript/FullCalendar/fullcalendar.js"></script>
	<!-- Color Box -->
	<script src="<%=basePath %>Javascript/ColorBox/jquery.colorbox.js"></script>
	<!-- Kanrisha Script -->
	<script src="<%=basePath %>Javascript/kanrisha.js"></script>
</head>
<body>
	<!-- Change Pattern -->
	<div class="changePattern">
		<span id="pattern1"></span>
		<span id="pattern2"></span>
		<span id="pattern3"></span>
		<span id="pattern4"></span>
		<span id="pattern5"></span>
		<span id="pattern6"></span>
	</div>
	<!-- Top Panel -->
	<div class="top_panel">
		<div class="wrapper">
			<div class="user">
				<img src="Images/user_avatar.png" alt="user_avatar" class="user_avatar">
				<span class="label"><a href="#">Sign Up</a></span>
			</div>
		</div>
	</div>

	<div class="wrapper contents_wrapper">
		
		<div class="login">
			<div class="widget_header">
				<h4 class="widget_header_title wwIcon i_16_login">Login</h4>
			</div>
			<div class="widget_contents lgNoPadding">
				<form action="index.html">
				<div class="line_grid">
					<div class="g_2 g_2M"><span class="label">User</span></div>
					<div class="g_10 g_10M">
						<input class="simple_field tooltip" title="Your Username" type="text" placeholder="Username" id="username"></div>
					<div class="clear"></div>
				</div>
				<div class="line_grid">
					<div class="g_2 g_2M"><span class="label">Pass</span></div>
					<div class="g_10 g_10M">
						<input class="simple_field tooltip" title="Your Password" type="password" value="password" id="password">
					</div>
					<div class="clear"></div>
				</div>
				<div class="line_grid">
					<div class="g_6"><input class="submitIt simple_buttons" value="Log In" type="submit" onclick="login();">
					</div>
					<div class="clear"></div>
				</div>
				</form>
			</div>
		</div>

	</div>
</body>
</html>