package c08_oop;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) {
            this.name = name;
        }
        else {
            System.out.println("El dato es incorrecto");
        }
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
        else {
            System.out.println("El dato es incorrecto");
        }
    }

    public void discount() {
        System.out.println(" El producto " + name + " tiene el precio de " + price + ". Y con descuento queda como: " + (price - (price * .1)));
    }
}
