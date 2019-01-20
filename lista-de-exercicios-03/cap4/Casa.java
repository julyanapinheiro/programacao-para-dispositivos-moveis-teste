//Questão 3
public class Casa{
String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();  
	void pinta(String S){
		this.cor = S;
	}


	int quantasPortasEstaoAbertas(){
		int i = 0;
		if(porta1.aberta == true){
			i += 1;
		}if(porta2.aberta == true){
			i += 1;
		}if(porta3.aberta == true){
			i += 1;
		}
		return i;
	}
	void mostra(){
		System.out.println("Cor da casa: "+this.cor);
		System.out.println("Cor da porta1: "+this.porta1.cor);
		System.out.println("DimensãoX da porta1: "+this.porta1.dimensaoX);
		System.out.println("DimensãoY da porta1: "+this.porta1.dimensaoY);
		System.out.println("DimensãoZ da porta1: "+this.porta1.dimensaoZ);
		System.out.println("Cor da porta2: "+this.porta2.cor);
		System.out.println("DimensãoX da porta2: "+this.porta2.dimensaoX);
		System.out.println("DimensãoY da porta2: "+this.porta2.dimensaoY);
		System.out.println("DimensãoZ da porta2: "+this.porta2.dimensaoZ);
		System.out.println("Cor da porta3: "+this.porta3.cor);
		System.out.println("DimensãoX da porta3: "+this.porta3.dimensaoX);
		System.out.println("DimensãoY da porta3: "+this.porta3.dimensaoY);
		System.out.println("DimensãoZ da porta3: "+this.porta3.dimensaoZ);
		System.out.println("As portas abertas são: "+this.quantasPortasEstaoAbertas());
	}


}
