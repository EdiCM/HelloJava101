package c08_oop;

import java.util.ArrayList;

public class PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Animal[] animals = { cat, dog, cow };

        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        Circle circle = new Circle();
        circle.setRadius(3);
        Rectangle rec1 = new Rectangle();
        rec1.setBase(2);
        rec1.setHeight(4);
        Rectangle rec2 = new Rectangle();
        rec2.setBase(4);
        rec2.setHeight(5);

        Shape[] shapes = { circle, rec1, rec2 };

        for (Shape shapesList : shapes) {
            shapesList.calculateArea();
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        Printer printer = new Printer();
        printer.print(35);
        printer.print("Salma");
        printer.print(99.99);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Saul");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicleIterator : vehicles) {
            vehicleIterator.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        Notification n = new Notification();
        n.setName("ABC123");
        SMSNotification sms = new SMSNotification();
        EmailNotification emailN = new EmailNotification();
        sms.sendNotification(n);
        emailN.sendNotification(n);

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        Horse horse = new Horse();
        dog.setType("perrito");
        cat.setType("gatito");
        cow.setType("vaquita");
        horse.setType("caballito");

        dog.showAnimalType(dog);
        cat.showAnimalType(cat);
        cow.showAnimalType(cow);
        horse.showAnimalType(horse);

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        Converter converter = new Converter();
        converter.convert(20);
        converter.convert(20.5);
        converter.convert("veinte");

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        Book book = new Book();
        Electronic electronic = new Electronic();

        Product[] products = { book, electronic };

        for (Product productsIterator : products) {
            productsIterator.getPrice();
        }
        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();
        Character[] characters = {warrior, mage, archer};

        for (Character charac: characters) {
            charac.attack();
        }
    }

    public static class Animal {

        private String type;

        public void setType(String type) {
                this.type = type;
        }

        public String getType() {
            return type;
        }

        public void makeSound() {
            System.out.println("Este es un sonido de un animal");
        }

        public void showAnimalType(Animal animal) {
            System.out.println("El animal es un " + animal.getType() );
        }
    }

    public static class Dog extends Animal {

        @Override
        public void setType(String type) {
            super.setType("descendiente del lobo: " + type);
        }

        @Override
        public void makeSound() {
            System.out.println("guauf guauf");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void setType(String type) {
            super.setType("familiar de los tigres: " + type);
        }

        @Override
        public void makeSound() {
            System.out.println("Meow meow");
        }
    }

    public static class Cow extends Animal {

        @Override
        public void setType(String type) {
            super.setType("productor de leche: " + type);
        }

        @Override
        public void makeSound() {
            System.out.println("Moo moo");
        }
    }

    public static class Horse extends Animal {

        @Override
        public void setType(String type) {
            super.setType("metodo de transporte: " + type);
        }
    }


    public static abstract class Shape {

        public abstract void calculateArea();
    }

    public static class Circle extends Shape {

        private double radius;

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            System.out.println(Math.PI * (radius * radius));
        }

    }

    public static class Rectangle extends Shape {

        private int base;
        private int height;

        public void setBase(int base) {
            this.base = base;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public void calculateArea() {
            System.out.println(base * height);
        }

    }


    public static class Printer {

        public void print(int a) {
            System.out.println("Lo que se imprime es " + a);
        }

        public void print(String name) {
            System.out.println("Lo que se imprime es " + name);
        }

        public void print(double aa) {
            System.out.println("Lo que se imprime es " + aa);
        }
    }

    public static class Greeter {

        public void greet() {
            System.out.println("Hellooooo");
        }

        public void greet(String name) {
            System.out.println("Hellooooo " + name);
        }
    }


    public static class Vehicle {

        public void start() {
            System.out.println("El vehiculo enciende y hace un sonido");
        }
    }

    public static class Car extends Vehicle {

        @Override
        public void start() {
            System.out.println("El carro hace run run");
        }
    }

    public static class Bike extends Vehicle {

        @Override
        public void start() {
            System.out.println("La bici hace prinn prinn");
        }
    }

    public static class Truck extends Vehicle {

        @Override
        public void start() {
            System.out.println("La camioneta hace frrrrum frrrrum");
        }
    }


    public static class Notification {

        private String name;

        public void send() {
            System.out.println("La notificacion se ha enviado");
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class EmailNotification extends Notification {

        public void sendNotification(Notification n) {
            System.out.println("La notificacion de email que tengo es de nombre: " + n.name);
        }
    }

    public static class SMSNotification extends Notification {

        public void sendNotification(Notification n) {
            System.out.println("La notificacion sms que tengo es de nombre: " + n.name);
        }
    }


    public static class Converter {

        public void convert(int a) {
            System.out.println("Convirtiendo el ENTERO " + a);
        }

        public void convert(double a) {
            System.out.println("Convirtiendo el FLOTANTE " + a);
        }

        public void convert(String a) {
            System.out.println("Convirtiendo la CADENA " + a);
        }
    }


    public static class Product {

        protected int price = 1000;

        public void getPrice() {
            System.out.println("El precio de la chamarra es de " + price);
        }
    }

    public static class Book extends Product {

        @Override
        public void getPrice() {
            System.out.println("El precio de la chamarra es de " + (price - price * 0.10));
        }
    }

    public static class Electronic extends Product {

        @Override
        public void getPrice() {
            System.out.println("El precio de la chamarra es de " + (price - price * 0.20));
        }
    }


    public static class Character {

        private String specialAttack;

        public void setSpecialAttack(String attack) {
            this.specialAttack = attack;
        }

        public String getSpecialAttack() {
            return specialAttack;
        }

        public void attack() {
            System.out.println("El ataque especial es: " + getSpecialAttack());
        }
    }

    public static class Warrior extends Character {

        public Warrior() {
            setSpecialAttack("Espadazo devastador");
        }

        @Override
        public void attack() {
            System.out.println("El guerrero ataca con " + getSpecialAttack());
        }
    }

    public static class Archer extends Character {

        public Archer() {
            setSpecialAttack("Flechazo mortal"); // Ataque por defecto del Guerrero
        }

        @Override
        public void attack() {
            System.out.println("El arquero ataca con " + getSpecialAttack());
        }
    }

    public static class Mage extends Character {

        public Mage() {
            setSpecialAttack("Bola de fuego infernal"); // Ataque por defecto del Guerrero
        }

        @Override
        public void attack() {
            System.out.println("El mago ataca con " + getSpecialAttack());
        }
    }


}
