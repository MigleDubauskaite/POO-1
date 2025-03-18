package casino;

public class Carta {

    //Propiedades
    private char palos;
    private int numeros;

    //Constructores
    public Carta(char palos, int numeros) {
        this.palos = palosValidos(palos) ? palos : '-';
        this.numeros = numeros < 5 ? 5 : numeros > 20 ? 20 : numeros;
    }

    //metodos privados validaciones
    private static boolean palosValidos(char charPosible) {
        char[] charPredeterminados = {'?', '¿', '&', '¬', '*', '<', '>', '.'};
        for (char d : charPredeterminados) {
            if (d == charPosible) {
                return true;
            }
        }
        return false;
    }

    //Métodos publicos
    @Override
    public String toString() {
        return String.format("La carta de numero %d y palo %c.%n", numeros, palos);
    }

    //sacar una carta
    public String sacarCarta() {
        //Rangos de numeros y palos
        //numeros validos
        int numerosValidos = numeros < 5 ? 5 : numeros > 20 ? 20 : numeros;
        int numeroAleatorio = (int) (numerosValidos * Math.random() + 1);
        //char validos
        char[] charPredeterminados = {'?', '¿', '&', '¬', '*', '<', '>', '.'};
        int indiceAleatorio = (int) (charPredeterminados.length * Math.random());
        char charFinal = ' ';
        charFinal = charPredeterminados[indiceAleatorio];

        return String.format("La carta de numero %d y palo %c%n", numeroAleatorio, charFinal);
    }
   
    
    
            

    //Comprobaciones
    public static void main(String[] args) {
        Carta c1 = new Carta('*', 6);
        System.out.println(c1.toString());
        System.out.printf("Pruebas sacarCarta%n");
        System.out.printf("===================%n");
        Carta c = new Carta('?', 11);
        System.out.println(c.sacarCarta());
        System.out.println(c.sacarCarta());
        System.out.println(c.sacarCarta());

    }

}
