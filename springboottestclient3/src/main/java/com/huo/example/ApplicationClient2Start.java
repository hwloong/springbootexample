package com.huo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@SpringBootApplication
public class ApplicationClient2Start {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationClient2Start.class, args);
	}
}
