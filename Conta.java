package br;

public class Conta {
	
	protected int agencia;
	protected int numero;
	protected int digito;
	protected double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	//Validar se faz sentido o get e set saldo já que as operações de saque e depósito movimentam
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void saque(double val) {
		  this.setSaldo(val); 
	}  
	
	public void deposito(double val) {
		
	}
	
	public void transferencia(double val, Conta ct) {
		
	}
	
	public void saldo() {
		System.out.println("***** Dados Da Conta *****");
		System.out.println("Numero: "+ this.getNumero());
		System.out.println("Dígito" + this.getDigito() );
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Saldo: R$"+ this.getSaldo());
	}
}
