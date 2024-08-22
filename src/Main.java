import Test.FizzBuzz;
import Test.GenerarorDeContrasenas;
import Test.LenguajeHacker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        FizzBuzz fizzbuzz = new FizzBuzz();
        LenguajeHacker encriptado = new LenguajeHacker();



        do {
            System.out.println("***************************");
            System.out.println("Menú de ejercicios, escoje uno de la lista");
            System.out.println("1. FizzBuzz");
            System.out.println("2. Cambiar letras a números");
            System.out.println("3. Generar contraseñas");
            System.out.println("9. Salir");
            int op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1:
                    fizzbuzz.calculo();
                    break;
                case 2:
                    System.out.println("Ingresa tu mensaje");
                    String obtenerMensaje = teclado.nextLine();
                    String mensajeModificado = encriptado.GenerarMensaje(obtenerMensaje);
                    System.out.println(mensajeModificado);
                    break;
                case 3:
                    System.out.println("Generar contraseña aleatoria");
                    System.out.println("Ingrese el mínimo de caracteres");
                    int min = teclado.nextInt();
                    System.out.println("Ingrese el máximo de caracteres");
                    int max = teclado.nextInt();
                   String nuevaPass= GenerarorDeContrasenas.generarContrasena(min, max);
                    System.out.println(nuevaPass);
                    break;
                case 9:
                    System.out.println("Chauu");
                    System.out.println("***************************");
                    salir = true;
                    break;

                default:
                    System.out.println("opción incorrecta");
                    break;
            }

        } while (!salir);

        teclado.close();
    }
}
