package com.barry.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.HttpStatusRequestRejectedHandler;
import org.springframework.security.web.firewall.RequestRejectedHandler;

@SpringBootApplication
public class MySpringBootJwtMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootJwtMysqlApplication.class, args);
	}
	
	@Bean
	RequestRejectedHandler requestRejectedHandler() {
	   return new HttpStatusRequestRejectedHandler();
	}
	
	@Bean
	public HttpFirewall defaultHttpFirewall() {
	    return new DefaultHttpFirewall();
	}
	

}
