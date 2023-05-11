package com.epicode.java;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile v = new Automobile("Fiat ","500",3);
		Veicolo v2 = new Veicolo("Ford","Fiesta");
		Veicolo v3 = new Veicolo("BMW","X3");
		//v.marca = "Fiat" ;//  essendo pubblica posso accedere a questo valore da ogni parte del progetto 
		// v.modello ="panda" non accedo a modello perche dichiarata private
		System.out.println(v);
		System.out.println(v2);
		/*il modificatore static fa si che si creino proprietà e medoti
		*della classe perche condivisi da tutte le istanze
		*/
		Veicolo.veicoliCreati();
;		
	}

}
