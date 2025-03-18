/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;

/**
 *
 * @author dubau
 */
public class Estudiante {
    
    // PROPIEDADES
    private String nombre;
    private int edad;
    private String curso;
    private double promedio;
    
    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public double getPromedio() {
        return promedio;
    }
    
    // CONSTRUCTORES

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String curso, double promedio) {
        this.nombre = nombreCorrecto() ? nombre : "El nombre introducido es inválido";
        this.edad = edad;
        this.curso = curso;
        this.promedio = promedio;
    }
    
    public Estudiante (Estudiante e){
        nombre = e.nombre;
        edad = e.edad;
        curso = e.curso;
        promedio = e.promedio;
    }
    
    // METODOS
    public void show(){
        System.out.printf("Estudiante %s, %d años, curso: %s, promedio: %f",
                nombre, edad, curso, promedio);
    }
    
    public boolean nombreCorrecto(){
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.trim().charAt(i) > 30 || nombre.isEmpty() || nombre == null) {
                return false;
            }
        }
        return true;
    }
}
    
    
    