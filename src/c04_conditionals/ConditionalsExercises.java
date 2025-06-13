package c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 17;
        if (age >= 18) {
            System.out.println("El usuario puede votar");
        }
        else {
            System.out.println("El usuario no puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 20;
        int b = 22;
        if (a > b) {
            System.out.println("a es mayor que b");
        }
        else if (a < b) {
            System.out.println("a es menor que b");
        }
        else {
            System.out.println("Son iguales");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int c = -15;
        if (c > 0) {
            System.out.println("Es positivo");
        }
        else if(c == 0) {
            System.out.println("Es cero");
        }
        else {
            System.out.println("Es negativo");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        int d = 20;
        if (d % 2 == 0){
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        int e = 99;
        if (e >= 1 && e <= 100){
            System.out.println("Esta en el rango de 1 a 100");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No corresponde a ningun dia de la semana");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int grade = 67;
        if (grade < 60) {
            System.out.println("Suspenso");
        }
        else if (grade >= 60 && grade < 85){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Sobresaliente");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        boolean company = false;
        int myAge = 15;
        if (myAge >= 15 || company){
            System.out.println("Si puede entrar al cine");
        }
        else {
            System.out.println("No puede entrar");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char myChar = 'e';
        if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u') {
            System.out.println("Es vocal");
        }
        else {
            System.out.println("Es consonante");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int A = 1;
        int B = 2;
        int C = 3;
        if( A > B && A > C){
            System.out.println("A es la mayor");
        }
        else if ( A < B && B > C){
            System.out.println("B es mayor");
        }
        else if ( C > A && C > B) {
            System.out.println("C es mayor");
        }
        else {
            System.out.println("No hay una mayor");
        }
    }

}
