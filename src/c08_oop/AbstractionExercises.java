package c08_oop;

import java.util.ArrayList;

public class AbstractionExercises {

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.calculateArea();

        Rectangle rec = new Rectangle();
        rec.setBase(4);
        rec.setHeight(6);
        rec.calculateArea();

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Dog());
        animales.add(new Cat());

        for(Animal animal: animales) {
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        circle.draw();
        rec.draw();

        Triangle tria = new Triangle();
        tria.draw();

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        FullEmployee femploy = new FullEmployee(1200, 200);
        femploy.calculateSalary();

        PartTimeEmployee parploy = new PartTimeEmployee(1200);
        parploy.calculateSalary();

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        Car car = new Car();
        car.move();

        Robot robot = new Robot();
        robot.move();

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        WashingMachine washM = new WashingMachine();
        washM.turnOn();
        washM.turnOff();

        TV tv = new TV();
        tv.turnOff();
        tv.turnOn();

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        Duck ducky = new Duck();
        ducky.fly();
        ducky.swim();

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        PDFDocument pdf = new PDFDocument();
        WordDocument word = new WordDocument();
        pdf.print();
        word.print();

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        Invoice in = new Invoice();
        in.pay();

        EmployeePayment ep = new EmployeePayment();
        ep.pay();
    }

    public static abstract class Shape {

        public abstract void calculateArea();
    }

    public static class Circle extends Shape implements Drawable {

        private double radius;

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            System.out.println(Math.PI * (radius * radius));
        }

        @Override
        public void draw() {
            System.out.println("Toma una tapadera de un frasco y traza su figura con un lapiz en una hoja");
        }
    }

    public static class Rectangle extends Shape implements Drawable {

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

        @Override
        public void draw() {
            System.out.println("Dibuja dos lineas paralelas verticales con espacio entre ambas, y luego une esas dos lineas con otras 2 lineas paraleras pero ahora horizontales");
        }
    }


    public interface Playable {

        void play();
    }

    public static class Guitar implements Playable {

        @Override
        public void play() {
            System.out.println("Tocando la guitarra...");
        }
    }

    public static class Piano implements Playable{

        @Override
        public void play() {
            System.out.println("Tocando el piano...");
        }
    }


    public abstract static class Animal {

        public void makeSound() {
            System.out.println("Un animal hace un sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("El perro hace guau guau");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("El gato hace miau miau");
        }
    }


    public interface Drawable {

        void draw();
    }

    public static class Triangle implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibuja dos lineas que se conecten solo de un lado, algo asi como el techo de una casita, y al final dibujale otra linea en la base conectandolas.");
        }
    }


    public abstract static class Employee {
        private final int baseSalary;

        public Employee(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        // Método abstracto que cada subclase debe implementar
        public abstract void calculateSalary();
    }

    public static class FullEmployee extends Employee {
        private final int bonus;

        public FullEmployee(int baseSalary, int bonus) {
            super(baseSalary);  // Pasar el salario base al constructor padre
            this.bonus = bonus;
        }

        @Override
        public void calculateSalary() {
            int totalSalary = getBaseSalary() + bonus;
            System.out.println("El salario total es: " + totalSalary);
        }
    }

    public static class PartTimeEmployee extends Employee {
        public PartTimeEmployee(int baseSalary) {
            super(baseSalary);
        }

        @Override
        public void calculateSalary() {
            int partTimeSalary = getBaseSalary() / 2;
            System.out.println("El salario de medio tiempo es: " + partTimeSalary);
        }
    }


    public interface Movable {

        void move();
    }

    public static class Car implements Movable {

        @Override
        public void move() {
            System.out.println("Run run");
        }
    }

    public static class Robot implements Movable {

        @Override
        public void move() {
            System.out.println("Birp borkmp bip");
        }
    }


    public abstract static class Appliance {

        public abstract void turnOn();

        public abstract void turnOff();

    }

    public static class WashingMachine extends Appliance {

        @Override
        public void turnOn() {
            System.out.println("Encendiendo lavadora");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando lavadora");
        }
    }

    public static class TV extends Appliance {

        @Override
        public void turnOn() {
            System.out.println("Encendiendo television");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando television");
        }
    }


    public interface Swimmable {

        void swim();
    }

    public interface Flyable {

        void fly();
    }

    public static class Duck implements Swimmable, Flyable {

        @Override
        public void swim() {
            System.out.println("El pato nada");
        }

        @Override
        public void fly() {
            System.out.println("El pato vuela");
        }
    }


    public static abstract class Document {

        public abstract void print();

    }

    public static class PDFDocument extends Document {

        @Override
        public void print() {
            System.out.println("Imprimiendo documento pdf...");
        }
    }

    public static class WordDocument extends Document {

        @Override
        public void print() {
            System.out.println("Imprimiendo documento de word...");
        }

    }


    public interface Payable {

        void pay();
    }

    public static class Invoice implements Payable{

        @Override
        public void pay() {
            System.out.println("Pagando invoice");
        }

    }

    public static class EmployeePayment implements Payable{

        @Override
        public void pay() {
            System.out.println("Pagando al empleado");
        }
    }



}
