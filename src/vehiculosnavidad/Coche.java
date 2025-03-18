
package vehiculosnavidad;


public class Coche extends Vehiculo{
    private String matricula;
    private boolean cocheAbierto;
    

    public Coche(String matricula) {
        this.matricula = Matricula.matriculaValida(matricula)? matricula.toUpperCase() : "ABCD1234";
    }
    
    
    @Override
    public String toString (){
        String salida = String.format("Coche con matricula: %s", matricula);
        return salida;
    }
    
    //método para abrir puertas. Si abre las puertas que devuelva true, si ya estaban abiertas que devuelva false.
    public boolean abrirPuertas (){
        if(cocheAbierto){
            return false;
        }
        cocheAbierto = true;
        return true;
    }
    
    public static void main(String[] args) {
        Coche c1 = new Coche("jose1234");
        Coche c2 = new Coche("Lola9876");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.printf("%nAbrir el coche%n");
        System.out.println(c1.abrirPuertas());
        
        
        
    }
    
}
