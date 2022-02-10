package beans;

public class ContaBancaria {
	private String numero;
	private double saldo;
	private String cliente;
	private double limiteEspecial;
	private String tipo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String numero, String cliente, double limiteEspecial, String tipo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.limiteEspecial = limiteEspecial;
		this.tipo = tipo;
	}

	// getter + setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// operações Metodos
	
	public String deposito(double valor) {
		this.saldo = this.saldo + valor;
		extrato();
		return "Operação realizada com Sucesso.!";
	}
	
	public String saque(double valor) {
		if ( valor > (this.saldo + this.limiteEspecial)) {
			System.out.println("Valor indisponivel");
		} else {
			this.saldo = this.saldo - valor;
			extrato();
			return "Operação realizada com Sucesso.!";
		}
		return "Sem Saldo.!";
	}
	
	public void extrato() {
		System.out.println("Cliente: " + this.cliente + "Conta:" + this.numero + " Limite: "
								+ this.limiteEspecial + " saldo:" + this.saldo);
	}
	
	public String definirLimite(double valor) {
		if (this.tipo.equals("corrente")) {
			this.limiteEspecial = valor;
			return "Operação realizada com Sucesso.!";
		}
		return "Tipo de Conta Invalida.!";
	}
	
	

	
	
}
