package actividad_2;


public class Ejercicio24 {
    public static void main(String[] args) {
       
        
        int pesoA, pesoB, pesoC;
        pesoA = Teclado.inputInt("Ingrese el peso de la esfera A: ");
        pesoB = Teclado.inputInt("Ingrese el peso de la esfera B: ");
        pesoC = Teclado.inputInt("Ingrese el peso de la esfera C: ");
        
        if(pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es de mayor peso.");
        } else if(pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es de mayor peso.");
        } else if(pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es de mayor peso.");
        } else {
            System.out.println("Las esferas tienen pesos iguales.");
        }
        
      
    }
}
