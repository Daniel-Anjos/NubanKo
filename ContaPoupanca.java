package br;

public class ContaPoupanca extends Conta {
	
	public void rendimento (double perc) {
		perc = getSaldo()*(perc/100); 
		this.setSaldo(getSaldo() + perc);
	}
}
