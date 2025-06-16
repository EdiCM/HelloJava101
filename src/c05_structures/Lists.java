package c05_structures;

import java.util.ArrayList;

public class Lists {
    public static void main (String[]  args) {
        // Podemos almacenar elementos sin necesidad de declarar un tama;o fijo, o eliminar referencias de memoria a diferencia del array que solo se puede modificar

        // Declaracion y creacion
        // Java es fuertemente tipado, tenemos que definir el dato de LO QUE SEA
        // ArrayList<String> names = new ArrayList<String>(); El segundo es gris, porque ya no se necesita definir
        ArrayList<String> names = new ArrayList<>(); // Esta es la anotacion clasica
        var numbers = new ArrayList<Integer>(); // Debo poner la clase wrapper Integer no el dato primitivo int, los array list son de clases, esta es la anotacion moderna, aqui
        // si se pone del lado derecho, porque pues tengo que ponerlo en algun lado y como uso var va a la derecha pero en buena practica si uso la clasica tiene que ir a la izquierda

        // A;adir elementos

        System.out.println(names.size()); // Aqui no hay length, es size, me da 0 porque pues no tiene nada

        // A;adir elementos

        // names[0] = "Edith"; Error, asi es en los arrays
        names.add("Edith");
        System.out.println(names.size()); // Ahora 1, el arraylist es DINAMICO
        names.add("Cabral");
        System.out.println(names.size());
        names.add("Medina");

        // Acceder

        // System.out.println(names[0]); Error, esto es en los arrays
        System.out.println(names.get(0)); // pero tambien puedo usar getFirst()
        System.out.println(names.getFirst());
        System.out.println(names.getLast()); // Estructuras ordenadas, FIFO
        System.out.println(names.get(1));

        // Modificar elementos

        names.set(2, "Medusa");
        System.out.println(names.getLast());

        // Eliminar

        names.remove(2);
        // System.out.println(names.get(2)); Error, el indice ya no existe, existia pero ya no
        System.out.println(names.getLast()); // Por eso sale cabral, ya solo tengo 2 elementos

        // Buscar elementos
        System.out.println(names.contains("Medusa"));

        // Limpiar arrayList
        System.out.println(names);
        names.add("Edith");
        System.out.println(names); // Se permiten repetidos
        names.clear();
        System.out.println(names.size());
        System.out.println(names);
    }
}
