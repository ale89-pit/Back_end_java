package com.GestioneDispositivi.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestioneDispositivi.Project.model.Device;
import com.GestioneDispositivi.Project.service.DeviceService;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

	@Autowired DeviceService deviceService;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> getAllDevice(){
		return ResponseEntity.ok(deviceService.getAllDevice());
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getDeviceById(@RequestBody Device d){
		return ResponseEntity.ok(deviceService.createDevice(d));
	}
	
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public  ResponseEntity<?> updateDevice(@PathVariable Long id,@RequestBody Device d) {
		return  ResponseEntity.ok(deviceService.updateDevice(id, d));
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> deleteDevice(@PathVariable Long id){
		deviceService.removeDevice(id);
		return ResponseEntity.ok("Device Deleted");
		
		
	}
}
