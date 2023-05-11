package com.epicode.java;

public class Automobile extends Veicolo {
	private int numPorte;
	
	public Automobile(String marca,String modello,int numPorte) {
		/*
		 * Con super si richiama il costruttore di Veicolo perche Automobile è 
		 * una classe ereditata da Veicolo
		 */
		super(marca,modello);
		this.numPorte = numPorte;
	}

	@Override
	public String toString() {
		return "Automobile [ marca=" + marca + ", modello=" + getModello() + " numPorte=" + numPorte + "]";
	}
	
	
}
