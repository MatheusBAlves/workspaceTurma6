package br.com.fullstack.aula3.beans;


public class Produto {

	private String nome;
	private String marca;
	private float valor;
	private boolean promocao;
	
	//Construtor
	public Produto() {		
	}
	
	public Produto(String nome, float valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public Produto(String nome, float valor, String marca) {
		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
	}
	
	public Produto(String nome, String marca, float valor, boolean promocao) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}
	
	

	// getter + setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
	// operação (metodos)
	
	public String detalhe() {
		return "Produto: " + this.nome + " valor: " + this.valor + " Marca: " 
						+ this.marca + " Promoção: " + this.promocao;
	}
	
	
	
}
