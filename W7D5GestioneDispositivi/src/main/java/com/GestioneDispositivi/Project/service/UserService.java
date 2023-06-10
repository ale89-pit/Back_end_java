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
		User old = userRepo.findById(id).get();
		if(d.getName()== null) {
			d.setName(old.getName());
		}
		if(d.getLastName() == null) {
			d.setLastName(old.getLastName());
		}
		if(d.getEmail() == null) {
			d.setEmail(old.getEmail());
		}
		if(d.getPassword() == null) {
			d.setPassword(old.getPassword());
		}
		if(d.getDeviceAssegnati() == null) {
			d.setDeviceAssegnati(old.getDeviceAssegnati());
		}
		if(d.getRoles() == null) {
			d.setRoles(old.getRoles());
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
		Device deviceAssign= deviceService.getDeviceById(d.getId());
		if(deviceAssign.getStatus().equals(DeviceStatus.ASSEGNATO)) {
			throw new EntityExistsException("Device assigned");
		}
		 
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
		User u = userRepo.findById(id).get();
		if(u.getDeviceAssegnati().size() > 0) {
			u.getDeviceAssegnati().forEach(d->{
				d.setStatus(DeviceStatus.DISPONIBILE);
			deviceService.updateDevice(d.getId(), d);
				
			});
		}
		userRepo.deleteById(id);
		return "User eliminato correttamente!!";
	}
}
