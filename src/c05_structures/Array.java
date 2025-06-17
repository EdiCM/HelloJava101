package c05_structures;

public class Array {
    public static void main(String[] args) {

        // Declaracion y creacion
        int number = 4; // Una variable normal
        int[] numbers = new int[3]; // Un array de enteros, un conjunto de enteros, un listado de enteros
    // En los arrays se define su longitud SIEMPRE
        System.out.println(numbers); // Imprime la posicion donde se guardo el conjunto
        System.out.println(numbers.length); // Aunque no haya nada dentro, ya tiene los espacios apartados

        String[] names = {"Edith", "Eunice", "Edgar", "Hernando"};
        System.out.println(names);
        System.out.println(names.length);

        // Acceso
        System.out.println(names[0]);
        System.out.println(names[names.length - 1]);
        System.out.println(numbers[0]); //Se llena de ceros si no tiene nada y en strings se llena con null

        // Modificar datos
        System.out.println((new String[3])[0]);
        numbers[0] = 10;
        numbers[1] = 100;
        numbers[2] = 1000;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // numbers[3] = 10000;
        // NO PUEDO MODIFICAR el tama;o de un array ya creado, solo de los espacios disponibles
        // podemos reservarle los datos al inicializarla o al crearla pero es igual, no podemos cambiar el tam;ao

        // En arrays no podmeos eliminar los espacios reservados, podemos limpiar nomas por asi decirlo
        names[2] = null;
        System.out.println(names[2]);
    }
}
