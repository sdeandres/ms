package com.softtek.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.softtek.models.Alumno;

// no necesita la url porque lo consulta en Eureka
//@FeignClient (url = "localhost:8001", name="servicio-alumnos")
@FeignClient (name="servicio-alumnos")
public interface AlumnoClienteFeign {

	@GetMapping("/buscar/{id}")
	public Alumno buscar(@PathVariable Long id);
}
