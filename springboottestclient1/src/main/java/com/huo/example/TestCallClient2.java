package com.huo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController  
@EnableAutoConfiguration 
public class TestCallClient2 {

	@RequestMapping("/hello/{myName}")
	//不通过eurake直接调用
	String index(@PathVariable String myName) {
		RestTemplate restTemplate = new RestTemplate();  
		String str = restTemplate.getForObject(  
                "http://localhost:9801/hello/"+myName,  
                String.class);  
        return str;
	}
	
	@Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://cloud-client2/hello", String.class).getBody();
    }
}
