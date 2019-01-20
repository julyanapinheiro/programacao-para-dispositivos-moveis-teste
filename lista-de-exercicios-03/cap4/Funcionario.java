// Questões capitulo 4
public class Funcionario{
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

    void recebeAumento (double aumento){
        salario+=aumento;    
    }
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
    void mostra(){
        System.out.println("Nome: " + this.nome + "\n Departamento: " + this.departamento + "\n Salario:" + this.salario + "\n Data Entrada " + this.dataEntrada+ "\n RG:"+ this.rg +"\n Salario Atual:" + salario + "\n Ganho por ano: "+ this.calculaGanhoAnual());
        
    }
}
