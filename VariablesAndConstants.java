public class VariablesAndConstants {
    public static void main(String[] args) {
        // Variables (varian)

        String name = "Edith"; // String es en mayusculas porque es una clase, un objeto complejo, no es primitivo como por ej. int
        System.out.println("Edith");
        System.out.println(name); // Imprimen lo mismo

        name = "Edimon4884";
        System.out.println(name); //cambie el valor, porque es una variable, puede cambiar solo por valores del mismo tipo

        // name = 21; ERROR: no puedo ponerle un valor int a una variable String

        int age = 21;
        System.out.println(age);

        var email = "edi.came040504@gmail.com";
        System.out.println(email);

        /*
        "var" es una actualizacion que entro con JDK 10 creo,
        es para inferir el tipo de un valor.
         */

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "edimoncabral4@gmail.com"; // Es buena practica poner en mayusculas a los valores constantes
        System.out.println(EMAIL); // Constante = final, NO PUEDE CAMBIAR SU VALOR
        // EMAIL = "hola@gmail.com" por eso esto daria error

    }
}
