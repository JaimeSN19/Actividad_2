package actividad_2;

public class Ejercicio19 {
    public static void main(String[] args) {
        double ladoTriangulo;

        ladoTriangulo = Teclado.inputDouble("ingrese el valor del lado del triangulo");
        
        
        double perimetro = ladoTriangulo * 3;
        double altura =(ladoTriangulo *Math.sqrt(3))/2;
        double area =(Math.pow(ladoTriangulo,2))*(Math.sqrt(3)/4);

        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("La altura del triángulo es: " + altura);
        System.out.println("El área del triángulo es: " + area); 




    
    
    }

    
}