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

import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.EdificioService;

@RestController
@RequestMapping("api/edifici")
public class EdificioController {
	
	@Autowired EdificioService edificio_Service;
	
	@GetMapping
	public List<Edificio> getAllUtenti(){
		List<Edificio> list = edificio_Service.getAll();
		return list;
	}
	@GetMapping("/{id}")
	public Edificio getEdificio(@PathVariable Integer id){
		Edificio list = edificio_Service.getById(id);
		return list;
	}
	@PostMapping
	public Edificio insertEdificio(@RequestBody Edificio e) {
		Edificio nuovo = edificio_Service.insertEdificio(e);;
		return nuovo;
	}
	@PutMapping("/{id}")
	public Edificio modificaUtente(@RequestBody Edificio e,@PathVariable Integer id) {
		Edificio updated = edificio_Service.insertEdificio(e);
		return updated;
	}
	@DeleteMapping("/{id}")
	public String deleteUtente(@PathVariable Integer id) {
		edificio_Service.deleteEdificio(id);
		return "Utente Eliminato correttamente";
	}
}
