package com.epicode.config_bean.introSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationTest {

	
	@Bean
	@Scope("singleton")
	public Test test() {
		return new Test("Primo Bean" , "Costruzuione primo bean da file Configuration!!");
	}
	@Bean
	@Scope("prototype")
	public Test paramsTest(String txt) {
		return new Test("Primo Bean" , txt );
	}
	
}
