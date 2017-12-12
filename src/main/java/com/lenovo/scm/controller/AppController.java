package com.lenovo.scm.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lenovo.scm.service.IAppService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping
public class AppController {
	@Autowired
	@Qualifier(value = "appservice")
	private IAppService appService;
	private Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping("/app/getAll.do")
	public void getAllApps(HttpServletResponse response) {
		PrintWriter out = null;
//		response.setContentType("text/plain;charset='utf-8'");
		try {
			JSONArray all = appService.getAll();
			out = response.getWriter();
			out.print(all);
			out.close();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
}
