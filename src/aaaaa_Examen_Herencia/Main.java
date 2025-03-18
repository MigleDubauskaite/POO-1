package aaaaa_Examen_Herencia;

public class Main {
	
	public static void main(String[] args) {
	
		Doctor d1 = new Doctor("Antonio", (short) 1974 , "Odontología");
		Doctor d2 = new Doctor("Carlos", (short) 1992 , "Neurología");
		Doctor d3 = new Doctor("Pedro", (short) 1986 , "Pediatría");
		
		Ingeniero i1 = new Ingeniero("Eduardo", (short) 1983 , "Ciudades");
		Ingeniero i2 = new Ingeniero("Manuel", (short) 2000 , "Terreno");
		Ingeniero i3 = new Ingeniero("Jaime", (short) 1998 , "Ciudades");
		
		Profesor p1 = new Profesor("Pedro", (short) 1998 , "Primaria");
		Profesor p2 = new Profesor("Manuel", (short) 1987 , "Secundaria");
		Profesor p3 = new Profesor("Pedro", (short) 1977 , "Secundaria");
		
		Profesion[] profesiones = {d1, d2, d3, i1, i2, i3, p1, p2, p3};
		for (Profesion p : profesiones) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método CALCULAR EDAD");
		System.out.println();
		Profesion[] edadProfesiones = {d1, i1, p1};
		for (Profesion p : edadProfesiones) {
			System.out.println(p.calcularEdad());
		}
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método TRABAJAR [DOCTOR]");
		System.out.println();
		Profesion[] doctores = {d1, d2, d3};
		for (Profesion d : doctores) {
			d.trabajar();
		}
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método RECETAR MEDICAMENTO");
		System.out.println();
		d1.recetarMedicamento(null);
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método TRABAJAR [INGENIERO]");
		System.out.println();
		Profesion[] ingenieros = {i1, i2, i3};
		for (Profesion i : ingenieros) {
			i.trabajar();
		}
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método CALCULAR EL COSTO DEL PROYECTO");
		System.out.println();
		System.out.println(i1.calcularCostoProyecto(3, 120));
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método TRABAJAR [PROFESOR]");
		System.out.println();
		Profesion[] profesores = {p1, p2, p3};
		for (Profesion p : profesores) {
			p.trabajar();
		}
		
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Probamos el método CALIFICAR EXÁMENES");
		System.out.println();
		p1.calificarExamenes(0);
		p2.calificarExamenes(10);
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		
		
		
	}

}
