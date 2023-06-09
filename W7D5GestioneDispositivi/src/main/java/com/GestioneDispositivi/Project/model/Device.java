package com.GestioneDispositivi.Project.model;

import com.GestioneDispositivi.Project.enumeration.DeviceStatus;
import com.GestioneDispositivi.Project.enumeration.DeviceType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="devices")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private DeviceType type;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private DeviceStatus status;
	
}
