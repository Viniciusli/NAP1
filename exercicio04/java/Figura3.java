package exercicio04.java;

public class Figura3 {
    public double coordX;
    public double coordY;

    public Figura3(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }

    public void desenhar() {
        System.out.println("Desenho das coordenadas (" + this.coordX + ", " + this.coordY + ")");
    }

    public void pintar() {
        System.out.println("Pintando os pontos das coordenadas (" + this.coordX + ", " + this.coordY + ")");
    }

    public void mover() {
        this.coordX += 2;
        this.coordY += 2;
        System.out.println("Figura movida\nNovas coordenadas:");
        this.imprimi();
    }

    public void quadrante() {
        if (this.coordX > 0 && this.coordY > 0) {
            System.out.println("A figura está no primeiro quadrante");
        } else if (this.coordX < 0 && this.coordY > 0) {
            System.out.println("A figura está no segundo quadrante");
        } else if (this.coordX < 0 && this.coordY < 0) {
            System.out.println("A figura está no terceiro quadrante");
        } else {
            System.out.println("A figura está no quarto quadrante");
        }
    }

    public void imprimi() {
        System.out.printf("Coordenadas_da_Figura : (%f, %f)%n ", this.coordX, this.coordY);
    }
}
