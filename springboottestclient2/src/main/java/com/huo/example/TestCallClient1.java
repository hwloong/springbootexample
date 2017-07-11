package com.huo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huo.example.service.ExampleService;

@RestController  
@EnableAutoConfiguration 
public class TestCallClient1 {

	@Autowired
	private ExampleService service;
	
	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		
        return "call client2 " + myName;
	}
	
	@RequestMapping("/hello")
	String test() {
		
        return service.test("test") ;
	}
}
 