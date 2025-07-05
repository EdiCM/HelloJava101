package c08_oop;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        Book book1 = new Book("eee", "Edimon4884");
        book1.nameAndPerson();
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog dog1 = new Dog("Fido");
        dog1.Bark();
        // 3. Añade un constructor a la clase Book que reciba title y author.
        // YA
        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car car1 = new Car("Volvo", "EX90");
        car1.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Student student1 = new Student("Edith", 67);
        student1.getNote();
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount bank1 = new BankAccount(56);
        bank1.deposit();
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rec1 = new Rectangle(12, 3);
        rec1.perimeter();
        rec1.area();
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker work = new Worker("Jose", 1200);
        work.money();
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Edith", 21, "12345A"));
        people.add(new Person("Andy", 20, "12345B"));
        people.add(new Person("Gims", 5, "12345C"));
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product product1 = new Product("Leche", 30);
        product1.discount();
    }
    public static class BankAccount {
        private int balance;
        private int card = 345;

        public BankAccount(int balance) {
            this.setBalance(balance);
        }

        public void deposit() {

            card += balance;
            System.out.println("El monto total en su banco es de: " + card + ", se depositaron: " + balance + " pesos.");
        }

        public void setBalance(int balance) {

            if (ValidationUtils.isValidNumber(balance)) {
                this.balance = balance;
            }
            else {
                System.out.println("El dato no es valido");
            }
        }
    }

    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.setTitle(title);
            this.setAuthor(author);
        }

        public void nameAndPerson() {
            System.out.println("El libro con nombre: " + title + " fue escrito por: " + author + ".");
        }

        public void setTitle(String title) {
            if (ValidationUtils.isValidString(title)) {
                this.title = title;
            }
            else {
                System.out.println("El dato no es valido");
            }
        }

        public void setAuthor(String author) {

            if (ValidationUtils.isValidString(author)) {
                this.author = author;
            }
            else {
                System.out.println("La edad no es valida");
            }
        }
    }

    public static class Dog {
        private String name;

        public Dog(String name) {
            this.setName(name);
        }

        public void setName(String name) {
            if(ValidationUtils.isValidString(name)) {
                this.name = name;
            }
            else {
                System.out.println("El dato es incorrecto");
            }
        }

        public void Bark() {
            System.out.println(name + " says WOOF WOOF!");
        }
    }

    public static class Car {
        private String brand;
        private String model;

        public Car(String brand, String model) {

            this.setTitle(brand);
            this.setAuthor(model);
        }

        public void showData() {

            System.out.println("El carro con marca: " + brand + " es modelo: " + model + ".");
        }

        public void setTitle(String brand) {

            if (ValidationUtils.isValidString(brand)) {
                this.brand = brand;
            }
            else {
                System.out.println("El dato no es valido");
            }
        }

        public void setAuthor(String model) {

            if (ValidationUtils.isValidString(model)) {
                this.model = model;
            }
            else {
                System.out.println("La edad no es valida");
            }
        }
    }

    public static class Student {

        private String name;
        private int score;

        public Student(String name, int score) {

            this.setName(name);
            this.setScore(score);
        }

        public void getNote() {

            if(score >= 60) {
                System.out.println("El estudiante con nombre: " + name + "  aprobo con: " + score + ".");
            }
            else {
                System.out.println("El estudiante con nombre: " + name + "  no aprobo la materia.");
            }
        }

        public void setName(String name) {

            if (ValidationUtils.isValidString(name)) {
                this.name = name;
            }
            else {
                System.out.println("El dato no es valido");
            }
        }

        public void setScore(int score) {

            if (ValidationUtils.isValidNumber(score) && score <= 100) {
                this.score = score;
            }
            else {
                System.out.println("La edad no es valida");
            }
        }
    }

    public static class Rectangle {

        private int altura;
        private int lado;

        public Rectangle(int altura, int lado) {

            this.setAltura(altura);
            this.setLado(lado);
        }

        public void perimeter() {

            System.out.println("El rectangulo tiene un perimetro de: " + ((2 * altura) + (2 * lado)));
        }
        public void area() {

            System.out.println("El rectangulo tiene un area de: " + (altura * lado));
        }

        public void setAltura(int altura) {

            if (ValidationUtils.isValidNumber(altura)) {
                this.altura = altura;
            }
            else {
                System.out.println("El dato no es valido");
            }
        }

        public void setLado(int lado) {

            if (ValidationUtils.isValidNumber(lado)) {
                this.lado = lado;
            }
            else {
                System.out.println("La edad no es valida");
            }
        }
    }

    public static class Worker {

        private String name;
        private int salary;

        public Worker(String name, int salary) {

            this.setName(name);
            this.setSalary(salary);
        }

        public void money() {

            System.out.println("El trabajador con nombre: " + name + " gana: " + salary);
        }

        public void setName(String name) {

            if (ValidationUtils.isValidString(name)) {
                this.name = name;
            }
            else {
                System.out.println("El dato no es valido");
            }
        }

        public void setSalary(int salary) {

            if (ValidationUtils.isValidNumber(salary)) {
                this.salary = salary;
            }
            else {
                System.out.println("La edad no es valida");
            }
        }
    }

    public static class Product {

        private String name;
        private int price;

        public Product(String name, int price) {

            this.setName(name);
            this.setPrice(price);
        }

        public void setName(String name) {

            if(ValidationUtils.isValidString(name)) {
                this.name = name;
            }
            else {
                System.out.println("El dato es incorrecto");
            }
        }

        public void setPrice(int price) {

            if (ValidationUtils.isValidNumber(price)) {
                this.price = price;
            }
            else {
                System.out.println("El dato es incorrecto");
            }
        }

        public void discount() {

            System.out.println("El producto " + name + " tiene el precio de " + price + ". Y con descuento queda como: " + (price - (price * .1)));
        }
    }

    public static final class ValidationUtils {

        private ValidationUtils() {
            throw new AssertionError("No se puede instanciar una clase utilitaria");
        }

        public static boolean isValidString(String str) {

            return str != null && !str.isBlank();
        }

        public static boolean isValidNumber(int num) {

            return num >= 0;
        }
    }
}


