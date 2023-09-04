package actividad_2;



public class Ejercicio13 {
    public static void main(String[] args) {
      
       
        double valcomp = Teclado.inputDouble("Ingrese el valor de compra: ");
        String color = Teclado.inputString("Ingrese el color del producto (BLANCO, VERDE, AMARILLO, AZUL): ");

        double pdes;

        if (color.equals("BLANCO")) {
            pdes = 0;
        } else if (color.equals("VERDE")) {
            pdes = 10;
        } else if (color.equals("AMARILLO")) {
            pdes = 25;
        } else if (color.equals("AZUL")) {
            pdes = 50;
        } else {
            pdes = 100;
        }

        double valpag = valcomp - pdes * valcomp / 100;

        System.out.println("El cliente debe pagar: $" + valpag);

       
    }
}
