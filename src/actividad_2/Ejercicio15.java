package actividad_2;



public class Ejercicio15 {
  public static void main(String[] args) {

      int pesoA = Teclado.inputInt("Ingrese el peso de la esfera A: ");
      int pesoB = Teclado.inputInt("Ingrese el peso de la esfera B: ");
      int pesoC = Teclado.inputInt("Ingrese el peso de la esfera C: ");
      int pesoD = Teclado.inputInt("Ingrese el peso de la esfera D: ");

      if (pesoA == pesoB && pesoA == pesoC) {
        if (pesoD > pesoA) {
          System.out.println("La esfera D es la diferente y es de mayor peso");
        } else {
          System.out.println("La esfera D es la diferente y es de menor peso");
        }
      } else if (pesoA == pesoB && pesoA == pesoD) {
        System.out.println("La esfera C es la diferente");
        if (pesoC > pesoA) {
          System.out.println("y es de mayor peso");
        } else {
          System.out.println("y es de menor peso");
        }
      } else if (pesoA == pesoC && pesoA == pesoD) {
        System.out.println("La esfera B es la diferente");
        if (pesoB > pesoD) {
          System.out.println("y es de mayor peso");
        } else {
          System.out.println("y es de menor peso");
        }
      } else {
        System.out.println("La esfera A es la diferente");
        if (pesoA > pesoB) {
          System.out.println("y es de mayor peso");
        } else {
          System.out.println("y es de menor peso");
        }
      }
    }
  }
