package actividad_2;

public class Ejercicio21 {
    
    public static void main(String[] args) {
    double ladoA,ladoB,ladoC;

    ladoA = Teclado.inputDouble("Ingrese el primer lado del triangulo: ");
    ladoB = Teclado.inputDouble("Ingrese el segundo lado del triangulo: ");
    ladoC = Teclado.inputDouble("Ingrese el tercer lado del triangulo: ");

    
    double perimetro = ladoA + ladoB + ladoC;
    double semiperimetro = perimetro/2;
    
    double areaTriangulo = Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro - ladoB) * (semiperimetro - ladoC));

    
    System.out.println("El perímetro del triángulo es: " + perimetro);
    System.out.println("El semiperimetro del triángulo es: " + semiperimetro);
    System.out.println("El área del triángulo es: " + areaTriangulo);





    
   }
    
}
