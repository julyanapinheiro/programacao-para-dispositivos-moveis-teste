class BalancoTrimestral{
	public static void main(String[] args){

		int janeiro = 15000;
		int fevereiro = 23000;
		int marco = 17000;
		int gastoTotal = janeiro + fevereiro + marco;
		int mediaMensal = janeiro + fevereiro + marco/3;
		System.out.println("Valor da media mensal: " + mediaMensal);
		System.out.println("Valor do gasto total e: " + gastoTotal);
	}
}