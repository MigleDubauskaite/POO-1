package aaaaa_Examen_Herencia;

public class Ingeniero extends Profesion {
	
	public Ingeniero(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public String toString() {
		return String.format("%s %n", super.toString());
	}

	public  void trabajar() {
		System.out.println("El ingeniero [" + super.getNombre() + "] está diseñando un proyecto de [" + super.getEspecialidad() + "].");
	}
	
	public int calcularCostoProyecto(double horas, double tarifaPorHora) {
		double costoTotal;
		System.out.print("El costo total del proyecto es (€): ");
		return (int) (costoTotal = tarifaPorHora * horas);
	}
	
	public String getProfesion() {
		return "ingeniero";
	}
	
	
	

	
	
	
	
	

}
