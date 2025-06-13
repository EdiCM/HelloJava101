package c03_strings;

public class StringsExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        String name = "Edith";
        String surname = "Cabral";
        String phrase = "Hola, me gusta codeforces";
        int age = 21;

        System.out.println(name + surname);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(phrase.contains("gusta"));
        // 6. Formatea un string con un entero.
        System.out.println(String.format("Hola, soy %s, y mi edad es %d", name, age));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Hola, me llamo Edith ".trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(" Hola, me llamo Edith ".replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(surname));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name.length() == surname.length()); // Aqui si usamos == en vez de equals porque equals es para el contenido
    }
}
