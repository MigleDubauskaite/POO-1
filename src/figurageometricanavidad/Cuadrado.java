
package figurageometricanavidad;

public class Cuadrado extends FigurasGeometricas {
    //Propiedades
    private int lado;
    
    
    //Constructores
    public Cuadrado(int lado) {
        this.lado = lado;
    }
   
    //Métodos
    @Override
    public double area (){
        return lado * lado;
    }
    
    @Override
    public double perimetro (){
        return 4 * lado;
    }
    
    @Override
    public void identificar (){
        super.identificar();
        System.out.printf(" y este concretamente es un Cuadrado.%n");
    }
    
    //Pruebas
    public static void main(String[] args) {
        Cuadrado cu1 = new Cuadrado(20);
        System.out.printf("Area del Cuadrado%n");
        System.out.println(cu1.area());
        System.out.printf("%nPerimetro del Cuadrado%n");
        System.out.println(cu1.perimetro());
        
    }
}
