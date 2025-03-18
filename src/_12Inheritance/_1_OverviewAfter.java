package _12Inheritance;

public class _1_OverviewAfter {

    public static void main(String[] args) {
        //AnimalMejorado a = new AnimalMejorado(250); Esto no se puede con la palabra "abstract"
        GatoMejorado[] gatitos = {
            new GatoMejorado(6),
            new GatoMejorado(9),
            new GatoMejorado(3.5)
        };
        System.out.printf("Array de gatitos%n");
        System.out.printf("=================%n");
        for (GatoMejorado gatito : gatitos) {
            gatito.emitirSonido();
            
        }
        PerroMejorado[] perritos = {
            new PerroMejorado(14.5),
            new PerroMejorado(40.5),
            new PerroMejorado(12)
        };
        
        System.out.printf("%nArray de perritos%n");
        System.out.printf("==================%n");
        for (PerroMejorado perrito : perritos) {
            perrito.emitirSonido();
        }
        
        System.out.printf("%nArray de animalitos%n");
        System.out.printf("====================%n");
        AnimalMejorado [] animalitos = {
            new GatoMejorado(14.5),
            new PerroMejorado(40.5),
            new PerroMejorado(12)
        };
        for (AnimalMejorado animalito : animalitos) {
            animalito.emitirSonido();
            
        }

      /*  //Un instancia --> Aqui vemos la parte animal de gato, apuntamos al centro de la cebolla
        AnimalMejorado x = g;

        //Animal no puedo hacerlo con abstract
        //a.identificar();
        //System.out.printf(" y peso %.2f Kg.%n", a.getPeso());
        //gato
        g.identificar();
        System.out.printf(" y peso %.2f Kg.%n", g.getPeso());
        g.emitirSonido();

        //perro
        p.identificar();
        System.out.printf(" y peso %.2f Kg.%n", p.getPeso());
        p.emitirSonido();]*/

    }
}
