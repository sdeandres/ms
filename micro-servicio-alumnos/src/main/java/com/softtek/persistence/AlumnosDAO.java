package com.softtek.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.softtek.models.Alumno;


// esta anotación permite instanciar
@RepositoryRestResource(collectionResourceRel = "ALUMNOS", path = "alumnos")
public interface AlumnosDAO extends PagingAndSortingRepository<Alumno, Long>{
	// http://localhost:8001/alumnos
	

}
