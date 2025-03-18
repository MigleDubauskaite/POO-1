/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misfiguras;

/**
 *
 * @author manana
 */
public class MiPrograma {
    
    //LO SOLICITADO EN EL EJERCICIO
    public void test () {
           //En el método no static se crean las pruebas a realizar:
           
           Cuadrado c = new Cuadrado ();
           System.out.println(c);
        }
    
    public static void main(String[] args) {
        
        //En el método main llamar al método test para hacer las pruebas. 
       
       Cuadrado c0 = new Cuadrado(1); 
       Cuadrado c1 = new Cuadrado(2);
       Cuadrado c2 = new Cuadrado(3); 
       Cuadrado c3 = new Cuadrado(4);
       Cuadrado c4 = new Cuadrado(5);
       Cuadrado c5 = new Cuadrado(6);
       Cuadrado c6 = new Cuadrado(7);
       Cuadrado c7 = new Cuadrado(8); 
       Cuadrado c8 = new Cuadrado(9);
       Cuadrado c9 = new Cuadrado(10);
       
       Rectangulo r0 = new Rectangulo(1, 2);
       Rectangulo r1 = new Rectangulo(3, 4);
       Rectangulo r2 = new Rectangulo(4, 5);
       Rectangulo r3 = new Rectangulo(5, 6);
       Rectangulo r4 = new Rectangulo(6, 7);
       Rectangulo r5 = new Rectangulo(7, 8);
       Rectangulo r6 = new Rectangulo(8, 9);
       Rectangulo r7 = new Rectangulo(9, 10);
       Rectangulo r8 = new Rectangulo(10, 11);
       Rectangulo r9 = new Rectangulo(11, 12);
       
       Circulo ci0 = new Circulo(1);
       Circulo ci1 = new Circulo(2);
       Circulo ci2 = new Circulo(3);
       Circulo ci3 = new Circulo(4);
       Circulo ci4 = new Circulo(5);
       Circulo ci5 = new Circulo(6);
       Circulo ci6 = new Circulo(7);
       Circulo ci7 = new Circulo(8);
       Circulo ci8 = new Circulo(9);
       Circulo ci9 = new Circulo(10);
       
       
       Figura [] figuras = {c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, r0, r1, 
                            r2, r3, r4, r5, r6, r7, r8, r9,
                            ci0, ci1, ci2, ci3, ci4, ci5, ci6, ci7, c8, ci9};
       
       double sumaPerimetrosCuadrados = 0;
       int contadorCuadrados = 0;
       
        for (Figura f : figuras) {
            if(f instanceof Cuadrado){
                sumaPerimetrosCuadrados += f.perimetro();
                contadorCuadrados++;
            }
            
        }
        
        double mediaPerimetrosCuadrados = sumaPerimetrosCuadrados / contadorCuadrados;
        System.out.printf("Media de los perímetros de los cuadrados: %.2f.%n", mediaPerimetrosCuadrados);
        
        for (Figura f : figuras) {
            if(f instanceof Cuadrado){
               if(f.perimetro() > mediaPerimetrosCuadrados){
                System.out.println(f);
                } 
            }
            
        }
        
    }
    
    /*PRUEBAS INICIALES    
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado(5);
        Cuadrado c3 = new Cuadrado(5, "azul");
        Cuadrado c4 = new Cuadrado(5, "magenta");
        
        Rectangulo r1 = new Rectangulo(2, 5);
        
        Circulo ci1 = new Circulo(5);
        
        System.out.println(c1.perimetro());
        System.out.println(c1.area());
        System.out.println(c1.sameArea(c2));
        System.out.println(c2.sameArea(c3));
        
        
        System.out.println();
        System.out.println("Explicación toString");
        System.out.println(c1); //Este y el toString imprimirán lo mismo
        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        System.out.println(r1.toString());
        System.out.println(ci1.toString());
        
        Figuras f1 = new Cuadrado();
       
        System.out.println(f1);
        c1.pintar("rojo");
        System.out.println(c1);
    ]*/
        
    
}
