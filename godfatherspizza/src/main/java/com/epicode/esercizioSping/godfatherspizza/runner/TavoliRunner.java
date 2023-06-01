package com.epicode.esercizioSping.godfatherspizza.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.esercizioSping.godfatherspizza.configuration.MenuConfiguration;
import com.epicode.esercizioSping.godfatherspizza.configuration.TavoloConfiguration;
import com.epicode.esercizioSping.godfatherspizza.model.Tavolo;
@Component
public class TavoliRunner implements CommandLineRunner {
	
	 static Map<Integer,Tavolo> listaTavoli = new HashMap<Integer,Tavolo>();
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Runner tavoli");
		configTavoliWith_Bean();

	}

	
	
	public static  Map<Integer,Tavolo> configTavoliWith_Bean() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(TavoloConfiguration.class);
		
		Tavolo t1 = (Tavolo) appContext.getBean("tavolo", 1,4);
		Tavolo t2 = (Tavolo) appContext.getBean("tavolo", 2,6);
		Tavolo t3 = (Tavolo) appContext.getBean("tavolo", 3,3);
		
		listaTavoli.put(t1.getNumeroTavolo(),t1);
		listaTavoli.put(t2.getNumeroTavolo(),t2);
		listaTavoli.put(t3.getNumeroTavolo(),t3);
		
		System.out.println(listaTavoli.get(1));;
		System.out.println(listaTavoli.get(2));;
		System.out.println(listaTavoli.get(3));;
		appContext.close();
		return listaTavoli;
	}
}
