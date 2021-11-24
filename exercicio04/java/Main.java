package exercicio04.java;

public class Main {
    public static void main(String[] args) {
        Figura3 f_01 = new Figura3(2, -5); // instancia_Figura

        f_01.desenhar();
        f_01.pintar();
        f_01.imprimi();
        System.out.println("");

        f_01.mover();
        System.out.println("");
        f_01.quadrante();

        f_01.mover();
        System.out.println("");
        f_01.quadrante();

        f_01.mover();
        System.out.println("");
        f_01.quadrante();

        f_01.mover();
        System.out.println("");
        f_01.quadrante();
    }
}
