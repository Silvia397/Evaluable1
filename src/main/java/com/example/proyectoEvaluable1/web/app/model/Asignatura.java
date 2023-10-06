package com.example.proyectoEvaluable1.web.app.model;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	
	
	//Propiedades
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int numAlumnosMatriculados;
	
	//Constructor
	public Asignatura(int id, String nombre, String descripcion, String tipo, int numeroCreditos,
			int numAlumnosMatriculados) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.numAlumnosMatriculados = numAlumnosMatriculados;
	}
	//Método para devolver una lista de 20 asignaturas
		public static List<Asignatura> dameLaListaDeAsignaturas() {
			List<Asignatura> listaAsignaturas = new ArrayList<>();
			
			listaAsignaturas.add(new Asignatura(1, "historia", "Esta asignatura tratará sobre la asignatura", "artístico", 3, 0));
			listaAsignaturas.add(new Asignatura(2, "física", "Esta asignatura tratará sobre la asignatura", "ciencias", 5, 20));
			listaAsignaturas.add(new Asignatura(3, "castellano", "Esta asignatura tratará sobre la asignatura", "letras", 4, 10));
			listaAsignaturas.add(new Asignatura(4, "tecnología", "Esta asignatura tratará sobre la asignatura", "mixto", 12, 20));
			listaAsignaturas.add(new Asignatura(5, "ciudadanía", "Esta asignatura tratará sobre la asignatura", "sociales", 11, 30));
			listaAsignaturas.add(new Asignatura(6, "latín", "Esta asignatura tratará sobre la asignatura", "letras", 10, 50));
			listaAsignaturas.add(new Asignatura(7, "diseño", "Esta asignatura tratará sobre la asignatura", "artístico", 9, 40));
			listaAsignaturas.add(new Asignatura(8, "química", "Esta asignatura tratará sobre la asignatura", "ciencias", 7, 60));
			listaAsignaturas.add(new Asignatura(9, "escultura", "Esta asignatura tratará sobre la asignatura", "artístico", 8, 10));
			listaAsignaturas.add(new Asignatura(10, "biología", "Esta asignatura tratará sobre la asignatura", "ciencias", 9, 7));
			listaAsignaturas.add(new Asignatura(11, "volumen", "Esta asignatura tratará sobre la asignatura", "artístico", 6, 4));
			listaAsignaturas.add(new Asignatura(12, "estadística", "Esta asignatura tratará sobre la asignatura", "sociales", 3, 6));
			listaAsignaturas.add(new Asignatura(13, "musicología", "Esta asignatura tratará sobre la asignatura", "mixto", 7, 15));
			listaAsignaturas.add(new Asignatura(14, "lenguaje musical", "Esta asignatura tratará sobre la asignatura", "artístico", 2, 32));
			listaAsignaturas.add(new Asignatura(15, "griego", "Esta asignatura tratará sobre la asignatura", "letras", 1, 41));
			listaAsignaturas.add(new Asignatura(16, "cuántica", "Esta asignatura tratará sobre la asignatura", "ciencias", 9, 41));
			listaAsignaturas.add(new Asignatura(17, "acuarela", "Esta asignatura tratará sobre la asignatura", "artístico", 7, 69));
			listaAsignaturas.add(new Asignatura(18, "sintaxis", "Esta asignatura tratará sobre la asignatura", "letras", 12, 74));
			listaAsignaturas.add(new Asignatura(19, "mecánica", "Esta asignatura tratará sobre la asignatura", "ciencias", 5, 25));
			listaAsignaturas.add(new Asignatura(20, "antropología", "Esta asignatura tratará sobre la asignatura", "sociales", 8, 36));
									
			return null;
			}
		
	//Getters (no setters)
		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroCreditos() {
		return numeroCreditos;
	}

	public int getNumAlumnosMatriculados() {
		return numAlumnosMatriculados;
	}
	
		

}
