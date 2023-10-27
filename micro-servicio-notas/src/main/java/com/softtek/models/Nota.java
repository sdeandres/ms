package com.softtek.models;

public class Nota {

	private Alumno alumno; // alumno iria en un jar común para todos los ms
	private String asignatura;
	private double calificacion;
	
	
	
	
	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nota(Alumno alumno, String asignatura, double calificacion) {
		super();
		this.alumno = alumno;
		this.asignatura = asignatura;
		this.calificacion = calificacion;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Nota [alumno=" + alumno + ", asignatura=" + asignatura + ", calificacion=" + calificacion + "]";
	}
	
	
	
}
