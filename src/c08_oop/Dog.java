package c08_oop;

public class Dog {
    private String name;

    public Dog(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) {
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
