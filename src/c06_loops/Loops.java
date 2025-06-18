package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        // Loops o ciclos

        // FOR controlado por un contador
        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Java!");
        }

        // FOR para recorrer un arreglo
        String[] names = {"Edith", "Gabo", "Alan", "Zahir"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        // FOR EACH simple

        for (String name: names){
            System.out.println(name);
        }

        // FOR EACH en HashSet
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        // FOR EACH en HashMap
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Edith", "edith.01@gmail.com");
        emails.put("Zahir", "zahir.02@gmail.com");
        emails.put("Alan", "alan.03@gmail.com");
        emails.put("Gabo", "gabo.04@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()){
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // WHILE simple

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }

        // WHILE en un arreglo
        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        // WHILE booleano

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Alan")) {
                find = true;
            }
            index++;
        }

        // DO WHILE simple
        index = 0;
        do {
            System.out.println("Hola, Java!");
            index++;
        } while (index < 0);

        // BREAK
        for(String name: names) {
            if (name.equals("Zahir")) {
                break;
            }
            System.out.println(name);
        }

        // CONTINUE
        for(int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
