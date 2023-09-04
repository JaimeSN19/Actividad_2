package actividad_2;

public class Ejercicio14 {

    public static void main(String[] args) {

        double vd1, vd2, vd3, salar, totven, porven, salar1, salar2, salar3;

        vd1 = Teclado.inputDouble("Ingrese las ventas del primer vendedor:");
        vd2 = Teclado.inputDouble("Ingrese las ventas del segundo vendedor:");
        vd3 = Teclado.inputDouble("Ingrese las ventas del tercer vendedor: ");
        salar = Teclado.inputDouble("Ingrese el salario base:");

        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;

        if (vd1 > porven) {
            salar1 = salar + 0.2 * salar;
        } else {
            salar1 = salar;
        }

        if (vd2 > porven) {
            salar2 = salar + 0.2 * salar;
        } else {
            salar2 = salar;
        }

        if (vd3 > porven) {
            salar3 = salar + 0.2 * salar;
        } else {
            salar3 = salar;
        }

        System.out.println("Salario del vendedor 1: $" + salar1);
        System.out.println("Salario del vendedor 2: $" + salar2);
        System.out.println("Salario del vendedor 3: $" + salar3);

    }

}
