package c02_operators;

public class OperatorsExercises {
    public static void main(String[] args){
        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 5, b = 3;

        int mySum = a + b;
        int mySub = a - b;
        int myMulti = a * b;
        int myDiv = a / b;

        System.out.println(mySum);
        System.out.println(mySub);
        System.out.println(myMulti);
        System.out.println(myDiv);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int c = 5;
        c += b;
        System.out.println(c);
        c -= b;
        System.out.println(c);
        c *= a;
        System.out.println(c);
        c /= a;
        System.out.println(c);
        c %= a;
        System.out.println(c);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a > b);
        System.out.println(b < a);
        System.out.println(c != a);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(c == b);
        System.out.println(a <= b);
        System.out.println(c <= -1);

        // 5. Utiliza el operador lógico and.
        System.out.println(a > c && a > b); //ambas deben dar true para que sea igual a true

        // 6. Utiliza el operador lógico or.
        System.out.println(a > c || a != 5); //alguna de las dos debe dar true para que sea igual a true

        // 7. Combina ambos operadores lógicos.
        System.out.println(a > c && a != 5 || b > c); //si 5 > 0 TRUE and 5 != 5 FALSE, entonces aqui da false pero el or dice o..
        //si b que vale 3 es mayor que 0 y como esto da true, entonces lo de despues del or da true y se imprime true.

        // 8. Añade alguna negación.
        System.out.println(a > c && a != 5 || !(b > c)); //ahora se imprime false porque da false cualquier comparacion

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(c++);
        ++c;
        System.out.println(c);
        System.out.println(-c); // imprimió a mi 2 negativo

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(a + b > c && a == 5); //aritmetica la suma, comparacion el mayor que y los iguales y logico el and
    }
}
