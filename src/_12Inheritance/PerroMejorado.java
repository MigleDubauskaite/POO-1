
package _12Inheritance;


public class PerroMejorado extends AnimalMejorado{
    

    public PerroMejorado(double peso) {
        super (peso);
    }
    
    @Override
     public void emitirSonido (){
         super.emitirSonido();
         System.out.println("Guau!!");
   }
     
    public void identificar (){
        System.out.print("Soy un PERRO MEJORADO");
    }

    
}
