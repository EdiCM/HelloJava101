package c08_oop;

public class Abstraction {

    public static void main(String[] args) {

        /*
         Abstraccion: ocultar implementacion y mostrar solo lo esencial
         Animal animal = new Animal();
         animal.sleep();
         ANIMAL ES ABSTRACTO, NOOOO SE PUEDE INSTANCIAR, solo define pero no se usa
         el concepto animal objeto no es instanciable
        */

        Dog dog = new Dog();
        dog.sleep();

        Cat cat = new Cat();
        cat.sleep();

        dog.sound();
        cat.sound();

        Bat bat = new Bat();
        Bird birdie = new Bird();

        birdie.fly();
        bat.fly();

        /*
         Hay otro tipo de abstraccion llamada Interfacew
         Esto no es ya una clase, sino que definimos nada mas los metodos declarados, pero sin implementacion
        */

    }
    // la clase abstracta tiene metodos, pero tiene la deficion de ser abstracta
    // cual es la diferencia? genera metodos, funciones, con implementacion normales pero
    // que si nosotros queremos, no la tengan...

    public static abstract class Animal {
        /*
         tambien puedo definir metodos sin implementacion como ventaja del abstract
         pero si hacemos eso, ahora debemos implementar los metodos faltantes en las demas clases, que es sound
         pero puede tener atributos y otras cosas como cualquier otra clase
        */
        public abstract void sound();

        public void sleep() {
            System.out.println("zZZzzZzZzz");
        }
    }

    public static class Dog extends Animal {

        @Override                             // aqui combinamos 3 cosas, polimorfismo sobrecarga, herencia
        public void sleep() {                 // y abstraccion c:
            System.out.println("so;ando con perseguir un gato");
        }

        @Override
        public void sound() {
            System.out.println("Guau guau");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("miau miau");
        }
    }

    /*
     INTERFACE
     no tiene sentido que haga esto en animal porque no todos los animales vuelan, y no
     serviria de nada implementarlo ahi, quiero que sean animales mas el extra de la
     interfaz volar

     en interface no podrian hacer atributos pero tal vez si constantes
    */

    public interface Flying {

        void fly();
    }

    public interface Flying2 {
        void fly2();
    }

    public static class Bat extends Animal implements Flying, Flying2 {

        @Override
        public void sound() {
            System.out.println("kirk kirk");
        }

        @Override
        public void fly() {
            System.out.println("flying");
        }

        @Override
        public void fly2() {

        }
    }
    // AUNQUE LA herencia solo es de 1 nivel, la interfaz puede ser de muchas
    public static class Bird extends Animal implements Flying, Flying2 {

        @Override
        public void sound() {
            System.out.println("pio pio");
        }

       // debemos implementar el metodo fly de flying, si o si
        @Override
        public void fly() {
            System.out.println("volando");
        }

        @Override
        public void fly2() {

        }
    }

    /*
    USO clase abstracta cuando hay que compartir codigo comun, como sleep
    Y USO interfaz cuando tengo un contrato de comportamiento para ciertos objetos
     */

}
