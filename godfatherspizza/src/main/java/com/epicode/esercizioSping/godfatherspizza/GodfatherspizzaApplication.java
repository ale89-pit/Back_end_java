package com.epicode.esercizioSping.godfatherspizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.esercizioSping.godfatherspizza.configuration.MenuConfiguration;

import com.epicode.esercizioSping.godfatherspizza.model.Menu;

@SpringBootApplication
public class GodfatherspizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfatherspizzaApplication.class, args);
		
		
	}
	
	

}
