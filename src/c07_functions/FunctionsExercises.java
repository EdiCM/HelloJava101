package c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        welcome();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        hello("Edith");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        int resta = sub(5, 8);
        System.out.println(resta);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        int cuadrado = square(6);
        System.out.println(cuadrado);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        odd(15);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        boolean oldEnough = ageFunction(17);
        System.out.println(oldEnough);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        System.out.println(sizze("Pizza a la le;a"));

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] numbers = {2, 5, 9, 23, 4};
        average(numbers);

        // 9. Escribe un método que reciba un número y retorna su factorial.
        facto(7);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hola", "No", "Si"));
        show(words);
    }
    public static void welcome () {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void hello (String name) {
        System.out.println("Hola " + name + ", buen dia!");
    }

    public static int sub (int a, int b) {
        return (a - b);
    }

    public static int square (int number) {
        return (number * number);
    }

    public static void odd (int number) {
        if (number % 2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
    }

    public static boolean ageFunction (int age) {
        return age >= 18;
    }

    public static int sizze (String chain) {
        return chain.length();
    }

    public static void average (int[] numbers) {
        double prom = 0;
        for (int number: numbers) {
            prom += number;
        }
        prom /= numbers.length;
        System.out.println(prom);
    }

    public static void facto (int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void show (ArrayList<String> words) {
        for (String word: words) {
            System.out.println(word);
        }
    }
}
