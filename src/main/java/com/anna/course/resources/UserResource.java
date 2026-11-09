package com.anna.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anna.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Anna", "anna@gmail.com", "24988473876", "123456");
		
		return ResponseEntity.ok().body(u);
	}
	
	// ResponseEntity dá controle do status HTTP: 
	// ok() responde 200 
	// e body(u) vira o JSON da resposta
}
