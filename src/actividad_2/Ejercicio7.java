package actividad_2;

public class Ejercicio7 {
    public static void main(String[] args) {
        int valorA, valorB;

        valorA = Teclado.inputInt("Ingrese el valor A: ");
        valorB = Teclado.inputInt("Ingrese el valor B: ");

        if (valorA > valorB) {
            System.out.println("A es mayor que B");
        } else if (valorA < valorB) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }

    }

}
