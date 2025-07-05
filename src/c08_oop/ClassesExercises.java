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
}

