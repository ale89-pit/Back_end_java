package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Evento;
import model.Cliente;
import model.TipoEvento;

public class Main {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneEventiJPA");
	static EntityManager em = emf.createEntityManager();
	
	
	public static void main(String[] args) {
//			inserisciEvento(new Evento("Festa",LocalDate.of(2023, 8, 15),"festone gigante",TipoEvento.PUBBLICO,500));
			Evento e = leggiEvento(2);
			e.setDescrizione("ciao sto cambiando descrizione");
			System.out.println(e);

//			modificaEvento(e);
//			System.out.println(e);
//			eliminaEvento(e);
			restore(e);
			System.out.println(e);

	}
	public static void inserisciEvento(Evento e ) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(e.getTitolo() + "" + e.getDataEvento() + "aggiunto nel database");

	}

	public static void modificaEvento(Evento c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
	}

	public static void eliminaEvento(Evento c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}

	public static Evento leggiEvento (Integer id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}
	public static Evento restore(Evento e) {
		em.refresh(e);
		return e;
		
		
	}

}
