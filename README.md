# POO1 - PROGRAMACIÓN ORIENTADA A OBJETOS: PARTE 1

![imagen de POO1](https://res.cloudinary.com/pym/image/upload/c_scale,f_auto,q_auto,w_1200/v1/series/fundamentos-java-poo)

## Introducción
Este repositorio está diseñado para aquellos que están aprendiendo Programación Orientada a Objetos (POO) en Java. En este apartado, exploraremos los conceptos fundamentales de la POO, incluyendo **clases**, **objetos**, **métodos**, y el uso de la **clase String**.

Para ejecutar los ejemplos, necesitarás tener instalada la versión **Java 8** y **NetBeans 13** en tu equipo, herramientas que nos permitirán desarrollar y ejecutar código Java de manera eficiente.

Si aún no tienes Java 8 y NetBeans 13, puedes descargarlos desde los siguientes enlaces:
* [Descargar Java 8](https://www.oracle.com/java/technologies/downloads/#java8)
* [Descargar NetBeans 13](https://netbeans.apache.org/front/main/download/index.html)

## Requisitos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:
* **Java 8**: Es necesario para compilar y ejecutar código en Java.
* **NetBeans 13**: Un IDE que facilita la programación en Java, ofreciendo herramientas útiles como depuración, autocompletado y gestión de proyectos.


## ¿Qué es POO1?

En POO1, aprenderás los fundamentos de la Programación Orientada a Objetos (POO), que es un paradigma que organiza el software en objetos que contienen tanto datos como métodos que operan sobre esos datos. En este apartado, te familiarizarás con los siguientes conceptos:

1. **Clases**: Plantillas o planos para crear objetos. En Java, las clases definen las propiedades y comportamientos de los objetos.

2. **Objetos**: Instancias de clases, que tienen valores específicos para sus propiedades y pueden ejecutar métodos.

3. **Métodos**: Funciones dentro de una clase que definen comportamientos de los objetos.


## Temas Cubiertos

### - 1. Modelado de Objetos
Se aprenderá a definir clases con propiedades (atributos) y métodos que representen acciones y estados de los objetos. Esto incluye:
* Declaración de variables de instancia (atributos) para almacenar información.
* Creación de constructores para inicializar objetos.
* Implementación de métodos para definir comportamientos.
* Uso de encapsulamiento para proteger los datos y controlar el acceso a ellos mediante modificadores de acceso como private, public y protected.

### - 2. Métodos de la clase String
En este apartado se abordan los métodos más utilizados de la clase String en Java, los cuales permiten manipular cadenas de texto de manera sencilla y eficiente. Algunos de los métodos clave que se han visto incluyen:

- **.length()**: Devuelve el número de caracteres de la cadena.
- **.charAt(int i)**: Devuelve el carácter en la posición especificada.
- **.trim()**: Elimina los espacios en blanco al principio y al final de la cadena.
- **.split("")**: Divide la cadena en un array de caracteres.
- **.toLowerCase()**: Convierte todos los caracteres de la cadena a minúsculas.
- **.toUpperCase()**: Convierte todos los caracteres de la cadena a mayúsculas.
- **.equals(Object Obj)**: Compara dos cadenas para ver si son iguales.
- **.equalsIgnoreCase(String str)**: Compara dos cadenas ignorando las diferencias de mayúsculas y minúsculas.
- **.startsWith(String prefix)**: Comprueba si la cadena comienza con el prefijo dado.
- **.endsWith(String suffix)**: Comprueba si la cadena termina con el sufijo dado.
- **.contains(CharSequence charSeq)**: Verifica si la cadena contiene una secuencia de caracteres dada.
- **.substring(int beginIndex)**: Devuelve una subcadena comenzando en el índice especificado hasta el final.
- **.substring(int beginIndex, int endIndex)**: Devuelve una subcadena desde el índice de inicio hasta el índice final (sin incluirlo).
- **.replace(char oldChar, char newChar)**: Reemplaza un carácter por otro en la cadena.
- **.replace(CharSequence target, CharSequence replacement)**: Reemplaza una secuencia de caracteres por otra.
- **.indexOf(int ch)**: Devuelve el índice de la primera aparición de un carácter.

## Ejemplo

```java
public class Person {

    // PROPIEDADES
    private short yearofBirth = 2024;
    private String name;
    private String surname;
    private boolean brokenName;
    private boolean brokenSurname;
    private String color;

    // GETTER
    public short getYearofBirth() {
        return yearofBirth;
    }

    // SETTER

    public boolean isBrokenName() {
        return brokenName;
    }

    // CONSTRUCTORES

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

    public boolean isBroken() {
        return brokenName || brokenSurname;
    }

    public boolean changeName(String name, String surname) {

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

        // longitud no más que 20
        if (name.length() > 20 && surname.length() > 20) {
            return false;
        }

        // no puede ser blanco
        if (name.trim().equals("") || surname.trim().equals("")) {
            return false;
        }

        System.out.print("El nombre se ha cambiado: ");
        return true;
    }
}
```

***
## Recursos Adicionales

![image](https://github.com/user-attachments/assets/53a6fcdb-a9b9-484e-a289-447ea763fdf9)

[Mis apuntes de clases de java](https://docs.google.com/document/d/1UQKqXJs8Lfmtzleo0wHB9RxlRbQ_zkJz3XWycYPm5ko/edit?usp=sharing)

[Youtube: POO](https://www.youtube.com/watch?v=SI7O81GMG2A&t=23s)
