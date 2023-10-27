package com.softtek.service;

import com.softtek.models.Nota;

public interface INotaService {

	Nota crearNota(Long id, String asignatura, double calificacion);
}
