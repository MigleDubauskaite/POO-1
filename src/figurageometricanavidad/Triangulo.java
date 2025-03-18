
package figurageometricanavidad;

public class Triangulo extends FigurasGeometricas{
    
    //Propiedades
    private int lado;
    private int altura;
    private int base;
    
    //Constructores
     public Triangulo(int lado, int altura, int base) {
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }
    
    
    //Métodos
    @Override
    public double area (){
        return (base * altura)/2;
    }
    
    @Override
    public void identificar (){
        super.identificar();
        System.out.printf(" y este concretamente es un Triangulo.%n");
    }
    
    @Override
    public double perimetro (){
        return base + (2*lado);
    }
    
    //Comprobaciones
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(12, 12, 15);
        System.out.printf("Area del Triangulo%n");
        System.out.println(t1.area());
        System.out.printf("%nPerimetro del Triangulo%n");
        System.out.println(t1.perimetro());
    }
}
