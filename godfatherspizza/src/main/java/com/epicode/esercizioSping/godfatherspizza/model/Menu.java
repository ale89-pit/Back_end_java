package com.epicode.esercizioSping.godfatherspizza.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Menu {
	
	private List<Pizza> menuPizza = new ArrayList<Pizza>();
	private List<Drinks> menuDrink = new ArrayList<Drinks>();
	private List<PizzaTopping> menuTopping = new ArrayList<PizzaTopping>();
	private List<Franchise> menuFranchise = new ArrayList<Franchise>();

}
