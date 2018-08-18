package com.techprimers.jpa.springjpahibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableJpaRepositories(basePackages = "com.techprimers.jpa.springjpahibernateexample.repository")
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
	}
}
