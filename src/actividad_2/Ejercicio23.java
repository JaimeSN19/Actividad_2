package actividad_2;

public class Ejercicio23 {
    
  public static void main(String[] args) {

    double a = Teclado.inputDouble("Ingrese el valor de A: ");
    double b = Teclado.inputDouble("Ingrese el valor de B: ");
    double c = Teclado.inputDouble("Ingrese el valor de C: ");

    
    double discriminante = (b * b) - (4 * a * c);

    if (discriminante < 0) {
      System.out.println("La ecuación no tiene solución real");
    } else if (discriminante == 0) {
      double x = (-b )/ (2 * a);
      System.out.println("La ecuación tiene una única solución real: x = " + x);
    } else {
      double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
      System.out.println("La ecuación tiene dos soluciones reales:");
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    }


  }
}
