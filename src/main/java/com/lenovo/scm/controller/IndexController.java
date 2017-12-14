package com.lenovo.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/show.do")
	public String show(){
		return "console";
	}

	@RequestMapping("/server.do")
	public String server(){
		return "serverStatus";
	}
}
