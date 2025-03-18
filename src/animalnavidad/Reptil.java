
package animalnavidad;

public class Reptil extends Animal{
    private int velocidad;

    public Reptil(String nombre, String especie, String color) {
        super(nombre, especie, color);
    }
    
    public Reptil (int velocidad){
        this.velocidad = velocidad < 0 ? 0 : velocidad;
    }
    //Método empezarAndar
    public int empezarAndar (){
        return velocidad = 1;
    }
    
    //método correr
    public int correr(int velocidadCarrera){
        if(velocidad < velocidadCarrera){
           return velocidad += velocidadCarrera;
        }
        return velocidad;
    }
    
    //método frenar
    public int frenar (int velocidadFrenado){
        if(velocidad >= velocidadFrenado){
           return velocidad -= velocidadFrenado;
        }
        return velocidad; 
    }
    
    @Override
    public void identificarAnimal (){
        super.identificarAnimal();
        System.out.print("reptil");
    }
    @Override
    public void emitirSonido (){
        super.emitirSonido();
        System.out.println(" Pssss");
    }
    
    public static void main(String[] args) {
        Reptil r1 = new Reptil(0);
        System.out.printf("Empezar a andar%n");
        System.out.printf("===============%n");
        System.out.println(r1.empezarAndar());
        System.out.printf("%nEmpezar correr%n");
        System.out.printf("===============%n");
        System.out.println(r1.correr(20));
        System.out.println(r1.correr(30));
        System.out.printf("%nFrenar%n");
        System.out.printf("=======%n");
        System.out.println(r1.frenar(20));
        System.out.println(r1.frenar(32));
        
        
        
    }
}
