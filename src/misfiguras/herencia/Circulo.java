
package misfiguras.herencia;

//Propiedades
public class Circulo extends Figuras{
    
    private int radio;
    private static final double PI = 3.1416;
    
    public Circulo (){
        radio = 1;
    }
    
    public Circulo (double superficie){
        radio = (int)Math.sqrt(superficie/PI);
    }
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double perimetro (){
        return 2*radio*PI;
    }
    
    @Override
    public double area (){
        return PI * radio * radio;
    }
    
    @Override
    public String toString (){
        return String.format("Circulo de radio %d, superficie %.2f y perimetro %.2f%n",
                radio, area(), perimetro());
    }
    
    public static void main(String[] args) {
        Circulo c1 = new Circulo ();
        Circulo c2= c1;
        System.out.println(c1);
        System.out.println(c2);
    }
    
}











































/*package misfiguras;

//Propiedades
public class Circulo extends Figuras{
    private int radio;
    private static final double PI = 3.1416;
    public Circulo() {
        //ojo color por defecto?
        radio = 1;
    }
    
     public Circulo(int radio) {
        //ojo color por defecto?
        this.radio = radio;
    }
     //si ponemos en el parámetro un double no lo confunde con el otro constructor que es un int
      public Circulo (double superficie) {
        //ojo color por defecto?
        //ponemos int para convertir el double del método .sqrt
        radio= (int)Math.sqrt(superficie/PI);
    }
      
      
     //Métodos
      
     //Calcular el perímetro
    public double perimetro (){
        return PI * 2 * radio;
    }
    
    //Area
    @Override
    public double area (){
        return PI * radio * radio;
    }
    

   /* @Override
    public String toString() {
        return "Cuadrado{" + "color=" + color + ", lado=" + lado + '}';
    }*/
    
    
    //A partir de ahora se utiliza esto en vez de show, asistimos al entierro de show
  /*  @Override
    public String toString() {
        return String.format("Circulo de radio %d, superficie %.2f y perimetro %.2f%n", 
                radio, area(), perimetro());
    }
    
    
    
    public static void main(String[] args) {
        Circulo c1 = new Circulo ();
        Circulo c2= c1;
        System.out.println(c1);
        System.out.println(c2);
    }
    
}*/
