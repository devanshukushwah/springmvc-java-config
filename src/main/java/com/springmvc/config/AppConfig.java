package com.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.springmvc")
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver getResolver() {
		InternalResourceViewResolver obj = new InternalResourceViewResolver();
		obj.setPrefix("/WEB-INF/pages/");
		obj.setSuffix(".jsp");
		return obj;
	}
}
