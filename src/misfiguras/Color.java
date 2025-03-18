/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misfiguras;

/**
 *
 * @author manana
 */
public class Color {
    //Un solo array de colores, se usa static, para que
    //Este en la clase y no se repita en cada instancia 
    
    private static String [] colores = {"negro", "azul", "marrón", "gris", "verde", "naranja", 
        "rosa", "púrpura", "rojo", "blanco", "amarillo"}; 
    
    public static String [] listaColores(){
        return colores;
    }
    
    public static String dameColor(String colorTentativo){
        
        for (String color : colores) {
            if(color.equalsIgnoreCase(colorTentativo)){
                /*Si un objeto es null no se puede aplicar un método, entonces 
                es preferible ponerlo así y no primero colorTentativo
                porque sabemos que color no será nulo, pues es una lista determinada*/
                return color;
            }
        }
        return colores[0]; /*El this no está disponible en el método static, pues se refiere a cada
        clase y no a cada instancia, donde se dice this (Este) objeto, se pondría Color.colores[0]
        si se quisiera enfatizar en que es de la clase*/
        
        
    }
    
    
    
}
