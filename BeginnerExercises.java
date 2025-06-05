public class BeginnerExercises {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Edith";
        System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 21;
        System.out.println(myAge);

        // 3. Crea una variable double con tu altura en metros.
        double myHeight = 1.68;
        System.out.println(myHeight);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;
        System.out.println(likeProgramming);

        // 5. Declara una constante con tu email.
        final String myEmail= "edi.came040504@gmail.com";
        System.out.println(myEmail);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'E';
        System.out.println(myInitial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myCountry = "Mexico";
        System.out.println(myCountry);
        myCountry = "Thailand";
        System.out.println(myCountry);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 100;
        int b = 1;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(((Object)a).getClass().getSimpleName()); // como esta es primitiva, lo que hice es convertirlo en un objeto temporalmente obligando a Java a realizar el autoboxing de mi int a la clase Integer, pudiendo usar el metodo antes aprendido
        System.out.println(myCountry.getClass().getSimpleName()); // este si es clase entonces nomas use los metodos, no tuve que convertir nada

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int c;
        c = 3; //Esto si se puede, pero si no le asignamos ningun valor en ningun momento eso seria un error
        System.out.println(c);
    }
    }


