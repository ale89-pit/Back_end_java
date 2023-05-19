package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Prestito;
import entity.Utente;
import utils.JpaUtil;

public class PrestitoDAO implements IPrestitoDAO {

	@Override
	public void save(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(p);
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
	public Prestito getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Prestito evt =  em.find(Prestito.class, id);
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
	public void delete(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(p);
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
	public void update(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(p);
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
	public List<Prestito> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT p FROM Prestito p");
			// Named Query
//			Query q = em.createNamedQuery("findAllEventi");
			return q.getResultList();
		} finally {
			em.close();
		}
	}

}
