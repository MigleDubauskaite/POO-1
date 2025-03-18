/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misfiguras;

/**
 *
 * @author manana
 */
public abstract class Figura {
    
    private String color; 

    //Constructores
    public Figura() {
        color = Color.dameColor("negro");
    }
    
    
    public Figura (String color){
        this.color = Color.dameColor(color);
    }

    
    //Métodos 
    
    public abstract double perimetro();
    public abstract double area();
    
    public boolean sameArea (Figura f){
        
        return area() == f.area();
        
    }
    
    public void pintar (String color){
        this.color = color;
    }
    
    @Override
    public String toString() {
        return String.format("La figura de color: %s de tipo:", color);
    }
    
    
    //Getter

    public String getColor() {
        return color;
    }
    
    
    
    
    
    
}
