class TestaCasa{
public static void main(String[] args) {
    Casa casa = new Casa();
    
    casa.cor = "Branca";
    casa.porta1.cor = "Verde";
    casa.porta1.dimensaoX = 10;
    casa.porta1.dimensaoY = 20;
    casa.porta1.dimensaoZ = 5;
    casa.porta1.abre();
    casa.porta2.cor = "Verde";
    casa.porta2.dimensaoX = 10;
    casa.porta2.dimensaoY = 20;
    casa.porta2.dimensaoZ = 5;
    casa.porta2.abre();
    casa.porta3.cor = "Verde";
    casa.porta3.dimensaoX = 10;
    casa.porta3.dimensaoY = 20;
    casa.porta3.dimensaoZ = 5;
    casa.porta3.abre();
    casa.mostra();
    casa.quantasPortasEstaoAbertas();
  }
}