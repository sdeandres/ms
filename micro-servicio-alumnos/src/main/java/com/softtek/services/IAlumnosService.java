package com.softtek.services;

import java.util.List;

import com.softtek.models.Alumno;
public interface IAlumnosService {
	List<Alumno> consultarTodos();		
	Alumno buscarAlumno(Long id);
}
