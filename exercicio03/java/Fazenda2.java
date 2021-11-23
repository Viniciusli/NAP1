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
        }
        System.out.println("É preciso ter áreas para plantar");
        setAdubado(false);
    }

    public void plantar() {
        if (isAdubado()) {
            System.out.println(this.produto + "foram plantados(as)");
            this.milhoPlantado = true;
        }
    }

    public void imprimi() {
        System.out.println("Fazenda: " + this.nome);
        System.out.println("Area: " + this.area + "a");
        System.out.println("Proprietario: " + this.propietario);
        System.out.println("Produto: " + this.produto);
        System.out.print("Status da terra: ");
        if (isAdubado()) {
            System.out.println("adubado");
        } else {
            System.out.println("Não adubado");
        }
    }
}