package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class Main {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAproject");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
//		Cliente c = new Cliente();
//		c.setNome("Marco");
//		c.setCognome("Viola");
//		c.setRegioneResidenza("Toscana");
//		c.setDataNascita(LocalDate.of(1980, 11, 22));
//		c.setEmail("asdd@dsada.com");
//		inserisciCliente(c);
		
		Cliente c = leggiCliente(1);
		System.out.println(c);
		
		c.setRegioneResidenza("Lazio");
		modificaCliente(c);
		
		eliminaCliente(c);
		
		
	}

	public static void inserisciCliente(Cliente c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		System.out.println(c.getNome() + c.getCognome() + "utete aggiunto nel database");

	}

	public static void modificaCliente(Cliente c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
	}

	public static void eliminaCliente(Cliente c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}

	public static Cliente leggiCliente (Integer id) {
		em.getTransaction().begin();
		Cliente c = em.find(Cliente.class, id);
		em.getTransaction().commit();
		return c;
	}

}
