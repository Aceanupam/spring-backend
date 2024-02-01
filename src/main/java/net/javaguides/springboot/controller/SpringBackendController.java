package net.javaguides.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SpringBackendController {

	
	@GetMapping("/messages")
	public ResponseEntity<List<String>> messages(){
		
		return ResponseEntity.ok(Arrays.asList("first","second"));
	}
}
