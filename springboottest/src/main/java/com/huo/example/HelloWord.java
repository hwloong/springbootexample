package com.huo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloWord {
	@Autowired
	private DB db;
	@Autowired
	private User u;
	
	@RequestMapping("/test")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		System.out.println( u.toString());
		return "Hello " + myName + "!!!" + name;
	}
	
	 @Value("${jdbc.url}")
	 private String name;
}
