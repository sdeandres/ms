package com.softtek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.models.Alumno;
import com.softtek.persistence.AlumnosDAO;

@Service
public class AlumnoServiceImpl implements IAlumnosService{

	@Autowired
	private AlumnosDAO dao;

	@Override
	public List<Alumno> consultarTodos() {	
		return (List<Alumno>) dao.findAll();
	}
	
	@Override
	public Alumno buscarAlumno(Long id) {
		return dao.findById(id).orElse(new Alumno());
	}

}
