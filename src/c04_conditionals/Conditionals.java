package c04_conditionals;

public class Conditionals {
    public static void main(String[] args) {
        // Condicionales

        int age = 17;

        if ( age > 18 ) {
            System.out.println("El usuario es mayor de edad");
        }
        else if (age == 18) {
            System.out.println("El usuario tiene 18 a;os");
        }
        else {
            System.out.println("El usuario es menor de edad");
        }

        // switch
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Hoy es lunes!");
                break; // Tiene que tener break, si no no dejara de ejecutarse
            case 2:
                System.out.println("Hoy es martes!");
                break;
            case 3:
                System.out.println("Hoy es miercoles!");
                break;
            default:
                System.out.println("Hoy no es lunes, martes o miercoles");
        }
    }
}
