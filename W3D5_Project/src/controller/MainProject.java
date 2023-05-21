package controller;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import dao.ElementoBiblioDAO;
import dao.PrestitoDAO;
import dao.UtenteDAO;
import entity.Book;
import entity.ElementoBiblio;
import entity.Periodicita;
import entity.Prestito;
import entity.Rivista;
import entity.Utente;
import utils.JpaUtil;



public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JpaUtil.getEntityManagerFactory().createEntityManager();
			
//			ElementoBiblio l = new Book("sdfw324", "titolo777", 2023, 140, "copiaisbn", "b");
//			ElementoBiblio b = new Rivista("gtrt453", "titolo2222",1962, 50, Periodicita.MENSILE);
//			ElementoBiblio c = new Book("ewew3434", "titolo333", 1989, 200, "pippo", "a");
//			ElementoBiblio d = new Rivista("rfgt34", "titolo444",2020,50, Periodicita.SETTIMANALE);
//			ElementoBiblio e = new Book("swe4", "titolo555", 2000, 200, "autore", "a");
//			ElementoBiblio f = new Rivista("trt534", "titolo666",1995,50, Periodicita.SEMESTRALE);
//			ElementoBiblio g = new Book("qwer345", "titolo777",2010, 280, "pippo", "b");
//			ElementoBiblio h = new Rivista("rft4534", "titolo888", 1972, 50, Periodicita.MENSILE);
//			
			ElementoBiblioDAO eleDao= new ElementoBiblioDAO();
			PrestitoDAO prestDao = new PrestitoDAO();
			UtenteDAO uteDao = new UtenteDAO();
//			eleDao.save(g);
//			eleDao.save(b);
//			eleDao.save(c);
//			eleDao.save(d);
//			eleDao.save(e);
//			eleDao.save(f);
//			eleDao.save(g);
//			eleDao.save(h);
//			
//			Utente primo = new Utente("Sbirulino","verdi",LocalDate.of(2006,7,25));
//			Utente secondo = new Utente("Veronica","Neri",LocalDate.of(2006,12,25));
//			UtenteDAO uDao = new UtenteDAO();
//			uDao.save(secondo);
//			
//			uteDao.save(primo);
//			ElementoBiblio elementoDaPrestare = eleDao.getById("trt534");
//			Utente u = uteDao.getById(1000);
//			Prestito nuovoPrestito = new Prestito(u,elementoDaPrestare,LocalDate.of(2023, 1, 31));
////			Prestito nd = new Prestito(uteDao.getById(1001), eleDao.getById("gtrt453"));
//			
//			prestDao.save(nuovoPrestito);
//			eleDao.getAllByAnno(2020).forEach(el-> System.out.println(el));
//			List<ElementoBiblio> listaByAutore = eleDao.getAllByAutore("pippo");
//			listaByAutore.forEach(el-> System.out.println(el));
//			eleDao.getByPart("77").forEach(e->System.out.println(e));;
			
			prestDao.getByNumeroTessere(1001).forEach(e ->System.out.println(e) );
			List<Prestito> listaPrestitiScaduti = prestDao.getPrestitiScaduti(); 
			listaPrestitiScaduti.forEach(e ->System.out.println(e));
	}	

}
