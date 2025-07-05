package c08_oop;

public class Polymorphism {

    public static void main(String[] args) {

        /*
         Polimorfismo: permitir que diferentes objetos respondan de manera diferente a la misma funcion
         Hay 2 tipos:
            - por herencia (sobreescritura): redefinir un metodo de la clase padre en la clase hija
        */
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
        /*
        - por sobrecarga (sobrecarga de metodos): definir varios metodos con el mismo nombre PERO con parametros diferentes
         El programa sabe cuando llamar a cada tipo de sum
         Esto sirve cuando
         */
        Calculator calc = new Calculator();
        System.out.println(calc.sum(12.3, 12.2));
        System.out.println(calc.sum(5, 4));
        System.out.println(calc.sum(5, 4, 2));
    }
    // POR HERENCIA

    public static class Animal { // se le pone static si esta en el mismo archivo que el main

        public void sound() {
            System.out.println("Algun sonido");
        }
    }

    public static class Dog extends Animal { // Ya tengo dos clases con el mismo nombre
        // polimorfismo por herencia: redefini sound, y habia sido heredado por animal
        // no uso super, porque eso significaria que uso el del padre.
        // lo sobreescribo
        @Override
        public void sound() {
            System.out.println("Guauf!");
        }
    }
    // --------------------------------------------------------------------------------------
    // POR SOBRECARGA
    public static class Calculator {

        public int sum(int a, int b) {
            return a + b;
        }

        public double sum(double a, double b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }
    }
}
