package com.test.inmarsat.samplerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class Application {

	 public static void main(String[] args) {
		 System.out.println("inside the application");
	        SpringApplication.run(Application.class, args);
	    }
}
