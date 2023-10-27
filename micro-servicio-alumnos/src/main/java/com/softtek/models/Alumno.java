package com.softtek.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ALUMNOS")
public class Alumno implements Serializable{	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremental
	@Column (name = "ID")
	private Long ID;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "apellido")
	private String apellido;
	
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}




	// gettes y setters
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	@Override
	public String toString() {
		return "Alumno [ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	private static final long serialVersionUID = 1L;
	
	
}
