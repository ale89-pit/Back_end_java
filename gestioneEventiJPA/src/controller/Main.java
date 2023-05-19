package controller;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EventoDAO;
import dao.IPartitaDiCalcioDAO;
import dao.PartitaDiCalcioDAO;
import entity.Evento;
import entity.Location;
import entity.Partecipazione;
import entity.PartitaDiCalcio;
import entity.TipoEvento;
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
		
		
		
		PartitaDiCalcioDAO a = new PartitaDiCalcioDAO() ;
		
		JpaUtil.getEntityManagerFactory().createEntityManager();
		Location luogo1 = new Location("Roma","Roma");
		Set<Partecipazione> lista = new HashSet<Partecipazione>();
		
		EventoDAO a1 = new EventoDAO();
//		PartitaDiCalcio p = new PartitaDiCalcio();
//		p.setTitolo("Serie A");
//		p.setDataEvento(LocalDate.of(2023,5,19));
//		p.setDescrizione("Incotro valido per la 22° gioranta");
//		p.setLocation(luogo1);
//		p.setMaxPartecipanti(50000);
//		p.setSquadraCasa("Roma");
//		p.setSquadraOspite("Juventus");
//		p.setNumeroGolSquadraCasa(3);
//		p.setNumeroGolSquadraOspite(1);
//		p.setSquadraVincente("Roma");
//		p.setTipoEvento(TipoEvento.PUBBLICO);
		
		Evento evento1 = new Evento("Titolo",LocalDate.of(2023,5,14),"descrizione",TipoEvento.PRIVATO,200,luogo1,lista);
//		a.save(p);
		
		a1.save(evento1);
		
//		
//		a.inserisciEvento(new Evento("Festa",LocalDate.of(2023, 8, 15),"festone gigante",TipoEvento.PUBBLICO,500));
//	

}
}