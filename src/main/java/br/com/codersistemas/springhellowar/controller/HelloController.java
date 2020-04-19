package br.com.codersistemas.springhellowar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public ResponseEntity<String> listar() {
		return ResponseEntity.ok("OK-7");
	}

}

