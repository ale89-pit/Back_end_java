package com.epicode.esercizioSping.godfatherspizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.esercizioSping.godfatherspizza.configuration.ConfigurationDrinks;
import com.epicode.esercizioSping.godfatherspizza.configuration.ConfigurationStoreBrand;
import com.epicode.esercizioSping.godfatherspizza.configuration.ConfigurationTopping;
import com.epicode.esercizioSping.godfatherspizza.configuration.Drinks;
import com.epicode.esercizioSping.godfatherspizza.configuration.StoreBrand;
import com.epicode.esercizioSping.godfatherspizza.configuration.Topping;

@SpringBootApplication
public class GodfatherspizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfatherspizzaApplication.class, args);
		
		createDrink();
		createTopping();
		createMerchandising();
	}
	
	public static void createDrink() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationDrinks.class);
		Drinks d1 = (Drinks) appContext.getBean("drink","Limonata", 128, 1.29,0.33);
		System.out.println(d1);
		Drinks d2 = (Drinks) appContext.getBean("drink","Acqua",0 , 1.29,0.5);
		System.out.println(d2);
		Drinks d3 = (Drinks) appContext.getBean("alcolicDrink","Vino", 607, 7.49,0.75,13.0);
		System.out.println(d3);
		appContext.close();
	}
	
	public static void createTopping() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationTopping.class);
		Topping t1 = (Topping) appContext.getBean("topping","Formaggio", 92, 0.69);
		System.out.println(t1);
		Topping t2 = (Topping) appContext.getBean("topping","Prosciutto",35 , 0.99);
		System.out.println(t2);
		Topping t3 = (Topping) appContext.getBean("topping","Cipolla", 22, 0.79);
		System.out.println(t3);
		Topping t4 = (Topping) appContext.getBean("topping","Ananas",24, 0.79);
		System.out.println(t4);
		Topping t5 = (Topping) appContext.getBean("topping","Salame", 86, 0.99);
		System.out.println(t5);
		appContext.close();
	}
	
	public static void createMerchandising() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationStoreBrand.class);
		StoreBrand t1 = (StoreBrand) appContext.getBean("product","Maglietta", 21.99);
		System.out.println(t1);
		StoreBrand t2 = (StoreBrand) appContext.getBean("product","Tazza",4.99);
		System.out.println(t2);

		appContext.close();
	}

}
