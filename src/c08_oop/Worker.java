package c08_oop;

public class Worker {
    private String name;
    private int salario;

    public Worker(String name, int salario) {
        this.setName(name);
        this.setSalary(salario);
    }

    public void money() {
        System.out.println("El trabajador con nombre: " + name + " gana: " + salario);
    }

    public void setName(String name) {
        if (isValidString(name)) {
            this.name = name;
        }
        else {
            System.out.println("El dato no es valido");
        }
    }

    public void setSalary(int salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
        else {
            System.out.println("La edad no es valida");
        }
    }

    private boolean isValidString(String str) {
        return str != null && !str.isBlank(); // Java 11+
    }
}
