package com.techprimers.jpa.springjpahibernateexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.techprimers.jpa.springjpahibernateexample.interceptor.AppInterceptor;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	
		public void addInterceptors(InterceptorRegistry registry ) {
			registry.addInterceptor(new AppInterceptor());
		}
}




