package actividad_2;

public class Ejercicio11 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, mayor;

        numero1 = Teclado.inputInt("Ingrese el primer numero: ");
        numero2 = Teclado.inputInt("Ingrese el segundo numero: ");
        numero3 = Teclado.inputInt("ingrese el tercer numero: ");

        if ((numero1 > numero2) && (numero1 > numero3)) {
            mayor = numero1;
        } else {
            if (numero2 > numero3) {
                mayor = numero2;
            } else {
                mayor = numero3;
            }
        }
       

        System.out.println("El valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);

    }

}