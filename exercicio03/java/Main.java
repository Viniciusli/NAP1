package atividad_ex03;
public class Atividad_Ex03 {
        public static void main(String[] args) {
    Figura f_01 = new Figura(2, 5); // instancia_Figura

    f_01.desenhar();
    f_01.pintar();
    f_01.imprimi();

    System.out.println("______________________________________________________\n"); 

     Fazenda fzd = new Fazenda("Haras Manga_Larga", 2000 , "Fábio"); // instancia_Fazenda
    
    fzd.imprimi();
    fzd.plantar();
    fzd.adubar();    
  }
}
