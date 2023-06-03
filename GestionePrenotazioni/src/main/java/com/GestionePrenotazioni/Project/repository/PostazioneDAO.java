package com.GestionePrenotazioni.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.Project.model.Postazione;
@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Integer> {

}
