package com.huo.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController  
@EnableAutoConfiguration 
public class TestCallClient1 {

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		
        return "call client2 " + myName;
	}
	
	@RequestMapping("/hello")
	String test() {
		
        return "call cloud-client2 : 9601 " ;
	}
}
 