
package animalnavidad;


public abstract class Animal {
    private String nombre;
    private String especie;
    private String color;
    private boolean dormido;
    private boolean hambriento;
    

    @Override
    public String toString(){
       return String.format("%s de especie %s y color %s", nombre, especie, color);
    }
    public Animal (){
        
    }
    public Animal(String nombre, String especie, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }
    
    public boolean dormir (){
        if(dormido){
            return false;
        }
        dormido = true;
        return true;
    }
     public boolean comer (){
        if (hambriento){
            hambriento = false;
            return true;
        }
        return false;
    }
     
    public void identificarAnimal(){
        System.out.print("Soy un ");
}
    
    public void emitirSonido (){
        System.out.print(" y este es mi sonido");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }
    
    public static void main(String[] args) {
        Ave a1 = new Ave("Gaspar", "Gorrion", "Gris");
        Mamifero m1 = new Mamifero("Cali", "Perro", "marron");
        Reptil r1 = new Reptil("Mushu", "Dragon", "rojo");
        a1.identificarAnimal();
        a1.emitirSonido();
        m1.identificarAnimal();
        m1.emitirSonido();
        r1.identificarAnimal();
        r1.emitirSonido();
        System.out.printf("%nAnimalitos con todas sus caracteristicas%n");
        System.out.printf("==========================================%n");
        System.out.println(a1.toString());
        System.out.println(m1.toString());
        System.out.println(r1.toString());
        
        System.out.printf("%n Probando el polimorfismo%n");
        System.out.printf("==========================%n");
        Ave v2 = new Ave("Bubi", "golondrina", "marron");
        Mamifero m2 = new Mamifero("Calili", "perro-persona", "marron");
        Reptil r2 = new Reptil("Comodo", "lagarto", "gris");
        System.out.println(v2.toString());
        System.out.println(m2.toString());
        System.out.println(r2.toString());
       
    }
}
