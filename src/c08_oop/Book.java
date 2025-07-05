package c08_oop;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.setTitle(title);
        this.setAuthor(author);
    }

    public void nameAndPerson() {
        System.out.println("El libro con nombre: " + title + " fue escrito por: " + author + ".");
    }

    public void setTitle(String title) {
        if (isValidString(title)) {
            this.title = title;
        }
        else {
            System.out.println("El dato no es valido");
        }
    }

    public void setAuthor(String author) {
        if (isValidString(author)) {
            this.author = author;
        }
        else {
            System.out.println("La edad no es valida");
        }
    }

    private boolean isValidString(String str) {
        return str != null && !str.isBlank(); // Java 11+
    }

}
