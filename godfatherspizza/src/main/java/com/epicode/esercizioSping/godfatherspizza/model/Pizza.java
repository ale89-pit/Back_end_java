package com.epicode.esercizioSping.godfatherspizza.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Pizza extends FoodItem {
	
	public Pizza() {
		super();
	}
	
	public Pizza(String name,double price,double calories) {
		super(name,price,calories);
	}
		

}
