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
//			ElementoBiblio g = new Book("sdf34324", "titolo777",1999, 200, "recchia", "a");
//			ElementoBiblio h = new Rivista("rft4534", "titolo888", 1972, 50, Periodicita.MENSILE);
//			
			ElementoBiblioDAO eleDao= new ElementoBiblioDAO();
			PrestitoDAO prestDao = new PrestitoDAO();
			UtenteDAO uteDao = new UtenteDAO();
//			ele.save(l);
//			ele.save(b);
//			ele.save(c);
//			ele.save(d);
//			ele.save(e);
//			ele.save(f);
//			ele.save(g);
//			ele.save(h);
//			
//			Utente primo = new Utente("Mario","Rossi",LocalDate.of(1973,7,25));
//			Utente secondo = new Utente("Veronica","Neri",LocalDate.of(2006,12,25));
//			UtenteDAO uDao = new UtenteDAO();
//			uDao.save(secondo);
//			uDao.save(primo);
			ElementoBiblio elementoDaPrestare = eleDao.getById("sdf34324");
			Utente u = uteDao.getById(1000);
//			Prestito nuovoPrestito = new Prestito(u,elementoDaPrestare);
			
//			prestDao.save(nuovoPrestito);
//			eleDao.getAllByAnno(2020).forEach(el-> System.out.println(el));
			List<ElementoBiblio> listaByAutore = eleDao.getAllByAutore("pippo");
			listaByAutore.forEach(el-> System.out.println(el));
			
	}

}
