package com.epicode.esercizioSping.godfatherspizza.configuration;



import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.esercizioSping.godfatherspizza.model.DrinkLemonade;
import com.epicode.esercizioSping.godfatherspizza.model.DrinkWater;
import com.epicode.esercizioSping.godfatherspizza.model.Drinks;
import com.epicode.esercizioSping.godfatherspizza.model.FoodItem;
import com.epicode.esercizioSping.godfatherspizza.model.FranchiseMug;
import com.epicode.esercizioSping.godfatherspizza.model.FranchiseShirt;
import com.epicode.esercizioSping.godfatherspizza.model.Menu;
import com.epicode.esercizioSping.godfatherspizza.model.Ordine;
import com.epicode.esercizioSping.godfatherspizza.model.Pizza;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaFamilySize;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaHawaiian;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaMargherita;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaSalami;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaToppingCheese;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaToppingOnion;
import com.epicode.esercizioSping.godfatherspizza.model.PizzaToppingSalami;



@Configuration
public class MenuConfiguration {
	
	@Bean
	public Menu menu() {
		Menu m = new Menu();
		
//		List<Pizza> listaPizze = m.getMenuPizza();
//		PizzaMargherita pm = pizzaMargherita();
//		listaPizze.add(pm);
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiian());
		m.getMenuPizza().add(pizzaSalami());
		m.getMenuPizza().add(pizzaFamilySize(pizzaMargherita()));
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWater());
		
		m.getMenuTopping().add(toppingCheese());
		m.getMenuTopping().add(toppingOnions());
		m.getMenuTopping().add(toppingSalami());
		
		m.getMenuFranchise().add(franchiseMug());
		m.getMenuFranchise().add(franchiseShirt());
		
		return m;
	}

	
	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	
	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean
	public PizzaFamilySize pizzaFamilySize(Pizza p) {
		return new PizzaFamilySize(p);
	}
	
	@Bean
	public Drinks drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	public Drinks drinkWater() {
		return new DrinkWater();
	}
	
	@Bean
	public PizzaToppingCheese toppingCheese() {
		return new PizzaToppingCheese();
	}
	
	@Bean
	public PizzaToppingOnion toppingOnions() {
		return new PizzaToppingOnion();
	}
	
	@Bean
	public PizzaToppingSalami toppingSalami() {
		return new PizzaToppingSalami();
	}
	
	@Bean
	public FranchiseMug franchiseMug() {
		return new FranchiseMug();
	}
	
	@Bean
	public FranchiseShirt franchiseShirt() {
		return new FranchiseShirt();
	}
	


}