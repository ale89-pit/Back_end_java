package dao;

import java.util.List;

import entity.ElementoBiblio;



public interface IElementoBiblioDAO {
	public void save(ElementoBiblio e);
	public ElementoBiblio getById(String isbn);
	public void delete(ElementoBiblio e);
	public void update(ElementoBiblio e);
	public List<ElementoBiblio> getAll();
	public List<ElementoBiblio> getByPart(String a);
	public List<ElementoBiblio> getAllByAutore(String a) ;
	public List<ElementoBiblio> getAllByAnno(Integer anno);
}
