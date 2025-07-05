package c08_oop;

public class Car {
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
        if (isValidString(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("El dato no es valido");
        }
    }

    public void setAuthor(String model) {
        if (isValidString(model)) {
            this.model = model;
        }
        else {
            System.out.println("La edad no es valida");
        }
    }

    private boolean isValidString(String str) {
        return str != null && !str.isBlank(); // Java 11+
    }
}
