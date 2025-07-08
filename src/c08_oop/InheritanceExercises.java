package c08_oop;

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

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
    }

    public static class Vehicle {

        public void move() {
            System.out.println("El vehiculo se mueve...");
        }
    }

    public static class Car extends Vehicle {

        public void honk() {
            System.out.println("HONK! HONK!");
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
}
