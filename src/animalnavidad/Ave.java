
package animalnavidad;


public class Ave extends Animal {
    private boolean enReposo;
    
    //Constructores
    public Ave(String nombre, String especie, String color) {
        super(nombre, especie, color);
    }

    public Ave(boolean enReposo) {
        this.enReposo = true;
    }
    
    //Métodos shows
    @Override
    public void identificarAnimal (){
      super.identificarAnimal();
        System.out.print("ave");
    }
            
    @Override
   public void emitirSonido (){
       super.emitirSonido();
       System.out.println(" PiPiPi");
   }
   //Método
   public boolean volar(){
       if(enReposo){
           enReposo = false;
           return true;
       }
       return false;
   }
    //Main
    public static void main(String[] args) {
        Ave v1 = new Ave("Firulais", "tortola", "gris y blanca");
        Ave v2 = new Ave(true);
        System.out.println(v1.toString());
        System.out.println(v1.volar());
        System.out.println(v2.toString());
        System.out.println(v2.volar());
          
    }
}
