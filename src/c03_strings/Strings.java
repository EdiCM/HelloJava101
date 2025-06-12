package c03_strings;

public class Strings {
    public static void main(String[] args) {
        // Cadenas de texto

        // Declaracion
        String name = "Edith";
        var surname = new String("CaMe"); //aqui uso el constructor pero es redundante

        // Operaciones basicas

        System.out.println(name); // Impresion simple
        System.out.println(name + surname); // Concatenacion
        System.out.println(name + " " + surname); // Con espacio

        //  Longitud
        System.out.println(name.length());
        // Obtener caracter
        System.out.println(name.charAt(1)); //eDith
        System.out.println(name.charAt(name.length() - 1)); // Combinacion para obtener el ultimo
        // Subcadena
        System.out.println(name.substring(2, 4)); // Exclusivo el indice final pero inclusivo el del inicio
        System.out.println(name.substring(2));
        // Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("ava"));
        System.out.println("Hola, Java".contains("AVA"));

        // Como buena practica compruebo con igualdad de condiciones, como haciendo todo a mayusculas
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparacion
        System.out.println(name == "edith"); // No es recomendable usar ==
        System.out.println(name.equals("edith")); // Mejor equals, que compara al objeto completo
        System.out.println(name.equalsIgnoreCase("EDITH"));
        // Ejemplo de == vs equals

        var a = "Edith";
        var b = "Edith";
        var c = new String("Edith");
        System.out.println(a == c); // Ambos son strings pero uno se creo con new y otro con var
        System.out.println(a == b);
        System.out.println(a.equals(c));
        // == checa el valor de la referencia del objeto para ver si son iguales y equals checa el valor o lo que contiene el objeto

        // Limpieza o eliminacion
        // Trim
        System.out.println(" Hola, me llamo Edith ".trim()); // Elimina espacios en blanco al inicio y al final
        System.out.println(" Hola, me llamo Edith ");

        // Replace
        System.out.println(" Hola, me llamo Edith ".replace("o", "O"));

        // Interpolacion aqui es format algo como el scanf
        var age = 21;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));


    }
}
