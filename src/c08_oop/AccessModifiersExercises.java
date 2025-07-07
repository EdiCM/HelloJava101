package c08_oop;

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        Person person = new Person("Juan", 32);
        person.name = "Dana";
        person.age = 23;

        System.out.println("Mi nombre es: " + person.getName() + " y mi edad es: " + person.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        Product product = new Product(43);
        product.setPrice(1);
        System.out.println("Mi precio es: " + product.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        BankAccount bank = new BankAccount();
        bank.deposit(45.3);
        bank.deposit(55.9);
        bank.withdraw(80);

        System.out.println("La cantidad en mi tarjeta es de: " + bank.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        Book book = new Book("El laberinto y el fauno");
        System.out.println(book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        Temperature temp = new Temperature(56.5);
        System.out.println("La temperatura es de: " + temp.getCelsius());

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        User user = new User();
        user.setUsername("Edimon4884");
        user.setPassword("123456789A");

        user.checkPassword("123456789B");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        Employee employee = new Employee();

        employee.raiseSalary(500.5);

        System.out.println("El salario del empleado ahora es: " + employee.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        Rectangle rec = new Rectangle();
        rec.setHeight(12.5);
        rec.setWidth(5.0);

        rec.calculateArea();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        Student stud = new Student();
        stud.setGrade(59);

        stud.isPassed();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        Car car = new Car();

        car.accelerate(100);
        car.brake(98);
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.setName(name);
            this.setAge(age);
        }
        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static class Product {

        private double price;

        public Product(double price) {

            this.setPrice(price);
        }

        public void setPrice(double price) {

            if(price >= 0) {
                this.price = price;
            }
            else {
                System.out.println("Error de precio");
            }
        }

        public double getPrice() {
            return price;
        }

    }

    public static class BankAccount {

        private double balance = 0;

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

    public static class Book {

        private final String title;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

    }

    public static class Temperature {

        private double celsius;

        public Temperature(double celsius) {
            this.setCelsius(celsius);
        }

        public void setCelsius(double celsius) {

            if (celsius <= 100 && celsius >= - 100) {
                this.celsius = celsius;
            }
            else {
                System.out.println("Valor no valido");
            }
        }

        public double getCelsius() {
            return celsius;
        }
    }

    public static class User {

        private String username;
        private String password;

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void checkPassword(String inputPassword) {
            if (inputPassword.equals(this.password)) {
                System.out.println("El usuario " + this.username + "se ha loggeado correctamente");
            }
            else {
                System.out.println("contra incorrecta");
            }
        }
    }

    public static class Employee {

        private double salary = 1200.0;

        public void raiseSalary(double percent) {

            if(percent >= 0) {
                salary += percent;
            }
            else {
                System.out.println("Error de cantidad");
            }
        }

        public double getSalary() {
            return salary;
        }

    }

    public static class Rectangle {

        private double height;
        private double width;

        public void setHeight(double height) {

            this.height = height;
        }

        public void setWidth(double width) {

            this.width = width;
        }

        public void calculateArea() {
            System.out.println("El area es: " + (this.height * this.width));
        }
    }

    public static class Student {

        private int grade;

        public void setGrade(int grade) {

            if (grade >= 0 && grade <= 100) {
                this.grade = grade;
            }
            else {
                System.out.println("Error de calificacion");
            }
        }

        public void isPassed() {

            if (this.grade >= 60) {
                System.out.println("El alumno ha pasado la materia");
            }
            else {
                System.out.println("El alumno reprobo");
            }
        }
    }

    public static class Car {

        private int speed = 0;

        public void accelerate(int amount) {

            if(amount <= 120 && amount >= 0 && (speed + amount <= 120)) {
                speed += amount;
                System.out.println("El motor ha acelerado a: " + speed);
            }
            else {
                System.out.println("Cantidad no valida");
            }
        }

        public void brake(int amount) {

            if(amount <= 120 && amount >= 0 && (speed - amount >= 0)) {
                speed -= amount;
                System.out.println("El motor ha desacelerado a: " + speed);
            }
            else {
                System.out.println("Cantidad no valida");
            }
        }

    }
}

