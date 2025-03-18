
package vehiculosnavidad;


public abstract class Vehiculo {
    private int velocidadMaxima;
    private int velocidad;
    private double numRuedas;
    private int peso;

    public Vehiculo(int velocidadMaxima, int velocidad, double numRuedas, int peso) {
        //Velocidad máxima 120
        this.velocidadMaxima = 120;
        //Velocidad mínima 0
        this.velocidad = velocidad < 0 ? 0 : velocidad;
        //NumeroRuedas minimo 2
        this.numRuedas = numRuedas < 2 ? 2: numRuedas;
        this.peso = peso;
    }

    
   
    public Vehiculo (){
        velocidad = 0;
        velocidadMaxima =120;
    }
    
    public int arrancar (){
       if(velocidad == 0){
           velocidad = 1;
       }
       return velocidad;
    }
    
    public int acelerar (int velocidadAñadida){
     if(velocidad + velocidadAñadida < velocidadMaxima){
        velocidad += velocidadAñadida;
        }else{
        velocidad = velocidadMaxima;
     }
     return velocidad;
    }
    
    public int detenerse (){
        return velocidad = 0;
    }
    
    public static void main(String[] args) {
        Coche c1 = new Coche("jose1234");
        Moto m1 = new Moto("kiku12");
        System.out.printf("Arrancar%n");
        System.out.println(c1.arrancar());
        System.out.println(m1.arrancar());
        System.out.printf("%nAcelerar%n");
        System.out.println(c1.acelerar(20));
        System.out.println(c1.acelerar(20));
        System.out.println(m1.acelerar(50));
        System.out.println(m1.acelerar(20));
        System.out.printf("%nDetenerse%n");
        System.out.println(c1.detenerse());
        System.out.println(m1.detenerse());
    }
}
