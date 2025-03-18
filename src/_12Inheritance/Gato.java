
package _12Inheritance;


public class Gato {
     private double peso;

    public Gato(double peso) {
        this.peso = peso;
    }
    
    
    public void identificar (){
        System.out.print("Soy un GATO");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
