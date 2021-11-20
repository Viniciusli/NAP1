package exercicio01.java;

public class Fabrica {
    int quatidadeDeCacau;
    int quatidadeDeGraos;
    int chocolate;

    public Fabrica() {
        this.quatidadeDeCacau = 0;
        this.quatidadeDeGraos = 0;
        this.chocolate = 0; // em gramas

        System.out.println("Siga as instruções para produzir chocolate");
        System.out.println("1) colher()");
        System.out.println("2) extrair_graos()");
        System.out.println("3) extrair_chocolate()");
    }

    public void colher() {
        System.out.println("O cacau está sendo colhido");
        this.quatidadeDeCacau += 10;
    }

    public void extrairGraos() {
        // adimitindo que um cacau possua 20 grãos
        if (this.quatidadeDeCacau > 0) {
            this.quatidadeDeGraos += 20;
            System.out.println("Grãos extraidos: " + this.quatidadeDeGraos);
        } else {
            System.out.println("Colha cacau para extrair grãos");
        }
    }
}