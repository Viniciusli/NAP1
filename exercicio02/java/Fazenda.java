package exercicio02.java;

public class Fazenda {
  public String nome;
  public double area;
  public String propietario;

  public Fazenda(String nome, double area, String propietario) {
    this.nome = nome;
    this.area = area;
    this.propietario = propietario;
  }

  public void imprimi() {
    System.out.println("Fazenda: " + this.nome);
    System.out.println("Area: " + this.area + "hectares");
    System.out.println("Proprietario: " + this.propietario);
  }
}
