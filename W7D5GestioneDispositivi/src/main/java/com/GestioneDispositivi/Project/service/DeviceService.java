package com.GestioneDispositivi.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestioneDispositivi.Project.model.Device;
import com.GestioneDispositivi.Project.repository.DeviceRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class DeviceService {
		
	@Autowired private DeviceRepository deviceRepo;
	
	public Device createDevice(Device d) {
		return deviceRepo.save(d);
	}
	public Device updateDevice(Long id,Device d) {
		if(!deviceRepo.existsById(id)) {
			throw new EntityExistsException("Il device non esiste");
		}
		return deviceRepo.save(d);
	}
	
	public List<Device> getAllDevice(){
		return deviceRepo.findAll();
	}
	public Device getDeviceById(Long id) {
		if(!deviceRepo.existsById(id)) {
			throw new EntityExistsException("Il device non esiste");
		}
		return deviceRepo.findById(id).get();
	}
	
	public String removeDevice(Long id) {
		if(!deviceRepo.existsById(id)) {
			throw new EntityExistsException("Il device nn esiste");
		}
		deviceRepo.deleteById(id);
		return "Device eliminato correttamente!!";
	}
}	
