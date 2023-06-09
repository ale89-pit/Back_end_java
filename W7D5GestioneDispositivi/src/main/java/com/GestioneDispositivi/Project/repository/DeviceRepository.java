package com.GestioneDispositivi.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestioneDispositivi.Project.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long>{
	
	
}
