package dao;

import entity.Evento;

public interface IEventoDAO {
	public void inserisciEvento(Evento e );
	public void modificaEvento(Evento c);
	public void eliminaEvento(Evento c);
	public Evento leggiEvento (Integer id);
	public Evento restore(Evento e);
	
	
	
}
