package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.ElementoBiblio;

import utils.JpaUtil;



public class ElementoBiblioDAO implements IElementoBiblioDAO {

	@Override
	public void save(ElementoBiblio el) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(el);
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
	public ElementoBiblio getById(String isbn) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			ElementoBiblio evt =  em.find(ElementoBiblio.class, isbn);
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
	public void delete(ElementoBiblio el) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(el);
			em.getTransaction().commit();
			System.out.println("Elemento eliminato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
		
	}

	@Override
	public void update(ElementoBiblio el) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(el);
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
	public List<ElementoBiblio> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT el FROM ElementoBiblio el");
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			return q.getResultList();
		} finally {
			em.close();
		}
	}
	public List<ElementoBiblio> getAllByAnno(Integer anno) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT el FROM ElementoBiblio el WHERE el.annoPublicazione = :anno");
			;
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			return q.setParameter("anno", anno).getResultList();
		} finally {
			em.close();
		}
	}
	@SuppressWarnings("unchecked")
	public List<ElementoBiblio> getAllByAutore(String a) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 			SELECT elementobiblio.title FROM elementobiblio WHERE elementobiblio.autore = 'pippo'
			Query q = em.createQuery("SELECT ele FROM ElementoBiblio ele WHERE ele.autore = :aut");
			;
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			return q.setParameter(":aut", a).getResultList();
		} finally {
			em.close();
		}
	}

}
