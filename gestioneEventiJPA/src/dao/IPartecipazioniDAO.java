package dao;

import java.util.List;

import entity.Evento;
import entity.Partecipazione;

public interface IPartecipazioniDAO {
	public void save(Partecipazione e);
	public Partecipazione getById(int id);
	public void delete(Partecipazione e);
	public void update(Partecipazione e);
	public List<Partecipazione> getAll();
}
