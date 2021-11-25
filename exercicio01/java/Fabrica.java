package exercicio01.java;

public class Fabrica {
    public int quatidadeDeCacau;
    public int quatidadeDeGraos;
    public int chocolate;

    public Fabrica() {
        this.quatidadeDeCacau = 0;
        this.quatidadeDeGraos = 0;
        this.chocolate = 0; // em gramas

        System.out.println("Siga as instruções para produzir chocolate");
        System.out.println("1) colher()");
        System.out.println("2) extrair_graos()");
        System.out.println("3) extrair_chocolate()");
    }

    public int getQuantidadeDeChocolate() {
        return this.chocolate;
    }

    protected void setQuantidadeDeChocolate(int quantidade) {
        this.chocolate += quantidade;
    }

    public void status() {
        System.out.println("Chocolate produzido: " + getQuantidadeDeChocolate());
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
            System.out.println("Fruto com baixa quatidade de grãos");
        }
    }

    public void extrairChocolate() {
        if (this.quatidadeDeGraos > 0) {
            int quantidadeDeChocolate = this.quatidadeDeGraos * 5;
            setQuantidadeDeChocolate(quantidadeDeChocolate);
            System.out.println(getQuantidadeDeChocolate() + " gramas de chocolate produzidos");
        }
    }
}
