function login(){
	var username = $("#username").val();
	var password = $("#password").val();
	
	$.ajax({
		type : 'post',
		url : 'http://localhost:8080/scm/login/login.do',
		data : {
			'username' : username,
			'password' : password
		},
		dataType : 'json',
		success : function(data) {
			if(data){
				window.location.href="http://localhost:8080/scm/index.jsp";
			}else{
				alert("用户名或密码错误！");
			}
		}
	});
}