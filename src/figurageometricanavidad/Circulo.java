
package figurageometricanavidad;


public class Circulo extends FigurasGeometricas {
   //Propiedades
   private int radio;
   private static final double PI = 3.1416;
   
   //Constructores
    public Circulo(int radio) {
        this.radio = radio;
    }
   
   //Métodos
   @Override
    public double area (){
        return PI * (radio*radio);
    }
    
   @Override
   public double perimetro (){
       return 2* PI * radio;
   }
   
   @Override
   public void identificar (){
       super.identificar();
       System.out.printf(" y este concretamente es un Circulo.%n");
   }
   //Pruebas
    public static void main(String[] args) {
        Circulo c1 = new Circulo(15);
        System.out.printf("Area del Circulo%n");
        System.out.println(c1.area());
        System.out.printf("%nPerimetro del circulo%n");
        System.out.println(c1.perimetro());
    }
}
