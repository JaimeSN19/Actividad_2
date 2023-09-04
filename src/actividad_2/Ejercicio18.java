package actividad_2;

public class Ejercicio18 {

    public static void main(String[] args) {
        String nombres;
        int codigoEmpleado, horasT, valorH;
        double porcentajeRetencion;

        codigoEmpleado = Teclado.inputInt("Ingrese el codigo del empleado: ");
        nombres = Teclado.inputString("Ingrese el nombre del empleado: ").trim();
        horasT = Teclado.inputInt("Ingrese las horas trabajadas: ");
        valorH = Teclado.inputInt("ingrese el valor de hora trabajada: ");
        porcentajeRetencion = Teclado.inputDouble("ingrese el porcentaje");
       

        // salario bruto
        double salarioBruto = horasT * valorH;

        // salario neto
        double porcentajeRetencionCambio = porcentajeRetencion / 100;
        double retencion = salarioBruto * porcentajeRetencionCambio;
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombres del empleado: " + nombres);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Salario neto: $" + salarioNeto);

    }

}