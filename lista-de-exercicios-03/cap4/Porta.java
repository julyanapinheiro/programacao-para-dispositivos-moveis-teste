//Questão 2
public class Porta{
String cor;
  boolean aberta;
  int dimensaoX;
  int dimensaoY;
  int dimensaoZ;
  void abre(){
    aberta = true;
  }
  void fecha(){
    aberta = false;
  }
  void pinta(String s){
    this.cor = s;
  }
  void estaAberta(){
    if(aberta == true){
      System.out.println("Está aberta!");
    }else {
      System.out.println("Está fechada!");
    }
  }
  void mostra(){
    System.out.println("A cor da porta é: "+this.cor);
    System.out.println("A dimensão X é: "+this.dimensaoX);
    System.out.println("A dimensão Y é: "+this.dimensaoY);
    System.out.println("A dimensão Z é: "+this.dimensaoZ);
  }
}
