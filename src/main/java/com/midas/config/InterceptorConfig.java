package com.midas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import com.midas.interceptor.AppInterceptor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	
		public void addInterceptors(InterceptorRegistry registry ) {
			registry.addInterceptor(new AppInterceptor());
		}

//		@Bean
//	    public MessageSource messageSource() {
//	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//	        messageSource.setBasename("classpath:messages");
//	        messageSource.setDefaultEncoding("UTF-8");
//	        return messageSource;
//	    }
//
//	    @Bean
//	    @Override
//	    public Validator getValidator() {
//	        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//	        bean.setValidationMessageSource(messageSource());
//	        return bean;
//	    }

}




