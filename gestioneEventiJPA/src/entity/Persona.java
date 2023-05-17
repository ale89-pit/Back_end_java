package entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Persona {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private	Integer id;
private	String nome;
private	String cognome;
private	String email;
@Column(name= "data_nascita")
private	LocalDate dataNascita;
@Enumerated(EnumType.STRING)
private	Sesso sesso;
@OneToMany(cascade= CascadeType.ALL)
private List<Partecipazione> listaPartecipazioni;


public Persona() {
	super();
}


public Persona(String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.dataNascita = dataNascita;
	this.sesso = sesso;
}



}
