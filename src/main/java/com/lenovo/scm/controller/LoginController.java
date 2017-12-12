package com.lenovo.scm.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lenovo.scm.beans.UserBean;
import com.lenovo.scm.service.IUserService;

@Controller
@RequestMapping
public class LoginController {

	@Autowired
	@Qualifier(value="userService")
	private IUserService userService;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping("/test/show.do")
	public String show(){
		return "login";
	}
	
	@RequestMapping("/test/add.do")
	public void add(UserBean user,HttpServletResponse response){
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.println(userService.addUser(user));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}finally{
			out.close();
		}
	}
}
