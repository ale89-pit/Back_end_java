package com.epicode.esercizioSping.godfatherspizza.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class FoodItem {
	
	protected String name;
	protected double price;
	protected double calories;
	
	
	public String getMenuItemLine() {
		
		return this.name + " Calories : " + this.calories + " Price :" + this.price ;
	}
}

