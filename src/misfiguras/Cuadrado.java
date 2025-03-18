/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misfiguras;

/**
 *
 * @author manana
 */
public class Cuadrado extends Figura{
    
  
    //FALTA EL GETTER QUE HAGA FALTA
    
   
    private int lado;
    
    public Cuadrado() {
        super(); //Se puede quitar, pues Java llama automáticamente del constructor sin parámetros de clase padre.
        lado = 1;
    }

    public Cuadrado(int lado) {
        
        this.lado = lado;
    }
    
    public Cuadrado(double area) {
        
            lado = (int) Math.sqrt(area); //El lado es igual a la raíz cuadrada de su área, el método sqrt es como se denomina la raíz cuadrada en java dentro del objeto Math
    }
      
    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
        
        /*
            -Si la clase padre tiene un constructor predeterminado (sin argumentos), no es necesario llamar explícitamente a super() en la clase hija, porque se invocará automáticamente.
            -Si la clase padre no tiene un constructor predeterminado, es obligatorio llamar explícitamente a uno de los constructores de la clase padre desde el constructor de la clase hija.
            En este constructor se pretende llamar al constructor de la clase Figura donde entra un color.
        */
    }
    
    //Métodos
    
    
    @Override
    public double perimetro (){
        return 4 * lado;
    }
    
    @Override
    public double area (){
    
        return lado * lado;
    }
    
    

    @Override
    public String toString() {
        
        //Este funcionará como el printf
        return String.format("%s cuadrado y de lado: %d, área: %.2f, perímetro: %.2f", super.toString(), lado, area(), perimetro());
        
        /* PARA ACCEDER AL COLOR SIN EL MÉTODO TO STRING DEL SUPER, PODRÍA HACERSE A TRAVÉS DEL GETTER ASÍ:
        return String.format("El cuadrado de color:%s y de lado: %d, área: %.2f, perímetro: %.2f", getColor(), lado, area(), perimetro());

        */
        
        //El getter hace referencia al del hijo this.getColor(), sin embargo, si no lo sobreescribo es el mismo al del padre, puede que en algún caso se necesite usar super.getColor().
        
        //Este funcionará como print
        //return "Cuadrado{" + "color=" + color + ", lado=" + lado + '}';
    }
    
    

    
    
    
    
}
