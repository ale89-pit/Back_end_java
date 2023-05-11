package com.epicode.java;

public class Veicolo {
	/*
	 * nella classe le variabili vanno dichiarate private perprotezione dei dati
	 */
	protected String marca;
	//protected vie usato per essere visibili nella classe e in quelle ereditate
	private String modello;
	/*la variabile "numVeicoli" se nn viene dichiarata "static" 
	 *viene azzerata a ogni creazione dell'istanza Veicolo
	 *
	 * */ 
	 
	public static int numVeicoli = 0;
	//
	public Veicolo(String marca, String modello) {
		
		this.marca = marca;
		this.modello = modello;
		numVeicoli++;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public static void veicoliCreati() {
		System.out.print(numVeicoli);
	}
	@Override
	public String toString() {
		return "Veicolo [marca=" + marca + ", modello=" + modello + "]";
	}
	
	
}
