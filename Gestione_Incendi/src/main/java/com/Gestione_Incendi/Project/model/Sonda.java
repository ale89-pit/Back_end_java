package com.Gestione_Incendi.Project.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sonda implements SubjectSonda {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name ="longitudine")
	private String lon;
	@Column(name ="latitudine")
	private String lat;
	@Column(name ="fumo_rilevato")
	private Integer segnaleFumo;
	
	@OneToMany
	private List<CentroControllo> centriControllo = new ArrayList<>();
	
	public void setSegnaleFumo(Integer i) {
		if(i>5) {
			notifyAll("ATTENZIONE PERICOLO INCENDIO IN"+ " "  + this.lat + " " + this.lon);
		}
	}
	
	@Override
	public void register(ObserverCentroControllo oc) {
		System.out.println("la sonda" +lat+ " " +lon + " " +"sta inviando dati");
		this.centriControllo.add((CentroControllo)oc);
		
	}
	@Override
	public void unregister(ObserverCentroControllo oc) {
		this.centriControllo.remove(oc);
		
	}
	@Override
	public void notifyAll(String s) {
	
		for (ObserverCentroControllo o: centriControllo) {
		
			 o.update(s);
		} 
		
	}
}
