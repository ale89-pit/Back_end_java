package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.ElementoBiblio;
import entity.Utente;
import utils.JpaUtil;

public class UtenteDAO implements IUtenteDAO {

	@Override
	public void save(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			System.out.println("Elemento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
	}

	@Override
	public Utente getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Utente evt =  em.find(Utente.class, id);
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
	public void delete(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(u);
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
	public void update(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(u);
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
	public List<Utente> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT u FROM Utente u");
			// Named Query
//			Query q = em.createNamedQuery("findAllEventi");
			return q.getResultList();
		} finally {
			em.close();
		}
		
	}

}
