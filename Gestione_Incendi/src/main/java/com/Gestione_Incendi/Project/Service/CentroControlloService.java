package com.Gestione_Incendi.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestione_Incendi.Project.Repository.CentroControlloRepository;
import com.Gestione_Incendi.Project.Repository.SondaRepository;
import com.Gestione_Incendi.Project.model.CentroControllo;
import com.Gestione_Incendi.Project.model.Sonda;

import jakarta.persistence.EntityExistsException;

@Service
public class CentroControlloService {

	@Autowired CentroControlloRepository centroControlloDAO;
	
	public void saveSonda(CentroControllo c) {
		centroControlloDAO.save(c);
		
	}
	
	public void updateSonda(Long id,CentroControllo c) {
		if(!centroControlloDAO.existsById(id)) {
			throw new EntityExistsException("Il centro di controllo nn è presente");
		}
		centroControlloDAO.save(c);
	}
	
	public void removeSonda(Long id,CentroControllo c) {
		if(!centroControlloDAO.existsById(id)) {
			throw new EntityExistsException("il centro di controllo nn è presente");
		}
		centroControlloDAO.deleteById(id);
	}
	public List<CentroControllo> getAll(){
		return centroControlloDAO.findAll();
	}
}
