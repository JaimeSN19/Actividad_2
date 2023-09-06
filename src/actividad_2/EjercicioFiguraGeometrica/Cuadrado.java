package actividad_2.EjercicioFiguraGeometrica;

public class Cuadrado {

    int lado;

    public Cuadrado(double ladoCuadrado) {
        this.lado = (int) ladoCuadrado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerímetro() {
        return (4 * lado);
    }
}