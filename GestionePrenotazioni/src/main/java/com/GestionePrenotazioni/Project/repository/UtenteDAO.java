package com.GestionePrenotazioni.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.TipoPostazione;
import com.GestionePrenotazioni.Project.model.Utente;
@Repository
public interface UtenteDAO extends JpaRepository<Utente, Integer> {

	
	// SELECT * FROM postazioni p WHERE p.tipo = 'OPENSPACE' AND p.edificio_id in (SELECT id from edifici where citta = 'Quasimodo lido')
	
	
	@Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND edificio in(SELECT id FROM Edificio e WHERE e.citta = :citta)")
	public List<Postazione> findPostazioneCitta(TipoPostazione tipo,String citta);
}
