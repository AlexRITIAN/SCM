package com.lenovo.scm.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;


public class HandlerInterceptor implements org.springframework.web.servlet.HandlerInterceptor {
	
	private Logger logger = Logger.getLogger(HandlerInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("========>HandlerInterceptor Running<==============");
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("username") == null){
			response.sendRedirect("/scm/login/login.do");
			return false;
		}else{
			String url = (String) request.getParameter("url");
			logger.info("=======>url: " + url + "<==========");
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
