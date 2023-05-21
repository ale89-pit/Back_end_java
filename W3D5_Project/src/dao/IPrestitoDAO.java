package dao;

import java.util.List;

import entity.Prestito;



public interface IPrestitoDAO {

	public void save(Prestito e);
	public Prestito getById(int id);
	public void delete(Prestito e);
	public void update(Prestito e);
	public List<Prestito> getAll();
	public List<Prestito> getByNumeroTessere(Integer nTess);
	public List<Prestito> getPrestitiScaduti();
}
