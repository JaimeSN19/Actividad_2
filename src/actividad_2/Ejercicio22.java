package actividad_2;


public class Ejercicio22 {

    public static void main(String[] args) {

        String nombre;
        double salarioBasico, horasTrabajadas, salarioMensual;

        nombre = Teclado.inputString("Ingrese el nombre del empleado:");
        salarioBasico = Teclado.inputDouble("Ingrese el salario básico por hora:");
        horasTrabajadas = Teclado.inputDouble("Ingrese el número de horas trabajadas en el mes:");

        
        salarioMensual = salarioBasico * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("El salario mensual de " + nombre + " es $" + salarioMensual);
        } else {
            System.out.println(nombre);
        }
       
    }
    
}
