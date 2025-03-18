
package _12Inheritance;

//al poner abstract no puedo crear una instancia con animal
//ponemos abstract porque un animal es una clase abstracta necesita ser algo como gato o perro
public  abstract class AnimalMejorado {
    
    private double peso;

    public AnimalMejorado(double peso) {
        this.peso = peso;
    }
    
    
    public void identificar (){
        System.out.print("Soy un ANIMAL MEJORADO");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
      public void emitirSonido (){
         System.out.print("Ahi va el sonido: ");
   }
     
}
