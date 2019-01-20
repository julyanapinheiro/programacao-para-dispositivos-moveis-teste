public class TestaEmpresa{
    public static void main (String[]args){
        Empresa empresa = new Empresa();
        empresa.empregados = new FuncionarioCap5[10];
        
        FuncionarioCap5 f1 = new FuncionarioCap5();
        empresa.adiciona(f1);
        FuncionarioCap5 f2 = new FuncionarioCap5();
        empresa.adiciona(f2);
        
        empresa.mostraEmpregados();
       }
 }
