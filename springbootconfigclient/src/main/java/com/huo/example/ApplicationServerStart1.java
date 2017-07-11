package com.huo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  
@EnableDiscoveryClient
public class ApplicationServerStart1 {

	public static void main(String[] args) {
		 SpringApplication.run(ApplicationServerStart1.class, args);
	}
	
	@Autowired
	private DB db;
	
	 @RequestMapping("/test")
	 String home() {
		return db.toString();
	 }

}
