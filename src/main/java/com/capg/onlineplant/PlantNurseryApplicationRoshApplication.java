package com.capg.onlineplant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages= {"com.capg"})
@SpringBootApplication
public class PlantNurseryApplicationRoshApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantNurseryApplicationRoshApplication.class, args);
		System.out.println("Springboot Started...");
	}

}
