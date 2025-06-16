package c05_structures;

import java.util.HashSet;
// El hashset se usa en velocidad de busqueda y cuando no queremos repetidos, pero no vamos a poder ni acceder ni modificar
public class Sets {
    public static void main(String[] args) {
        // Un set es una estructura especial que solo almacena datos unicos, no repeticiones

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>(); // Aqui tambien debo usar el class wrapper de cada dato primitivo

        // tama;o
        System.out.println(names.size());

        // A;adir elementos
        names.add("Edith");
        names.add("Cabral");
        names.add("Medina");
        System.out.println(names.size());

        // Acceder a los elementos
        // No podemos acceder a los elementos como en el arrayList, las lista son ordenadas pero los set son desordenados, usa un Hash.
        // El set accede a los datos muy rapidamente por el hash, pero no los tiene ordenados
        // No se pueden ni acceder ni modificar
        System.out.println(names);

        // Buscar elementos

        System.out.println(names.contains("Edith")); // Puedo buscar y es mucho mas rapido en el set que en el arrayList

        // Eliminar elementos
        names.remove("Medina"); // No puedo usar indices pero si puedo eliminarle un valor directamente
        System.out.println(names.size());

        names.add("Edith");
        System.out.println(names); // Aunque agregue mas de una vez lo mismo, no se va a guardar

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // names.addAll(numbers); Error, podemos agregar conjuntos pero no son del mismo tipo aqui

        var countries = new HashSet<String>();
        countries.add("Mexico");
        countries.add("Spain");
        countries.add("Argentina");
        countries.add("Edith");

        names.addAll(countries); // Aqui si son compatibles
        System.out.println(names);

        // names.removeAll(countries); // Se elimina ttodo el conjunto
        System.out.println(names);

        names.retainAll(countries); // Aqui solamente dejamos los elementos comunes y los del conjunto, los que no sean ninguno de esos dos se dejan fuera
        System.out.println(names);



    }
}
