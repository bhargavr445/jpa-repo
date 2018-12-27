package com.midas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@EnableJpaRepositories(basePackages = "com.midas.repository")
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {
	 	@Bean
	    public MessageSource messageSource() {
	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        messageSource.setBasename("classpath:messages");
	        messageSource.setDefaultEncoding("UTF-8");
	        return messageSource;
	    }

	    @Bean
	    public LocalValidatorFactoryBean validator() {
	        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
	        bean.setValidationMessageSource(messageSource());
	        return bean;
	    }
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
	}
}
