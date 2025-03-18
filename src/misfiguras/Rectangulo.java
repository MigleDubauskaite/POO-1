/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misfiguras;

/**
 *
 * @author manana
 */
public class Rectangulo extends Figura{
    
   
    //FALTA EL GETTER QUE HAGA FALTA
    
    private int base;
    private int altura; 

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        
        this(2, 1);
    }
    
    public Rectangulo(double area) {
        
        altura = (int) Math.sqrt(area/2); //La altura es igual a la raíz cuadrada de su área dividda en 2, el método sqrt es como se denomina la raíz cuadrada en java dentro del objeto Math
        base = 2 * altura;
    }
    
    public Rectangulo(String color, int base, int altura ) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    
    
    //Métodos 
    
    @Override
    public double perimetro (){
        return 2 * (base + altura);
    }
    
    @Override
    public double area (){
    
        return base * altura;
    }
    
   
    
    @Override
    public String toString() {
       
        return String.format("%s rectangulo de base: %d, altura: %d, área: %.2f, perímetro: %.2f", super.toString(), base, altura, area(), perimetro());
        
    }
    
    
}
