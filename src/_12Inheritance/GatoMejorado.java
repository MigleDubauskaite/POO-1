
package _12Inheritance;

//CON ESTO PONGO LAS FLECHAS IS A
//los hijos heredan propiedades y métodos
//la propiedad de peso y métodos estan en animal, en el centro de la cebolla
//los constructores no se heredan
public class GatoMejorado extends AnimalMejorado{
   

    public GatoMejorado (double peso){
        //aquí estoy llamando a otro constructor pero en vez de poner this pongo super porque es el padre
        super(peso);
    }
    
    @Override
     public void emitirSonido (){
         //primero coge el emitirSonido del padre AnimalMejorado
         super.emitirSonido();
         System.out.println("Miau!!");
   }
    
    //cuando decimos super. llamamos al padre
    //cuando haciamos this. llamábamos a ese objeto
    @Override
    public void identificar (){
        System.out.print("Soy un GATO MEJORADO");
    }

  
    
}
