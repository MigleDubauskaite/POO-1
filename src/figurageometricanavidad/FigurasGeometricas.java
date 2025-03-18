
package figurageometricanavidad;

//Comparar areas
public abstract class FigurasGeometricas {
    private String color;

    public FigurasGeometricas() {
        color = Color.colorValido(null);
    }

    public FigurasGeometricas(String color) {
        this.color = Color.colorValido(color);
    }
    
    
   //Métodos
    public abstract double area ();
    public abstract double perimetro ();
    public boolean compararAreas (FigurasGeometricas f){
        return this.area() == f.area();
    }
    
    public void identificar (){
        System.out.print("Esto es una figura geometrica");
    }
    
    //Pruebas
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(30, 20);
        Triangulo t1 = new Triangulo(15, 20, 20);
        Circulo cir1 = new Circulo(15);
        Cuadrado cua1 = new Cuadrado(20);
        System.out.printf("Area de un Rectangulo%n");
        System.out.println(r1.area());
        System.out.printf("%nPerimetro de un Triangulo%n");
        System.out.println(t1.perimetro());
        System.out.printf("%nArea de un Circulo%n");
        System.out.println(cir1.area());
        System.out.printf("%nPerimetro de un Cuadrado%n");
        System.out.println(cua1.perimetro());
        
        System.out.println();
        r1.identificar();
        System.out.println();
        t1.identificar();
        System.out.println();
        cir1.identificar();
        System.out.println();
        cua1.identificar();
        
        System.out.printf("%nComparar Areas%n");
        System.out.println(r1.compararAreas(cir1));
    }
}
