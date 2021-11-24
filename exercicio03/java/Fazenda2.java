package exercicio03.java;

public class Fazenda2 {
    public String nome;
    public double area;
    public String propietario;
    public String produto;
    private boolean adubado;
    private boolean milhoPlantado;

    public Fazenda2(String nome, double area, String propietario, String produto) {
        this.nome = nome;
        this.area = area;
        this.propietario = propietario;
        this.produto = produto;
    }

    public boolean isAdubado() {
        return adubado;
    }

    public void setAdubado(boolean adubado) {
        this.adubado = adubado;
    }

    public boolean isMilhoPlantado() {
        return milhoPlantado;
    }

    public void setMilhoPlantado(boolean milhoPlantado) {
        this.milhoPlantado = milhoPlantado;
    }

    public void adubar() {
        if (this.area > 0) {
            System.out.println("Área adubada");
            setAdubado(true);
        } else {
            System.out.println("É preciso ter áreas para plantar");
            setAdubado(false);
        }
    }

    public void plantar() {
        if (isAdubado()) {
            System.out.println(this.produto + "fopi plantado(a)");
            setMilhoPlantado(true);
        } else {
            System.out.println("Adube a terra para plantar");
        }
    }

    public void imprimi() {
        System.out.println("Fazenda: " + this.nome);
        System.out.println("Area: " + this.area + " hectares");
        System.out.println("Proprietario: " + this.propietario);
        System.out.println("Produto: " + this.produto);
        System.out.print("Status da terra: ");
        if (isAdubado() || isMilhoPlantado()) {
            System.out.println("adubado e plantado");
        } else {
            System.out.println("Não adubado ou nada plantado");
        }
    }
}
