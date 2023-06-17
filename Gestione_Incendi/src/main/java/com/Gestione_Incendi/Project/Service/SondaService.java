package com.Gestione_Incendi.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestione_Incendi.Project.Repository.SondaRepository;
import com.Gestione_Incendi.Project.model.Sonda;

import jakarta.persistence.EntityExistsException;

@Service
public class SondaService {

	@Autowired SondaRepository sondaDAO;
	
	public void saveSonda(Sonda s) {
		sondaDAO.save(s);
		
	}
	
	public void updateSonda(Long id,Sonda s) {
		if(!sondaDAO.existsById(id)) {
			throw new EntityExistsException("la sonda nn è presente");
		}
		sondaDAO.save(s);
	}
	
	public void removeSonda(Long id,Sonda s) {
		if(!sondaDAO.existsById(id)) {
			throw new EntityExistsException("la sonda nn è presente");
		}
		sondaDAO.deleteById(id);
	}
	public List<Sonda> getAll(){
		return sondaDAO.findAll();
	}
}
