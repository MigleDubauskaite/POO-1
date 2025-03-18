
package figurageometricanavidad;


public class Rectangulo extends FigurasGeometricas{
    //Propiedades
    private int base;
    private int altura;

    //Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Métodos
    @Override
    public double area (){
        return base * altura;
    }
    
    @Override
    public double perimetro (){
        return 2*base + 2*altura;
    }
    
    @Override
    public void identificar (){
        super.identificar();
        System.out.printf(" y este concretamente es un Rectangulo.%n");
    }
    //Pruebas
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(20, 15);
        System.out.printf("Area del Rectangulo%n");
        System.out.println(r1.area());
        System.out.printf("%nPerimetro del Rectangulo%n");
        System.out.println(r1.perimetro());
    }
    
}
