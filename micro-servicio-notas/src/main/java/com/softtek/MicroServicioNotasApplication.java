package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //habilitamos para usar Eureka
@EnableFeignClients //importante activarlo para que reconozca los clientes Feign
public class MicroServicioNotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioNotasApplication.class, args);
	}

}
