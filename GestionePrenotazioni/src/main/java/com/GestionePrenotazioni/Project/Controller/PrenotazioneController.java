package com.GestionePrenotazioni.Project.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.repository.PrenotazioneDAO;
import com.GestionePrenotazioni.Project.service.PrenotazioneService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {
	 
	@Autowired PrenotazioneService prenotazione_Service;
	
//	@GetMapping("/info")
//	public @ResponseBody String getInfoPrenotazione() {
//		return "Per effettuare una prenotazione vai all'inidirizzo /api/prenotazione/creaPrenotazione";
//	}
	@GetMapping
	public List<Prenotazione> getAllPrenotazioni(){
		return prenotazione_Service.getAll();
	}
	@PostMapping
	public Prenotazione creaprenotazione(@RequestBody Prenotazione p) {
		
		return prenotazione_Service.insertPrenotazione(p);
	}
	@PutMapping("/{id}")
	public Prenotazione updatePrenotazione(@RequestBody Prenotazione p,@PathVariable Integer id) {
		return prenotazione_Service.updatePrenotazione(p);
	}
	@DeleteMapping("/{id}")
	public String deletePrenotazione(@PathVariable Integer id) {
		prenotazione_Service.deletePrenotazione(id);
		return "Prenotazione eliminata";
	}
}
