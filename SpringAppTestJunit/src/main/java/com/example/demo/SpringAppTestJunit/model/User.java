package com.example.demo.SpringAppTestJunit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {

	private String name;
	private String lastName;
	private String email;
	private String pass;
}
	
