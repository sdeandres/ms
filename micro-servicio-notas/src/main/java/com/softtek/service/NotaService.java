package com.softtek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.clients.AlumnoClienteFeign;
import com.softtek.models.Alumno;
import com.softtek.models.Nota;

@Service
public class NotaService implements INotaService{

	@Autowired	
	private AlumnoClienteFeign alumnoClienteFeign;
	
	public Nota crearNota(Long id, String asignatura, double calificacion) {
		
		Alumno alumno = alumnoClienteFeign.buscar(id);

		return new Nota(alumno,asignatura,calificacion);
	}

}
