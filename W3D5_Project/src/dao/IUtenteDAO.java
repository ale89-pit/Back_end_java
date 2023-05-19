package dao;

import java.util.List;

import entity.Utente;



public interface IUtenteDAO {
	public void save(Utente e);
	public Utente getById(int id);
	public void delete(Utente e);
	public void update(Utente e);
	public List<Utente> getAll();
}
