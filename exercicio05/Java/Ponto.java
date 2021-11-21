package exercicio05.java;

public class Ponto{
  
public double coordx;
public double coordy;

public Ponto(double coordx, double coordy){
    this.coordx = coordx;
    this.coordy = coordy;
  }
  //não havia na atividade, mas usamos o metodo imprimir.
public void imprimir (){
    System.out.println("As coordenadas de X e de Y no ponto A são de : " + this.getcoordx() + " e " + this.getcoordy());

}

public double getcoordx() {
   return this.coordx;
  }

  public double getcoordy() {
   return this.coordy;
  }

public void setcoordx(double Coordx) {
   this.coordx = Coordx;
  }

public void setcoordy(double Coordy) {
   this.coordy = Coordy;
  }


public double distancia(double coordx, double coordy){
   return Math.sqrt(Math.pow(this.coordx - coordx, 2) + Math.pow(coordy - coordy, 2));
  }
   
public double distancia(Ponto a){
  return Math.sqrt(Math.pow(this.coordx - a.getcoordx(),2) + Math.pow(this.coordy - a.getcoordy(), 2));

  // o "a" repressenta o Ponto.
 }

}
