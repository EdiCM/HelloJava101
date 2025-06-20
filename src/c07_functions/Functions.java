package c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        // Funciones
        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        sendEmail();

        sendEmailToUser("edith@gmail.com");
        sendEmailToUser("edith@gmail.com", "Edith");

        var users = new ArrayList<>(Arrays.asList("edith@gmail.com", "nich@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("edith@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    // Funcion sin parametros ni retorno
    public static void sendEmail() {
        System.out.println("Se envia un email");
    }

    // Funcion sin retorno
    public static void sendEmailToUser (String email) {
        System.out.println("Se envia el email a " + email);
    }

    public static void sendEmailToUser (String email, String name) {
        System.out.println("Se envia el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser (ArrayList<String> emails) {
        for (String email: emails) {
            sendEmailToUser(email);
        }
    }

    // Funcion con retorno

    public static boolean sendEmailWithState (String email) {
        if (email.isEmpty()) {
            return false;
        }

        sendEmailToUser(email);
        return true;
    }
}
