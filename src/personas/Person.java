/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author dubau
 */
public class Person {

    // PROPIEDADES
    private short yearofBirth = 2024;
    private String name;
    private String surname;
    private boolean brokenName;
    private boolean brokenSurname;
    private String color;

    // GETTERS
    public short getYearofBirth() {
        return yearofBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isBrokenName() {
        return brokenName;
    }

    public boolean isBrokenSurname() {
        return brokenSurname;
    }

    // CONSTRUCTORES
    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, short yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearofBirth = yearOfBirth;
    }

    public Person(Person p) {
        name = p.name;
        surname = p.surname;
        yearofBirth = p.yearofBirth;
    }

    // METODOS
    public void show() {
        System.out.printf("Person %S %S de %d años.%n",
                name, surname, yearofBirth);
    }

    // B
    public boolean isBroken() {
        return brokenName || brokenSurname;
    }

    // C
    public boolean changeName(String name, String surname) {

        // se cambia el nombre si cumple condiciones, o sea, si no da error
        // i
        // alfabeto ingles en mayuscula
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'
                    || name.charAt(i) == ' ')) {
            }
        }

        for (int i = 0; i < surname.length(); i++) {
            if (!(surname.charAt(i) >= 'A' && this.surname.charAt(i) <= 'Z' || surname.charAt(i) <= ' ')) {
                return false;
            }
        }

        // ii
        // 1 o 2 palabras
        // 0 o 1 espacios blancos
        name = name.trim();
        surname = surname.trim();
        int contadorDeEspaciosEnBlanco = 0;
        for (int i = 0; i < name.length() && i < surname.length(); i++) {
            if (name.charAt(i) == ' ' && surname.charAt(i) == ' ') {
                contadorDeEspaciosEnBlanco++;
                if (contadorDeEspaciosEnBlanco > 1) {
                    return false;
                }
            }
        }

        // iii
        // longitud no más que 20
        if (name.length() > 20 && surname.length() > 20) {
            return false;
        }

        // iv
        // no puede ser blanco
        if (name.trim().equals("") || surname.trim().equals("")) {
            return false;
        }

        System.out.print("El nombre se ha cambiado: ");
        return true;
    }

}
