package exercicio02.java;

public class Figura {
    public double coordX;
    public double coordY;

    public Figura(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }

    public void imprimi() {
        System.out.printf("Coordenadas_Figura : (%f, %f)%n ", this.coordX, this.coordY);
    }
}
