package exercicio03.java;

public class Figura2 {
  public double coordX;
  public double coordY;

  public Figura2(double x, double y) {
    this.coordX = x;
    this.coordY = y;
  }

  public void desenhar() {
    System.out.println("Desenho das coordenadas (" + this.coordX + ", " + this.coordY + ")");
  }

  public void pintar() {
    System.out.println("Pintando os pontos das coordenadas (" + this.coordX + ", " + this.coordY + ")");
  }

  public void imprimi() {
    System.out.printf("Coordenadas_da_Figura : (%f, %f)%n ", this.coordX, this.coordY);
  }
}
