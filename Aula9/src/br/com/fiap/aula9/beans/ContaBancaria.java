package br.com.fiap.aula9.beans;

public class ContaBancaria {
	private double saldo;

	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String sacar(double valor) {
		// regra de negocio
		return "saque";
	}
	
	public void depositar( double valor) throws Exception {
		//regra de negocio
		if (valor > 1000) {
			throw new Exception("Valor não permitido para operação de deposito.");
		}
		this.saldo = this.saldo + valor; 
	}
	
	
}
