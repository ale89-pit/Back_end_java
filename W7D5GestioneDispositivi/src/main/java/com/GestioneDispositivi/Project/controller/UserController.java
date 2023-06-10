package com.GestioneDispositivi.Project.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestioneDispositivi.Project.model.Device;
import com.GestioneDispositivi.Project.model.User;
import com.GestioneDispositivi.Project.repository.UserRepository;
import com.GestioneDispositivi.Project.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired UserRepository userRepo;
	@Autowired UserService userService;
		
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> getAllUsers(){
		return ResponseEntity.ok(userRepo.findAll()) ;
	}
	
	@PatchMapping("/{user_id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateUser(@PathVariable Long user_id,@RequestBody User u) {
		return ResponseEntity.ok(userService.updateUser(user_id, u));
	}
	@PatchMapping("/assign/{user_id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateUserWhitDevice(@PathVariable Long user_id,@RequestBody Device d) {
		return ResponseEntity.ok(userService.addDevice(user_id, d));
	}

	@DeleteMapping("/{user_id}")
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateUser(@PathVariable Long user_id) {
		 userService.removeUser(user_id);
		 return ResponseEntity.ok("User deleted");
	}

	
}
