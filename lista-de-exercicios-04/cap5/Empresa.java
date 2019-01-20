class Empresa {
    String nome;
    String cnpj;
    Funcionario [] empregados;
  
  void adiciona(Funcionario f){
      for (int i=0; i < 10; i++){
          this.empregados[i]=f;
      }
  }
  void mostraEmpregados(){
      for (int i = 0; i < this.empregados.length; i++) {
          System.out.println("Funcionario na posição: " +i);
      }
  }
}