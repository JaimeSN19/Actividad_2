package actividad2;

import actividad_2.Teclado;



public class Ejercicio12 {
    public static void main(String[] args) {

        String nombre;
        int horasTrabajadas, valorHoraNormal;
        double salario;
        int het = 0, hee8 = 0;

        nombre = Teclado.inputString("Ingrese el nombre del trabajador: ");
        horasTrabajadas = Teclado.inputInt("Ingrese el número de horas trabajadas: ");
        valorHoraNormal = Teclado.inputInt("Ingrese el valor de la hora trabajada: ");

        if (horasTrabajadas > 40) {
            het = horasTrabajadas - 40;
            if (het > 8) {
                hee8 = het - 8;
                salario = 40 * valorHoraNormal + 16 * valorHoraNormal + hee8 * 3 * valorHoraNormal;
            } else {
                salario = 40 * valorHoraNormal + het * 2 * valorHoraNormal;
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }

        System.out.println("El trabajador " + nombre + " devengó: $" + salario);

    }

}