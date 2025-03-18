package aaaaa_Examen_Herencia;

public class Profesor extends Profesion {
	
	public Profesor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	public  void trabajar() {
		System.out.println("El profesor [" + super.getNombre() + "] está enseñando [" + super.getEspecialidad() + "] a sus estudiantes.");
	}
	
	public void calificarExamenes (int cantidadEstudiantes) {
		System.out.print("El profesor [" + super.getNombre() + "] ha calificado " + (cantidadEstudiantes >= 1 ? cantidadEstudiantes : 1));
		System.out.printf(" exámen%s.%n", cantidadEstudiantes <= 1 ? "" : "es" );
	}
	
	@Override
	public String toString() {
		return String.format("%s %n", super.toString());
	}

	public String getProfesion() {
		return "profesor";
	}
	
	
	
	
	

}
