public class TestaFuncionario {
    
    public static void main (String[] args){
        Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
        f1.nome="Juliana";
        f1.salario=998;
        f1.recebeAumento(230);
        
        f1.mostra(); 
      	f2.mostra();
        
    }
}