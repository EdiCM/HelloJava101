package c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class StructuresExercises {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(numbers[0]);
        numbers[0] = 10;
        System.out.println(numbers[0]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> pets = new ArrayList<>();
        System.out.println(pets.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        pets.add("Gims");
        pets.add("Ivy");
        pets.add("Laika Morita Espina Pimientita");
        pets.add("Ragnar");

        System.out.println(pets);
        pets.remove("Laika Morita Espina Pimientita");
        System.out.println(pets);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<Character> initials = new HashSet<>();
        initials.add('E');
        initials.add('Z');

        System.out.println(initials);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        initials.add('E');
        initials.add('G');

        System.out.println(initials.size());
        System.out.println(initials);

        // 7. Elimina uno de los elementos del HashSet.
        initials.remove('G');
        System.out.println(initials.size());

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> namePhone = new HashMap<>();

        namePhone.put("Edith", "3322535799");
        namePhone.put("Nich", "3310527682");
        namePhone.put("Nando", "0983245768");

        // 9. Modifica uno de los contactos y elimina otro.
        namePhone.replace("Nich", "0000000000");
        namePhone.remove("Nando");

        System.out.println(namePhone);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] ingredientsArray = {"Flour", "Eggs", "Sugar", "Baking powder"}; //Array
        System.out.println(ingredientsArray[0]);

        ArrayList<String> ingredientsList = new ArrayList<>(Arrays.asList(ingredientsArray)); //ArrayList
        System.out.println(ingredientsList);

        HashSet<String> ingredientsHash = new HashSet<>(ingredientsList);
        System.out.println(ingredientsHash); //HashSet sin ordenar

        HashMap<String, String> ingredientsMap = new HashMap<>(ingredientsHash.stream().collect(Collectors.toMap(x -> x, x -> x)));
        System.out.println(ingredientsMap);
    }
}
