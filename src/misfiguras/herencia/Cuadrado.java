package misfiguras.herencia;

//Propiedades
public class Cuadrado extends Figuras {

   
    private int lado;

    public Cuadrado (){
        lado = 1;
    }

    public Cuadrado (double superficie){
        this.lado = (int) Math.sqrt(superficie);
    }
    public Cuadrado(int lado) {
        this.lado = 1;
    }

//Metodos
    
    @Override
    public double perimetro(){
        return lado * 4;
    }
    
    @Override
    public double area (){
        return lado * lado;
    }
       
    
    @Override
    public String toString(){
        return String.format("Cuadrado de lado %d, superficie %.2f y perimetro %.2f%n", lado, area (), perimetro());
    }
    
     public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado ();
        Cuadrado c2= c1;
        System.out.println(c1);
        System.out.println(c2);
    }
    

}





























/*package misfiguras;

//Propiedades
public class Cuadrado extends Figuras {
    private int lado;

    public Cuadrado() {
        lado = 1;
    }
    
     public Cuadrado(int lado) {
        //Si no pone nada se entiende que aqui existe super(), por ello tenemos 
        //que crear un constructor vacío en el padre
        this.lado = 1;
    }
     public Cuadrado(String color, int lado) {
        super(color);
        this.lado = 1;
    }
     //si ponemos en el parámetro un double no lo confunde con el otro constructor que es un int
      public Cuadrado (double superficie) {
        //ojo color por defecto?
        //ponemos int para convertir el double del método .sqrt
        this.lado = (int)Math.sqrt(superficie);
    }
      
      
     //Métodos
      
     //Calcular el perímetro
    @Override
    public double perimetro (){
        return 4*lado;
    }
    
    //Area
    @Override
    public double area (){
        return lado*lado;
    }
    

   /* @Override
    public String toString() {
        return "Cuadrado{" + "color=" + color + ", lado=" + lado + '}';
    }*/
//A partir de ahora se utiliza esto en vez de show, asistimos al entierro de show
   /* @Override
    public String toString() {
        return String.format("Cuadrado de lado %d, superficie %.2f y perimetro %.2f%n", 
                lado, area(), perimetro());
    }
    
    
    
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado ();
        Cuadrado c2= c1;
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
*/
