package actividad_2.EjercicioFiguraGeometrica;

public class Rectangulo {

    int base;
    int altura;

    Rectangulo(double baseRectangulo, double alturaRectangulo) {
        this.base = (int) baseRectangulo;
        this.altura = (int) alturaRectangulo;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}