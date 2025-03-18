/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author dubau
 */
public class Vehiculo {

    // PROPIEDADES
    private String matricula;
    private String tipo;
    private short anoFabricacion;
    private int kilometraje;
    private boolean requiereMantenimiento = false;

    // GETTERS
    public String getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public short getAnoFabricacion() {
        return anoFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public boolean isRequiereMantenimiento() {
        return requiereMantenimiento;
    }

    // SETTER
    public void setTipo(String tipo) {
        darFormatoAMatricula(matricula);
    }

    // CONSTRUCTORES
    public Vehiculo() {
    }

    public Vehiculo(String matricula, String tipo, short anoFabricacion, int kilometraje) {
        this.matricula = darFormatoAMatricula(matricula.toUpperCase()) ? matricula.toUpperCase() : "DESCONOCIDA";
        this.tipo = tipo.equals("moto") || tipo.equals("camión") || tipo.equals("bicicleta") ? tipo : "coche";
        this.anoFabricacion = anoFabricacion >= 1990 && anoActual() <= 2024 ? anoFabricacion : 2024;
        this.kilometraje = kilometraje >= 0 ? kilometraje : 0;
    }

    public Vehiculo(Vehiculo v) {
        matricula = v.matricula;
        tipo = v.tipo;
        anoFabricacion = v.anoFabricacion;
        kilometraje = v.kilometraje;
    }

    // METODOS
    // 1
    // METODO MOSTRAR
    public void mostrar() {
        System.out.printf("Vehículo [%s] (%s) del año %d con %d km."
                + "Requiere mantenimiento: %s.%n",
                matricula, tipo, anoFabricacion, kilometraje, requiereMantenimiento ? "sí" : "no");
    }

    // 2
    // METODO ACTUALIZAR KILOMETRAJE
    public boolean actualizarKilometraje(int nuevoKilometraje) {
        if (kilometraje < nuevoKilometraje) {
            kilometraje = nuevoKilometraje;
            return true;
        } else {
            return false;
        }
    }

    // 3
    // METODO MARCAR PARA MANTENIMIENTO
    public boolean marcarParaMantenimiento() {
        if (requiereMantenimiento) {
            return false;
        } else {
            return true;
        }
    }

    // 4
    // METODO CALCULAR ANTIGUEDAD
    public int anoActual() {
        return java.time.Year.now().getValue();
    }

    public int calcularAntiguedad() {
        return 2024 - anoFabricacion;
    }

    // 5
    // METODO MISMA ANTIGUEDAD
    public boolean mismaAntiguedad(Vehiculo v) {
        if (anoFabricacion == v.anoFabricacion) {
            return true;
        } else {
            return false;
        }
    }

    // 6
    // METODO ES IGUAL
    public boolean esIgual(Vehiculo v) {
        return matricula.equals(v.matricula) && tipo.equals(v.tipo);

    }

    // DAR FORMATO A LA MATRICULA
    private static boolean darFormatoAMatricula(String matricula) {
        // maximo 10 caracteres
        if (matricula.length() > 10 || matricula.length() < 4) {
            return false;
        }

        // 3 letras en mayuscula
        for (int i = 0; i < 3; i++) {
            if ( !(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')) {
                return false;
            }
        }
        // numeros desde posicion 4
        for (int i = 3; i < matricula.length(); i++) {
            if ( !(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

}
