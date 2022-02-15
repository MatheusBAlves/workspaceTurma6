package br.com.fiap.aula5.beans;

public class Poupanca extends ContaBancaria {

	private double rendimento;

	//construtor
	public Poupanca() {};
	
	public Poupanca(int agencia, int numConta, double saldo, Cliente cliente, Banco banco, double rendimento) {
		super(agencia, numConta, saldo, cliente, banco);
		this.rendimento = rendimento;
	}
	
	public Poupanca(int agencia, int numConta ){
		super(agencia, numConta);
	}
	
	
	// getter + seters
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	// metodo (operação)
	
	public void creditarRendimento() {
		double valor = (this.rendimento/100) * this.saldo;
		this.saldo = this.saldo + valor;
	}
	
}
