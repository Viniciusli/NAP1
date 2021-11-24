package exercicio03.java;

public class Main {
  public static void main(String[] args) {
    Figura2 f_01 = new Figura2(2, 5); // instancia_Figura

    f_01.desenhar();
    f_01.pintar();
    f_01.imprimi();

    System.out.println("______________________________________________________\n");

    Fazenda2 fzd = new Fazenda2("Haras Manga_Larga", 2000, "Fábio", "batata"); // instancia_Fazenda

    fzd.imprimi();
    fzd.adubar();
    fzd.plantar();
  }
}
