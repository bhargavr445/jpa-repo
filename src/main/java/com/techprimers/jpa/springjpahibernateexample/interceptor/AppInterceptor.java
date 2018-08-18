package com.techprimers.jpa.springjpahibernateexample.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
 
public class AppInterceptor implements HandlerInterceptor {

	static Logger logger = Logger.getLogger(AppInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.info("Intercepted afterCompletion calling controller");

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		logger.info("Intercepted postHandle calling controller");
	}

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse arg1, Object arg2) throws Exception {
		logger.info("preHandle:" + httpServletRequest.getMethod());
		logger.info("Intercepted before calling controller");
		return true;
	}
}
