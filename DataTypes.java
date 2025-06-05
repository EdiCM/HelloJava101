public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types o sea los nativos, la base de los tipos en JAVA, son 8

        // int -> entero = 32-bit signed two's complement integer
        int myInt = 37; // ps. Es buena practica si el nombre tiene mas de una palabra, usar LCC
        System.out.println(myInt);

        // long -> entero pero mas largo = 64-bit signed two's complement integer
        long myLong = 37L; // Debes poner la L mayuscula de preferencia para especificar que es un long
        System.out.println(myLong);

        // short -> entero pero mas chiquito = 16-bit signed two's complement integer
        short myShort = 37;
        System.out.println(myShort);

        // char -> caracter = A, a, 1, ^, etc but between '' singular quotes
        char myChar = 'a';
        System.out.println(myChar);

        // byte -> 8 bits = 8-bit signed two's complement integer
        byte myByte = 125;
        System.out.println(myByte);

        // float -> flotante = 32-bit floating-point numbers
        float myFloat = 37.00F; //Debes poner la literal F, parecido al caso de long
        System.out.println(myFloat);

        // double -> doble = 64-bit floating-point numbers
        double myDouble = 37.00;
        System.out.println(myDouble);

        // boolean -> booleano = true/false values
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // Para saber el tipo de dato en tiempo de compilacion de una CLASE no de un dato primitivo ojo
        String myString = "Hello World";
        System.out.println(myString.getClass().getSimpleName());

    }
}
