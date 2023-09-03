package actividad_2;

import actividad_2.Teclado;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numeroInscrpcion, estratoSocial;
        String nombres;
        double patrimonio;
        double valorMatricula = 50000;

        numeroInscrpcion = Teclado.inputInt("Ingrese el numero de inscripcion del estudiante: ");
        nombres = Teclado.inputString("Ingrese el nombre del estudiante: ");
        patrimonio = Teclado.inputDouble("Ingrese el patrimonio del estudiante: ");
        estratoSocial = Teclado.inputInt("Ingrese el estrato social del estudiante: ");

        if (patrimonio > 2000000 && estratoSocial > 3) {
            valorMatricula += patrimonio * 0.03;
        }

        System.out.println("El estudiante con numero de inscripcion " + numeroInscrpcion + " y nombre " + nombres
                + " debe pagar: $" + valorMatricula);

    }

}