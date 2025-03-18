package aaaaa_Examen_Herencia;

public abstract class Profesion {
	
	// ATRIBUTOS COMUNES
	private String nombre;
	private short anioDeNacimiento;
	private String especialidad;
	
	public abstract String getProfesion();
	
	public Profesion(String nombre, short anioDeNacimiento, String especialidad) {
		this.nombre = nombre != null ? nombre : "CARLOS" ;
		this.anioDeNacimiento = anioDeNacimiento >= 1900 ? anioDeNacimiento : 1950;
		this.especialidad = especialidad == null ? "DESCONOCIDA" : especialidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	// METODOS COMUNES
	public abstract void trabajar();
	
	public short calcularEdad() {
		short anioActual = 2025;
		System.out.print("La edad del " + getProfesion() + ": ");
		return (short) (anioActual - anioDeNacimiento);
	}

	@Override
	public String toString() {
		return String.format("%s %nEl nombre de profesional: %s %nEl año de nacimiento: %d %nLa especialidad: %s", 
				getProfesion().toUpperCase(), nombre, anioDeNacimiento, especialidad);
	}



	
	
	
	
	
	
	

}
