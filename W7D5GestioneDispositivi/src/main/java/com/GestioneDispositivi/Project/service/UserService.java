package com.GestioneDispositivi.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.GestioneDispositivi.Project.model.Device;
import com.GestioneDispositivi.Project.model.User;
import com.GestioneDispositivi.Project.repository.UserRepository;
import com.GestioneDispositivi.Project.security.payload.RegisterDto;

import jakarta.persistence.EntityExistsException;

@Service
public class UserService {
		
		@Autowired UserRepository userRepo;
	
	public User updateUser(Long id,User d) {
		RegisterDto registerdto = new RegisterDto();
		PasswordEncoder passwordEncoder;;
		if(!userRepo.existsById(id)) {
			throw new EntityExistsException("User not found");
		}
		
//		 User userUpdate = new User();
//	        d.setName(registerdto.getName());
//	        d.setLastName(registerdto.getLastName());
//	        d.setUsername(registerdto.getUsername());
//	        d.setEmail(registerdto.getEmail());
//	        d.setPassword(passwordEncoder.encode(registerdto.getPassword()));
		return userRepo.save(d);
	}
	public User getUserById(Long id) {
		if(!userRepo.existsById(id)) {
			throw new EntityExistsException("User not found");
		}
		return userRepo.findById(id).get();
	}
	
	public String removeUser(Long id) {
		if(!userRepo.existsById(id)) {
			throw new EntityExistsException("User not found");
		}
		userRepo.deleteById(id);
		return "User eliminato correttamente!!";
	}
}
