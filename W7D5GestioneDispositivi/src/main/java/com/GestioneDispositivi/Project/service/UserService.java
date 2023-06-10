package com.GestioneDispositivi.Project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.GestioneDispositivi.Project.enumeration.DeviceStatus;
import com.GestioneDispositivi.Project.model.Device;
import com.GestioneDispositivi.Project.model.User;
import com.GestioneDispositivi.Project.repository.DeviceRepository;
import com.GestioneDispositivi.Project.repository.UserRepository;
import com.GestioneDispositivi.Project.security.payload.RegisterDto;

import jakarta.persistence.EntityExistsException;

@Service
public class UserService {
		
		@Autowired UserRepository userRepo;
		@Autowired DeviceRepository deviceRepo;
		@Autowired DeviceService deviceService;
	
	public User updateUser(Long id,User d) {
		
		if(!userRepo.existsById(id)) {
			throw new EntityExistsException("User not found");
		}
		
		return userRepo.save(d);
	}
	public User getUserById(Long id) {
		if(!userRepo.existsById(id)) {
			throw new EntityExistsException("User not found");
		}
		return userRepo.findById(id).get();
	}
	public User addDevice(Long user_id,Device d) {
		if(!userRepo.existsById(user_id)) {
			throw new EntityExistsException("User not found");
		}
		User u = userRepo.findById(user_id).get();
		if(d.getStatus().equals(DeviceStatus.ASSEGNATO)) {
			throw new EntityExistsException("Il device risulta assegnato");
		}
		Device deviceAssign = deviceRepo.findById(d.getId()).get();
		u.getDeviceAssegnati().add(deviceAssign);
		deviceAssign.setStatus(DeviceStatus.ASSEGNATO);
		deviceService.updateDevice(deviceAssign.getId(), deviceAssign);
		this.updateUser(user_id, u);
		return u;
	}
	
	public String removeUser(Long id) {
		if(!userRepo.existsById(id)) {
			throw new EntityExistsException("User not found");
		}
		userRepo.deleteById(id);
		return "User eliminato correttamente!!";
	}
}
