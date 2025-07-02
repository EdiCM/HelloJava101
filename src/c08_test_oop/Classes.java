package c08_test_oop;

import c08_oop.Person;

public class Classes {
    // Una clase es un objeto, un molde, una plantilla
    public static void main(String[] args) {
        // Tiene atributos o caracteristicas
        // Y metodos o funciones

        // INSTANCIANDO PERSON EN CLASSES
        Person person = new Person("Edimon", 21, "123456789A"); // con el constructor, al instanciar ya necesitamos pasarle los valores como parametro
        // Un objeto es una instancia de una clase
        // person.name = "Edimon";
        // person.age = 21;

        person.sayHello();

        //person.name = "Ediii";
        //System.out.println(person.name); // si es private, ya no puedo ni acceder fuera de la clase person
        //Person person2 = new Person("Gims", 5);
        //person2.sayHello();

    }
}
// Si haremos una clase, la buena practica es que hagamos un archivo contenedor por cada una
