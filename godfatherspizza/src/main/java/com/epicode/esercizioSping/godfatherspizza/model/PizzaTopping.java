package com.epicode.esercizioSping.godfatherspizza.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PizzaTopping extends FoodItem {
	
	
	private Pizza pizza;
	
	public PizzaTopping(String name, double price, double calories) {
		super(name,price,calories);
	}
}
