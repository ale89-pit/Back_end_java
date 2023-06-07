package com.GestionePrenotazioni.Project.Controller;

import java.awt.PageAttributes.MediaType;
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

import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.UtenteService;

@RestController
@RequestMapping("/api/users")
public class UtenteController {

	@Autowired UtenteService utente_Service;
	
	
	@GetMapping
	public List<Utente> getAllUtenti(){
		List<Utente> list = utente_Service.getAll();
		return list;
	}
	@PostMapping
	public Utente insertUtente(@RequestBody Utente u) {
	Utente utente = utente_Service.insertUtente(u);;
		return utente;
	}
	@PutMapping("/{id}")
	public Utente modificaUtente(@RequestBody Utente u,@PathVariable Integer id) {
		Utente utente = utente_Service.updateUtente(u);
		return utente;
	}
	@DeleteMapping("/{id}")
	public String deleteUtente(@PathVariable Integer id) {
		utente_Service.deleteUtente(id);
		return "Utente Eliminato correttamente";
	}
}
