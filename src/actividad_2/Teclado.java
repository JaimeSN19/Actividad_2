package actividad_2;

/*
 * 
 * 
 * Intanta leer por teclado un valor 
 * entero (inputInt) o double (inputDouble) valido
 * mostrando el mensaje de error e intentando de nuevo
 * hasta que esto suceda
 */

import java.util.Scanner;

public class Teclado {
    static Scanner leer_teclado = new Scanner(System.in);

    public static int inputInt(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                int value = leer_teclado.nextInt();
                return value;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato entero invalido");
                leer_teclado.nextLine();
            }
        }
    }

    public static double inputDouble(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                double value = leer_teclado.nextDouble();
                return value;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato invalido");
                leer_teclado.nextLine();
            }
        }
    }

    public static String inputString(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                String value = leer_teclado.next();
                return value;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato invalido");
                leer_teclado.nextLine();
            }
        }

    }

}