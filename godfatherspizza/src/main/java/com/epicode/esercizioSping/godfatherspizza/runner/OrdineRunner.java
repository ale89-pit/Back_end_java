package com.epicode.esercizioSping.godfatherspizza.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.esercizioSping.godfatherspizza.configuration.MenuConfiguration;
import com.epicode.esercizioSping.godfatherspizza.configuration.OrderConfiguration;
import com.epicode.esercizioSping.godfatherspizza.model.Drinks;
import com.epicode.esercizioSping.godfatherspizza.model.Ordine;
import com.epicode.esercizioSping.godfatherspizza.model.Pizza;
import com.epicode.esercizioSping.godfatherspizza.model.Tavolo;

@Component
public class OrdineRunner implements CommandLineRunner {
	Map<Integer ,Tavolo> listaTavoli = TavoliRunner.configTavoliWith_Bean();
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Ordine");
		configOrdineWith_Bean();
		
	}

	public void configOrdineWith_Bean() {

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				OrderConfiguration.class);
		AnnotationConfigApplicationContext appMenuContext = new AnnotationConfigApplicationContext(
				MenuConfiguration.class);

		Ordine o1 = (Ordine) appContext.getBean("ordine", 1,listaTavoli.get(1), 2);
		Pizza margherita = (Pizza) appMenuContext.getBean("pizzaMargherita");
//		Pizza margherita2 = (Pizza) appMenuContext.getBean("pizzaMargherita");
		Drinks water = (Drinks) appMenuContext.getBean("drinkWater");
		Drinks lemonade = (Drinks) appMenuContext.getBean("drinkLemonade");
		
		o1.getListaordine().add(lemonade);
		o1.getListaordine().add(water);
		o1.getListaordine().add((Pizza) appMenuContext.getBean("pizzaMargherita"));
		o1.getListaordine().add(margherita);
		System.out.println(o1.getListaordine().get(2) == margherita);
		
		System.out.println(o1);
		
//		System.out.println(listaTavoli.get(1));
		
		appContext.close();
	}

}
