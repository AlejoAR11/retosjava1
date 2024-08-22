package Test;

import java.util.Random;

public class GenerarorDeContrasenas {

    private static final String CARACTERES = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789._-! ";

    public static String generarContrasena(int min, int max) {
        Random random = new Random();
        int longitud = random.nextInt(min - max + 1) + min;
        StringBuilder contrasena = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(CARACTERES.length());
            contrasena.append(CARACTERES.charAt(index));

        }

        return contrasena.toString();
    }
}
