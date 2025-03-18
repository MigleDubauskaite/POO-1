
package animalnavidad;


public class Mamifero extends Animal{
    private boolean quieto;
    
    //Constructores
    public Mamifero(String nombre, String especie, String color) {
        super(nombre, especie, color);
        quieto = true;
    }

    public Mamifero(boolean quieto) {
        this.quieto = true;
    }
    
    //Métodos shows
    @Override
    public void identificarAnimal (){
        super.identificarAnimal();
        System.out.print("mamifero");
    }
    
    @Override
    public void emitirSonido (){
        super.emitirSonido();
        System.out.println(" Raugh");
    }
    
    //Métodos
    //Método empezarAndar
    public boolean empezarAndar (){
        if(quieto){
            quieto = false;
            return true;
        }
        return false;
    }
    //Metodo detenerse
    public boolean detenerse (){
        //vida real
        //Si esta quieto el método no se aplica y retorna false
        if(quieto){
            //detenerse no se aplicó
            return false;
        }
        //vida real
        //Sino esta quieto, quieto = true y lo detengo
        quieto = true;
        return true;   
    }
    
    //Main
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero("Carlos", "ratita", "gris");
        Mamifero m2 = new Mamifero("Marikilla", "Conejo", "blanco");
        System.out.printf("Metodo empezar a andar m1%n");
        System.out.printf("======================%n");
        System.out.printf("%s%n", m1.empezarAndar()? "Esta andando" : "Esta quieto");
        System.out.printf("%nMetodo detenerse m1%n");
        System.out.printf("=====================%n");
        System.out.printf("%s%n", m1.detenerse() ? "Se ha parado" : "Ya estaba parado");
        System.out.printf("%nMetodo detenerse m2%n");
        System.out.printf("=====================%n");
        System.out.printf("%s%n", m2.detenerse() ? "Se ha parado" : "Ya estaba quieto");
        
    }
    
}
