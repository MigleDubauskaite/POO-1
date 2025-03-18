/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author dubau
 */
public class Prueba {
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("zBV464fg7", "coche", (short)2019, 450000);
        Vehiculo v3 = new Vehiculo(v2);
        Vehiculo[] vehiculos = {v1, v2, v3};
        for (Vehiculo v : vehiculos) {
            v.mostrar();
        }
    }
}
