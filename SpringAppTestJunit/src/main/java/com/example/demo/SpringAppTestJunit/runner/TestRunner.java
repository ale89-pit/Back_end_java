package com.example.demo.SpringAppTestJunit.runner;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


import com.example.demo.SpringAppTestJunit.configuration.UserConfiguration;
import com.example.demo.SpringAppTestJunit.model.User;


@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	System.out.println("Prova Run...");
//	configWith_beans();
		
	}

	
	public void configWith_beans() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfiguration.class); 
			User u1 =(User) appContext.getBean("newUser","Giuseppe","Verdi","g.verdi@example.com","12345");
			System.out.println(u1);
			
			User u2 =(User) appContext.getBean("customUser");
			u2.setName("Francesca");
			u2.setLastName("Neri");
			u2.setEmail("f.neri@example.com");
			u2.setPass("zxcvb");
			System.out.println(u2);
			
			
			User u3 =(User) appContext.getBean("adminUser");
			System.out.println(u3);
		
		
	}
}
