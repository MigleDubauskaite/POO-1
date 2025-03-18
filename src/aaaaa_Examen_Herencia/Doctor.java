package aaaaa_Examen_Herencia;

public class Doctor extends Profesion {

	public Doctor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	public void trabajar() {
		System.out.println("El doctor [" + super.getNombre() + "] está atendiendo pacientes en el área de [" + super.getEspecialidad() + "].");
	}
	
	public void recetarMedicamento(String medicamento) {
		System.out.println("El doctor [" + super.getNombre() + "] ha recetado el medicamento [" + (medicamento == null ? "Ibuprofeno" : medicamento) + "].");
	}
	
	@Override
	public String toString() {
		return String.format("%s %n", super.toString());
	}
	
	public String getProfesion() {
		return "doctor";
	}
	
	

	
	
	
	
	

}
