package actividad_2.EjercicioFiguraGeometrica;

public class Circulo {
    int radio;

    Circulo(double radioCirculo) {
        this.radio = (int) radioCirculo;
    }

    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularPerímetro() {
        return 2 * Math.PI * radio;
    }
}
