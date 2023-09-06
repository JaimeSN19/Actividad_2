package actividad_2.EjercicioFiguraGeometrica;

public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(double baseTriangulo, double alturaTriangulo) {
        this.base = (int) baseTriangulo;
        this.altura = (int) alturaTriangulo;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    
    String determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
           return  "Es un triángulo equilátero";
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            return "Es un triángulo escaleno";
        else
            return "Es un triángulo isósceles";
    }
}
