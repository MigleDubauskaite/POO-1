/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misfiguras;

/**
 *
 * @author manana
 */
public class Circulo extends Figura{
    

    
    //FALTA EL GETTER QUE HAGA FALTA
    
   
    private int radio;
    private static final double PI = 3.1416; //al ser una constante final, la variable se pone en mayúscula

    public Circulo() {
        this(1);
    }

    public Circulo(int radio) {
        this.radio = radio;
    }
    
     public Circulo(double area) {
        
        radio = (int) Math.sqrt(area / PI); //El radio es igual a la raíz cuadrada de su área dividda en PI, el método sqrt es como se denomina la raíz cuadrada en java dentro del objeto Math
    }
    
    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }
     
    //Métodos 
    
    @Override
    public double perimetro (){
        return 2 * PI * radio;
    }
    
    @Override
    public double area (){
    
        return PI * (radio * radio);
    }
     
    
    
    @Override
    public String toString() {
       
        return String.format("%s círculo de radio: %d, área: %.2f, perímetro: %.2f", super.toString(), radio, area(), perimetro());
        
    }
    
}
