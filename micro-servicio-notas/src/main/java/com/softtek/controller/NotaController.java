package com.softtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.models.Nota;
import com.softtek.service.INotaService;

@RestController
public class NotaController {

	@Autowired
	private INotaService service; 
	
	
	// http://localhost:8002/crear/2/asignatura/ingles/calificacion/7.5
	@GetMapping("/crear/{id}/asignatura/{asignatura}/calificacion/{calificacion}")
	public Nota crearNota(@PathVariable Long id, @PathVariable String asignatura, @PathVariable double calificacion) {
		System.out.println("http://localhost:8002/crear/2/asignatura/ingles/calificacion/7.5");
		return service.crearNota(id, asignatura, calificacion);
	}
}
