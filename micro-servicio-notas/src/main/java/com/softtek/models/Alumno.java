package com.softtek.models;

import java.io.Serializable;

public class Alumno implements Serializable{	
	private Long ID;
	private String nombre;
	private String apellido;
	
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(Long ID, String nombre, String apellido) {
		super();
		this.ID = ID;
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
