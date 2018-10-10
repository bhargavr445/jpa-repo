package com.midas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.midas.interceptor.AppInterceptor;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	
		public void addInterceptors(InterceptorRegistry registry ) {
			registry.addInterceptor(new AppInterceptor());
		}


}




