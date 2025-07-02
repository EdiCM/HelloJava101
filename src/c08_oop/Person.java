package c08_oop;

public class Person {
    // No necesitamos ponerle main, porque ya tenemos un main en classes, aqui solo definire al objeto person
    // ATRIBUTOS
    protected String name;
    private int age;
    final private String id;

    // CONSTRUCTOR
    // El constructor permite inicializar al objeto con valores desde el momento de la creacion
    public Person(String name, int age, String id) {
        this.name = "Nombre: " + name; // debemos establecer los valores, asignarle la relacion con las propiedades internas de la clase
        this.setAge(age); // THIS hace referencia al contexto de la clase, o sea al name y age de la clase como atributo
        this.id = id;
    }

    // METODOS
    public void sayHello() {
        System.out.println("hola! soy " + name + " y tengo " + age + " años y mi id es: " + id + ".");
    }

    // Digamos que limite el id pero si quiero poder acceder para mostrarlo...
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    // Ahora quiero establecer un criterio para la edad por ejemplo
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("La edad no es valida");
        }
    }

    // El constructor permite inicializar al objeto con valores desde el momento de la creacion

}
