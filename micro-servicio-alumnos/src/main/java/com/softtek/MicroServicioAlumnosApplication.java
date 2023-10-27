package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //habilitamos para usar Eureka
public class MicroServicioAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioAlumnosApplication.class, args);
	}

}
