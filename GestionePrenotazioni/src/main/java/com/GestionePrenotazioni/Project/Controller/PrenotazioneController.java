package com.GestionePrenotazioni.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {

	
	@GetMapping("/info")
	public @ResponseBody String getInfoPrenotazione() {
		return "Per effettuare una prenotazione vai all'inidirizzo /api/prenotazione/creaPrenotazione";
	}
}
