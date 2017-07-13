package com.huo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringCloudApplication   //@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker，
@EnableZuulProxy
public class ApplicationZuul {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationZuul.class, args);
	}
	
	@Bean
	public SimpleFilter accessFilter() {
		return new SimpleFilter();
	}
	
	@Bean
	public SimpleRouteFilter simpleRouteFilter(){
		return new SimpleRouteFilter();
	}

}
