
package vehiculosnavidad;


public class Moto extends Vehiculo {
    private String matricula;
    private boolean enCaballito = false;

    public Moto(String matricula) {
        this.matricula = Matricula.matriculaValida(matricula)? matricula.toUpperCase() : "ABCD1234";
    }
    
    public boolean hacerCaballito (){
        if(enCaballito){
            return false;
        }
        enCaballito = true;
        return true;
    }
    public boolean terminarCaballito (){
        if(enCaballito){
            enCaballito = false;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString (){
        String salida = String.format("Moto con matricula: %s", matricula);
        return salida;
    }
    
    public static void main(String[] args) {
        Moto m1 = new Moto("kiku12");
        Moto m2 = new Moto("mimo1298");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.printf("%nHacer caballito%n");
        System.out.println(m1.hacerCaballito());
        System.out.println(m2.hacerCaballito());
        System.out.printf("%nTerminar caballito%n");
        System.out.println(m1.terminarCaballito());
        System.out.println(m2.terminarCaballito());
    }
   
}
