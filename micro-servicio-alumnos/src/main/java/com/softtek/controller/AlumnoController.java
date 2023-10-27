package com.softtek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.models.Alumno;
import com.softtek.services.IAlumnosService;

@RestController
public class AlumnoController {
	
	@Autowired
	private IAlumnosService alumnosService;
	
	//localhost:8001/listar
	@GetMapping("/listar")
	public List<Alumno> listar(){
		return alumnosService.consultarTodos();
	}
	
	
	//localhost:8001/listar
	@GetMapping("/buscar/{id}")
	public Alumno buscar(@PathVariable Long id){
		return alumnosService.buscarAlumno(id);
	}

}
