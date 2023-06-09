package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Evento;
import utils.JpaUtil;

public class EventoDAO implements IEventoDAO {

	public void save(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(ev);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
	}

	@Override
	public Evento getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento evt =  em.find(Evento.class, id);
			em.getTransaction().commit();
			return evt;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
		return null;
	}

	@Override
	public void delete(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(ev);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}

	}

	@Override
	public void update(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(ev);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}

	}

	@Override
	public List<Evento> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			//Query q = em.createQuery("SELECT ev FROM Evento ev");
			// Named Query
			Query q = em.createNamedQuery("findAllEventi");
			return q.getResultList();
		} finally {
			em.close();
		}
	
	}

	

//public static void inserisciEvento(Evento e ) {
//	em.getTransaction().begin();
//	em.persist(e);
//	em.getTransaction().commit();
//	System.out.println(e.getTitolo() + "" + e.getDataEvento() + "aggiunto nel database");
//
//}
//
//public static void modificaEvento(Evento c) {
//	em.getTransaction().begin();
//	em.merge(c);
//	em.getTransaction().commit();
//}
//
//public static void eliminaEvento(Evento c) {
//	em.getTransaction().begin();
//	em.remove(c);
//	em.getTransaction().commit();
//}
//
//public static Evento leggiEvento (Integer id) {
//	em.getTransaction().begin();
//	Evento e = em.find(Evento.class, id);
//	em.getTransaction().commit();
//	return e;
//}
//public static Evento restore(Evento e) {
//	em.refresh(e);
//	return e;
//	
//	
//}
}
