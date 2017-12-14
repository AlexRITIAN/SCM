<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript">
            $(function(){
				$.ajax({
					type : 'get',
					url : 'http://testwc111.lenovo.com/Windchill/wtcore/test/getServerStatus.jsp',
					data : {},
                    dataType : 'jsonp',
                    jsonp:'callback',
					success : function(data) {
                       $("#msg").text(data.msg);
                       $("#server_status").text(data.serverStatus);
					}
				});
			})
        </script>
    </head>
    <body>
        <p id="msg"></p>
        <p id="server_status">server_status:</p>
    </body>
</html>