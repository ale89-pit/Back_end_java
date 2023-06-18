package com.Gestione_Incendi.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gestione_Incendi.Project.Service.SondaService;
import com.Gestione_Incendi.Project.model.Sonda;

@RestController
@RequestMapping("/sonde")
public class SondaController {

	@Autowired SondaService sondaService;
	
	
	@GetMapping
	public ResponseEntity<?> getAll(){
	  return  ResponseEntity.ok(sondaService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return ResponseEntity.ok(sondaService.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> saveSonda(@RequestBody Sonda s) {
		return ResponseEntity.ok(sondaService.saveSonda(s));
	}
	@PatchMapping("/{id}")
	public ResponseEntity<?> setAllert(@PathVariable Long id,@RequestBody Integer i){
		return ResponseEntity.ok(sondaService.setSegnaleFumo(id, i));
	}  
}