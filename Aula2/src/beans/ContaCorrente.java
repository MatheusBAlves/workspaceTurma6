package beans;

public class ContaCorrente {
	
	private int numero;
	private double saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	// metodo 
	public void deposito(double valor ) {
		//setSaldo( getSaldo() + valor);
		this.saldo = this.saldo  + valor; 
	}
	
	
	
	
	
	
}
