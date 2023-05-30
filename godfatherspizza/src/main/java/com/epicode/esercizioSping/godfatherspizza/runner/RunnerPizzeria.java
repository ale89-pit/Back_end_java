package com.epicode.esercizioSping.godfatherspizza.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.esercizioSping.godfatherspizza.configuration.MenuConfiguration;
import com.epicode.esercizioSping.godfatherspizza.configuration.OrderConfiguration;
import com.epicode.esercizioSping.godfatherspizza.model.Menu;

@Component
public class RunnerPizzeria implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		configWith_Bean();
		
	}
	
	public static void configWith_Bean() {
		// Creo un Container dove utilizzare i bean sulla base del file di configurazione ConfigurationTest creato
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		
		// Recupero il Bean Menu
		Menu menu = (Menu) appContext.getBean("menu");
		System.out.println("******* Menu *******");
		System.out.println("PIZZAS");
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuItemLine()));
		System.out.println("TOPPINGS");
		menu.getMenuTopping().forEach(t -> System.out.println(t.getMenuItemLine()));
		System.out.println("DRINKS");
		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenuItemLine()));
		System.out.println("FRANCHISE");
		menu.getMenuFranchise().forEach(o -> System.out.println(o.getMenuItemLine()));
		
		
		// Chiudo il Context
		appContext.close();
	}
	
	public static void configOrdineWith_Bean() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(OrderConfiguration.class);
	}
}
