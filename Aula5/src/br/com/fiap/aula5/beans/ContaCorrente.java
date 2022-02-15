package br.com.fiap.aula5.beans;

public class ContaCorrente extends ContaBancaria {
	
	private double limite;
	private double taxa;
	
	
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numConta, double saldo, Cliente cliente, Banco banco, double limite,
			double taxa) {
		super(agencia, numConta, saldo, cliente, banco);
		this.limite = limite;
		this.taxa = taxa;
	}


	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getLimite() {
		return this.limite;
	}


	public void aumentarLimite(double valor) {
		this.limite = valor;
	}

	
}
