package Test;

public class EncriptadorKaraca {



    public static String encrypt(String text) {

        String reversedText = new StringBuilder(text).reverse().toString();


        reversedText = reversedText.replace('a', '0');
        reversedText = reversedText.replace('e', '1');
        reversedText = reversedText.replace('i', '2');
        reversedText = reversedText.replace('o', '3');
        reversedText = reversedText.replace('u', '4');


        return reversedText + "aca";
    }

    // Método para desencriptar texto encriptado con Karaca
    public static String decrypt(String encryptedText) {
        // Remover el sufijo arbitrario
        String noSuffix = encryptedText.substring(0, encryptedText.length() - 3);

        // Revertir el proceso de reemplazo de vocales
        noSuffix = noSuffix.replace('0', 'a');
        noSuffix = noSuffix.replace('1', 'e');
        noSuffix = noSuffix.replace('2', 'i');
        noSuffix = noSuffix.replace('3', 'o');
        noSuffix = noSuffix.replace('4', 'u');

        // Invertir el texto de nuevo para obtener el texto original
        return new StringBuilder(noSuffix).reverse().toString();
    }
}
