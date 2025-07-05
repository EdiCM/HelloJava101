package c08_oop;

public class Student {
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
        if (isValidString(name)) {
            this.name = name;
        }
        else {
            System.out.println("El dato no es valido");
        }
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        }
        else {
            System.out.println("La edad no es valida");
        }
    }

    private boolean isValidString(String str) {
        return str != null && !str.isBlank(); // Java 11+
    }
}
