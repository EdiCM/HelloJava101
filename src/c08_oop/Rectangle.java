package c08_oop;

public class Rectangle {
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
        if (isValidNumber(altura)) {
            this.altura = altura;
        }
        else {
            System.out.println("El dato no es valido");
        }
    }

    public void setLado(int lado) {
        if (isValidNumber(lado)) {
            this.lado = lado;
        }
        else {
            System.out.println("La edad no es valida");
        }
    }

    private boolean isValidNumber(int number) {
        return number >= 1;
    }
}
