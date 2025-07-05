package c08_oop;
 /*
 PODEMOS CONCATENAR HERENCIAS, pero en realidad java en si solo permite la herencia simple
 o sea solo una clase por padre
*/

public class Inheritance {
// HERENCIA: "es un"
    public static void main(String[] args) {

        // La herencia es heredar/reutilizar atributos y metodos de una clase a otra
        Animal animal = new Animal("Goofy");
        // animal.name = "Goofy";
        animal.eat();

        Dog dog = new Dog("Gims", 3); // como lo especialice, tambien debo meterle la edad tambien
        // dog.name = "Gims";
        dog.eat();

        Cat cat = new Cat("Ali");
        // cat.name = "Ali";
        cat.eat();
        // cat.fly(); No funciona porque no se le ha asignado

        Bird bird = new Bird("Beep");
        // bird.name = "Beep"; esto seguiria funcionando si sigue siendo default o public como esta ahorita, pero como no quiero que se pueda lo pondre privado por ejemplo
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }
        public void eat() {
            System.out.println("El animal con nombre: " + name + " come, ñam ñam");
        }

    }

    public static class Dog extends Animal {
        int age;
        public Dog(String name, int age) {
            // this.name = name; ESTO ESTA MAL, es redundante, debemos llamar a super para que cumple el constructor de la clase
            // tampoco puedo usar override, porque no se puede aplicar al constructor unico que debe cumplirse
            super(name); // esto si funciona
            this.age = age; // aqui especializo mi constructor

        }

        // como perro tambien tendra nombre y metodo comer, pues no tiene caso reutilizar codigo
        // entonces LE HEREDAMOS la clase Animal

    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        // Ademas de ESPECIALIZAR, podemos modificarle tambien cosas
        @Override
        public void eat() {
            // El override identifica que estamos sobreescribiendo, es para indicar nada mas pero no hace mucha falta aunque es buena practica
            // super.eat(); el super alude a la super clase, al padre, a Animal, puede usarse para constructores, metodos o atributos para hacer referencia
            // a la super clase
            System.out.println("El gatito con nombre: " + name + " come, ñam ñam");
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        // Ademas de reutilizar, podemos ESPECIALIZAR el comportamiento de cada animal
        public void fly() {
            System.out.println("*Sonidos de avion*");
        }
    }
}
