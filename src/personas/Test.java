/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author dubau
 */
public class Test {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Migle", "Dubauskaite");
        Person p3 = new Person("Ugne", "Dubauskaite", (short) 2004);
        Person p4 = new Person(p3);
        System.out.println("EL MÉTODO SHOW");
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••");
        Person[] personas = {p1, p2, p3, p4};
        for (Person p : personas) {
            p.show();
        }
        System.out.println();
        
        System.out.println("METODO CHANGE NAME");
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••");
        Person p5 = new Person("Migle", "Dubauskaite");
        p5.show();
        System.out.println(p5.changeName("VILTE", "DUB"));
        p5.show();
    }
    
}
