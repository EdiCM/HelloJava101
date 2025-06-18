package c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Gims");
        pets.add("Ivy");
        pets.add("Laika");

        i = 0;
        do{
            System.out.println(pets.get(i));
            i++;
        } while (i < pets.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int index = 5; index <= 50; index += 5) {
            System.out.println(index);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1, 3, 5, 7, 10};
        int suma = 0;
        for (int index = 0; index < numbers.length; index++) {
            suma += numbers[index];
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<Character> initials = new HashSet<>();
        initials.add('A');
        initials.add('E');
        initials.add('I');
        initials.add('O');
        initials.add('U');

        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Edith");
        users.put(2, "Zahir");
        users.put(3, "Mateo");

        for (char c: initials) {
            System.out.println(c);
        }

        for (Map.Entry<Integer, String> user: users.entrySet()) {
            System.out.println(user.getValue());
            System.out.println(user.getKey());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int index = 10; index >= 1; index--) {
            System.out.println(index);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(int index = 1; index <= 20; index++){
            if (index % 3 == 0) {
                continue;
            }
            System.out.println(index);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numberNeg = {1, 4, -18, 3};
        for (int number: numberNeg) {
            if (number < 0) {
                break;
            }
            System.out.println(number);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int number = 5;
        suma = 1;
        for (int index = number; index > 0; index--) {
            suma *= index;
        }
        System.out.println(suma);

    }
}
