package com.jitendra.service1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerService {
	
	@GetMapping("/{name}")
	public String reverseString(@PathVariable final String name) {
		
		if(name != null)
			return "Length of Name = " + name.length();
		
		return null;
	}
}
