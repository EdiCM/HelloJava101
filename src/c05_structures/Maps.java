package c05_structures;

import java.util.HashMap;
 // Llaves unicas, un put siempre lo mete, put if absent solo si no existia y replace solo si existia
public class Maps {
    public static void main(String[] args) {
        // Almacena un conjunto de pares, valor y llave, cada valor asociado a esa clave es como accedemos

        HashMap<String, String> names = new HashMap<>(); // Necesita dos argumentos, el tipo de la llave y el tipo del valor
        var numbers = new HashMap<Integer, String>();

        // Tama;o
        System.out.println(names.size());

        // A;adir elementos
        names.put("Edith", "edi.came040504@gmail.com"); // Aqui put es mi add, necesito la llave y despues el valor
        names.put("Andy", "andy.zahir@gmail.com");
        names.put("Gims", "gims.pewin@gmail.com");
        System.out.println(names.size()); //Ya tengo elementos
        System.out.println(names);

        // Esta estructura tambien es hash, asi que tampoco esta ordenado
        // Pero si podemos acceder a traves de la llave
        System.out.println(names.get("Gims"));
        System.out.println(names.get("Nich")); // Me da nulo, porque no tengo esa clave

        // Verificar si existe algo de manera correcta, no de obtener el valor sino comprobar si existe
        System.out.println(names.containsKey("Nich"));
        System.out.println(names.containsValue("edi.came040504@gmail.com")); // Tambien vemos si existe la llave

        // Eliminar elementos, si ponemos clave y valor es para una comprobacion muy fidedigna pero casi no se usa
        System.out.println(names.remove("Gims"));
        System.out.println(names.remove("Edith")); // Me devuelve el valor que elimina asociado como por si lo voy a usar para algo
        System.out.println(names);

        // Limpiar hashmap
        names.clear();
        System.out.println(names); // Esta vacio

        // Modificacion de elementos
        names.put("Edith", "edi.came040504@gmail.com");
        System.out.println(names);

        names.put("Edith", "edimoncabral4@gmail.com");
        System.out.println(names); // Si la llave ya existe, solo modificamos el valor asociado, lo sobreescribimos

        // Reemplaza si existe

        //names.put("Andy", "andy.zahir@gmail.com"); // Si existe, lo sobreescribe pero si no existe lo va a terminar creando

        // Si solo queremos reemplazar pero no crear en caso de que no exista usamos replace
        names.replace("Andy", "zahir.tortuguin@gmail.com");
        System.out.println(names);

        // Y si quiero a;adir pero solo si no existe?
        names.putIfAbsent("Nich", "Nich.08@gmail.com");
        System.out.println(names);

        System.out.println(names.isEmpty()); // Nos dice si esta vacio
        var values = names.values();
        System.out.println(values); // Operaciones sin una implementacion, values es una interfaz, debemos definir que la coleccion si tiene un tipo de dato concreto






    }
}
