package com.example.demo.SpringAppTestJunit.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.example.demo.SpringAppTestJunit.model.User;

@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {

		@Value("${user.admin.name}") private String adminName;
		@Value("${user.admin.lastname}") private String adminLastName;
		@Value("${user.admin.email}") private String adminEmail;
		@Value("${user.admin.pass}") private String adminPass;
	
	
		@Bean
		@Scope("prototype")
		public User customUser() {
			return new User();
		}
		
		@Bean
		@Scope("singleton")
		public User adminUser() {
			return new User(adminName,adminLastName,adminEmail,adminPass);
		}
		
		@Bean
		@Scope("prototype")
		public User newUser(String name,String lastName,String email,String pass) {
			return new User(name,lastName,email,pass);
		}
}
