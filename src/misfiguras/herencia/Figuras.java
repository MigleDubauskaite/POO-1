package misfiguras.herencia;

public abstract class Figuras {

    private String color;

    public Figuras() {
        color = Color.dameColor(null); //Color por defecto
    }
     public Figuras(String color) {
        this.color = Color.dameColor(color);
    }

    public abstract double perimetro();

    public abstract double area();
    
    public boolean compararAreas(Figuras f){
        return this.area() == f.area();
    }
    
    public static void main(String[] args) {
         Cuadrado c1 = new Cuadrado ();
         Rectangulo r1 = new Rectangulo ();
         System.out.println(c1.compararAreas(r1));
    }
}


























  /*  private String color;//Ojo que no es un String

    public Figuras(String color) {
        this.color = color;
    }
    //Sino ponemos este constructor en los constructores de los hijos  se entiende que 
    //en la primera línea existe el constructor super() pero como no existe en él se crea un error
    public Figuras (){}
    public abstract double perimetro ();
    public abstract double area ();
    //Comparar areas la hemos puesto aquí porque se repite en todas las clases, por ello no es un método abstarct
    public boolean comparaArea (Figuras f){
        return this.area() == f.area ();
    }
    
    
}*/
