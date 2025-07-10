package c08_oop;

import java.util.ArrayList;

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        Car car = new Car();
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        Student stud = new Student();
        stud.setName("Edith");
        stud.setAge(21);
        stud.setGrade(90);
        stud.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        Manager employ = new Manager();
        employ.setName("Jose");
        employ.setSalary(1200);
        employ.setDepartment("IT");

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.calculateArea();

        Rectangle rec = new Rectangle();
        rec.setBase(6);
        rec.setHeight(7);
        rec.calculateArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        Eagle eagle = new Eagle();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        Phone phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        SavingsAccount sacc = new SavingsAccount();
        sacc.deposit(45.0);
        sacc.withdraw(20.5);
        sacc.addInterest();
        System.out.println(sacc.getBalance());

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        Vehicle vehicle = new Vehicle();
        Car car2 = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();

        vehicle.describe();
        car2.describe();
        bike.describe();
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for (int i = 0; i < animals.size(); i++) {
            Animal animalIterator = animals.get(i);
            animalIterator.makeSound();
        }
    }

    public static class Vehicle {

        public void move() {
            System.out.println("El vehiculo se mueve...");
        }

        public void describe() { System.out.println("Un metodo de transporte en general"); }
    }

    public static class Car extends Vehicle {

        public void honk() {
            System.out.println("HONK! HONK!");
        }

        @Override
        public void describe() { System.out.println("Una estructura de metal que puede tener diferentes colores, caben 5 personas y te cubre del sol");}
    }

    public static class Bike extends Vehicle {

        @Override
        public void describe() {
            System.out.println("Artefacto de metal con llantas grandes, pueden subirse de 1 a 3 personas y tipicamente no tiene motor, el que lo maneja es el que produce la fuerza cinetica para que avance");
        }
    }

    public static class Truck extends Vehicle {

        @Override
        public void describe() {
            System.out.println("Es parecido al carro, pero no siempre es completamente tapado, a veces tiene un espacio atras abierto y se usa para mover cosas grandes o mas personas");
        }
    }


    public static class Person {

        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static class Student extends Person {

        private int grade;

        public void setGrade(int grade) {

            if (grade >= 0 && grade <= 100) {
                this.grade = grade;
            }
            else {
                System.out.println("Error");
            }
        }

        public int getGrade() {
            return grade;
        }

        public void study() {
            System.out.println("El alumno " + getName() + " de edad " + getAge() + " con promedio " + getGrade() + " estudia.");
        }
    }


    public static class Animal {

        public void makeSound() {
            System.out.println("El animal hace un sonido...");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof woof");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow meow");
        }
    }


    public static class Employee {

        private String name;
        private int salary;

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {

        private String department;

        public void setDepartment(String department) {
            this.department = department;
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


    public static class Bird extends Animal {

        public void fly() {
            System.out.println("Volandooooooo...");
        }

        @Override
        public void makeSound() {
            System.out.println("Keek Keek");
        }
    }

    public static class Eagle extends Bird {

        @Override
        public void fly() {
            super.fly();
            System.out.println("...como un aguila...");
        }
    }


    public static class Device {

        public Device() {
            System.out.println("Device created...");
        }
    }

    public static class Phone extends Device {

        public Phone() {
            System.out.println("Phone created...");
        }
    }


    public static class BankAccount {

        private double balance = 0.0;

        public double getBalance() {

            return balance;
        }
        public void deposit(double amount) {

            if(amount >= 0) {
                balance += amount;
                System.out.println("El monto total en su banco es de: " + balance + ", se depositaron: " + amount + " pesos.");
            }
            else {
                System.out.println("Error, cantidad no valida");
            }
        }

        public void withdraw(double amount) {

            if(amount >= 0 && amount <= balance) {
                balance -= amount;
                System.out.println("El monto total en su banco es de: " + balance + ", se retiraron: " + amount + " pesos.");
            }
            else {
                System.out.println("Error, cantidad no valida");
            }
        }
    }

    public static class SavingsAccount extends BankAccount {

        public void addInterest() {
            System.out.println("Interes agregado...");
        }
    }


}
