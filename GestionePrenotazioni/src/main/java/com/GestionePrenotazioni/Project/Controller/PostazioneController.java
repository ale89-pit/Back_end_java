package com.GestionePrenotazioni.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.PostazioneService;
import com.GestionePrenotazioni.Project.service.UtenteService;

@RestController
@RequestMapping("/api/postazioni")
public class PostazioneController {

	@Autowired PostazioneService postazione_Service;
	
	
	@GetMapping
	public List<Postazione> getAllUtenti(){
		List<Postazione> list = postazione_Service.getAll();
		return list;
	}
	@PostMapping
	public Postazione insertUtente(@RequestBody Postazione p) {
		Postazione nuova = postazione_Service.insertPostazione(p);;
		return nuova;
	}
	@PutMapping("/{id}")
	public Postazione modificaUtente(@RequestBody Postazione p,@PathVariable Integer id) {
		Postazione updated = postazione_Service.updatePostazione(p);
		return updated;
	}
	@DeleteMapping("/{id}")
	public String deleteUtente(@PathVariable Integer id) {
		postazione_Service.deletePostazione(id);
		return "Utente Eliminato correttamente";
	}
}
