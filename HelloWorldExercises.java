public class HelloWorldExercises {
    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Edith Cabral Medina");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola");
        System.out.print("Mundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        //println imprime con un salto de linea al final, y print sin mas imprime pero se queda en la misma linea

        // 4. Crea un comentario en varias líneas.
        /*
        Hola, me llamo Edith,
        tengo 21 años.
        c:
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("\n21 años, verde oscuro y gdl");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Error en la matrix"); //solo hay uno, porque .in no tiene acceso a println.

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Solo quiero darte cuchi cuchi");
        System.out.println("Nos vamos pa la guchi");
        System.out.println("Mamita tu estas rica como la maluchi");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("||||||||||");
        System.out.println("||**||**||");
        System.out.println("||||||||||");
        System.out.println("|||_--_|||");
        System.out.println("|||[--]|||");
        System.out.println("||||||||||");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        //the file in the editor is not runnable, no puede correr sin un main, todo debe tener un main

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        //La clase es publica, y deberia estar declarada en un archivo que se llame igual. siempre deben llamarse igual.
    }
}

