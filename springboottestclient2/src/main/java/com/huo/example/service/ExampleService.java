package com.huo.example.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ExampleService {

	@HystrixCommand(fallbackMethod = "testFallback")
	public String test(String str){
		int i = 1/0;
		return "call cloud-client2 : 9701 ";
	}
	 
	public String testFallback(String str){
		return "call cloud-client2 : 9701 error";
	} 
	
}
