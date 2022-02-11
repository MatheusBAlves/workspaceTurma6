package br.com.fiap.aula4.beans;

public class ContaCorrente {
	private int agencia;
	private int numConta;
	private double saldo;
	private Cliente cliente;
	private Banco banco;
	
	//construtor
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numConta, double saldo, Cliente cliente, Banco banco) {
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco;
	}
	

	// Getters + Setters
		
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getnumConta() {
		return numConta;
	}
	public void setnumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	

	// Metodos (operações)
	public void extrato() {
		System.out.println("Cliente: " + this.cliente.getNome() +
				           "  Banco: "+ this.banco.getRazao()  + "  Ag:" + this.agencia + " c/c:" + this.numConta + " saldo:" + this.saldo);
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saque(double valor) {
		if (valor > this.saldo ) {
			System.out.println("Saldo insuficiente para saque");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

}
