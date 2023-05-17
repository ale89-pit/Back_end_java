package dao;

import javax.persistence.EntityManager;

import entity.Evento;
import utils.JpaUtil;

public class EventoDAO implements IEventoDAO {

	@Override
	public void inserisciEvento(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction();
			em.persist(ev);
			em.getTransaction().commit();
		}catch(Exception e){
			e.getStackTrace();
			em.getTransaction().rollback();
			
			
		}finally {
			em.close();
		}
		
	}

	@Override
	public void modificaEvento(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction();
			em.merge(ev);
			em.getTransaction().commit();
		}catch(Exception e){
			e.getStackTrace();
			em.getTransaction().rollback();
			
			
		}finally {
			em.close();
		}
		
	}

	@Override
	public void eliminaEvento(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction();
			em.remove(ev);
			em.getTransaction().commit();
		}catch(Exception e){
			e.getStackTrace();
			em.getTransaction().rollback();
			
			
		}finally {
			em.close();
		}
		
	}

	@Override
	public Evento leggiEvento(Integer id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction();
		Evento ris =em.find(Evento.class,id);
		em.getTransaction().commit();
		return	ris;
		}catch(Exception e){
			e.getStackTrace();
			em.getTransaction().rollback();
			
			
		}finally {
			em.close();
		}
	 return null;
	}

	@Override
	public Evento restore(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction();
			em.refresh(ev);
			em.getTransaction().commit();
		}catch(Exception e){
			e.getStackTrace();
			em.getTransaction().rollback();
			
			
		}finally {
			em.close();
		}
		return null;
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
