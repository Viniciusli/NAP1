package atividad_ex03;
public class Figura {
    public double coordX;
    public double coordY;

    public Figura(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }
    
    public void desenhar () {
    System.out.println("Desenho das coordenadas (" + this.coordX + ", " + this.coordY + ")");
  }

  public void pintar () {
    System.out.println("Pintando os pontos das coordenadas (" + this.coordX + ", " + this.coordY + ")");
  }
  
  public void imprimi() {
        System.out.printf("Coordenadas_da_Figura : (%f, %f)%n ", this.coordX, this.coordY);
    }  
  }
