package br;


public class ContaCorrente extends Conta {
	private double limite;
	
	//Verificar este método pois aqui ele não altera o valor do limite
	
	public void saque(double val) {
		if (this.getSaldo() + limite >= val) {
			this.setSaldo(this.getSaldo() - val);
			System.out.println("Saque de R$"+ val + "realizado com sucesso!");
			System.out.println("Seu saldo agora é de R$"+ this.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para completar esta transação");
		}
	}
	
	public void transferencia(double val, Conta ct) {
		
	}
	
}
