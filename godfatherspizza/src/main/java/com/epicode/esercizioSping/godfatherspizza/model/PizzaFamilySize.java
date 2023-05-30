package com.epicode.esercizioSping.godfatherspizza.model;

import java.text.DecimalFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaFamilySize extends Pizza {
	 DecimalFormat f = new DecimalFormat("##.00");
		private Pizza pizza;
		private String name;
		private double calories;
		private double price;
		
		
		public PizzaFamilySize(Pizza pizza) {
			super();
			this.name = "Family Size" + " " + pizza.getName();
			this.price = pizza.price + 4.15;
			this.calories = pizza.calories * 1.95  ;
			this.pizza = pizza;
		}
		
		public String getMenuItemLine() {
			return this.name + " - Calories :"+ f.format(this.calories)  + "Price :" + this.price;
		}

}
