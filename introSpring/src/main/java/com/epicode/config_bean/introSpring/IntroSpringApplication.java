package com.epicode.config_bean.introSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.config_bean.introSpring.configuration.ConfigurationTest;
import com.epicode.config_bean.introSpring.configuration.Test;

@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringApplication.class, args);

		// Metodo 1
		// Configurazione tramite classe Configuration
		configWith_Beans();

	}

	public static void configWith_Beans() {
		// Creo un Container dove utilizzare i bean
		AnnotationConfigApplicationContext appContex = new AnnotationConfigApplicationContext(ConfigurationTest.class);

		// Recupero il Bean test

		Test t1 = ((Test) appContex.getBean("test"));
		System.out.println(t1.readTxt()); 
		// Chiudo il Context
		appContex.close();
	}

}
