package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EventoDAO;
import entity.Evento;
import model.Cliente;
import utils.JpaUtil;


public class Main {
//	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneEventiJPA");
//	static EntityManager em = emf.createEntityManager();
//	
	
	public static void main(String[] args) {
//			inserisciEvento(new Evento("Festa",LocalDate.of(2023, 8, 15),"festone gigante",TipoEvento.PUBBLICO,500));
//			Evento e = leggiEvento(2);
//			e.setDescrizione("ciao sto cambiando descrizione");
//			System.out.println(e);

//			modificaEvento(e);
//			System.out.println(e);
//			eliminaEvento(e);
//			restore(e);
//			System.out.println(e);
		
		
		
		EventoDAO a = new EventoDAO() ;
		JpaUtil.getEntityManagerFactory().createEntityManager();
//		
//		a.inserisciEvento(new Evento("Festa",LocalDate.of(2023, 8, 15),"festone gigante",TipoEvento.PUBBLICO,500));
//	

}
}