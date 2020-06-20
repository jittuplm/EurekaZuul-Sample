package com.jitendra.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerService {
	@Autowired
    RestTemplate restTemplate;
	
	@GetMapping("/{name}")
	public String callFirstSer(@PathVariable final String name) {
		String url = "http://ProducerService/producer/"+name;
        return restTemplate.getForObject(url,String.class);
	}

}
