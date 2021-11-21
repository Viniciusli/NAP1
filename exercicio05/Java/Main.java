package exercicio05.java;

class Main {
  public static void main(String[] args) {
    Ponto p1 = new Ponto(10.5, 0);
    p1.imprimir();

    Ponto p2 = new Ponto(0 , 6);
    p2.imprimir();    
    
    //primeiro metodo
    System.out.println("A distancia do ponto B até o ponto A é de : " + p2.distancia(p1.coordx, p1.coordy));
    //segundo metodo
    System.out.println("A distancia do ponto B até o ponto A é de : " + p2.distancia(p1));
    

  }
}
