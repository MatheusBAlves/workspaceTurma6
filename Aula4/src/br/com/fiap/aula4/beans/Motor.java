package br.com.fiap.aula4.beans;


public class Motor {
	
	// atributos
	private int potencia;
	private int cilindro;
	private String combustivel;

	//Contrutor
	
	public Motor() {
	}
	
	public Motor(int potencia, int cilindro, String combustivel) {
		this.potencia = potencia;
		this.cilindro = cilindro;
		this.combustivel = combustivel;
	}
	
	// get+set
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindro() {
		return cilindro;
	}

	public void setCilindro(int cilindro) {
		this.cilindro = cilindro;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	// metodos (operadores)
	public void ligar() {
		System.out.println("Ligou..!");
	}
	
	public void desligar() {
		System.out.println("Desligou..!");		
	}
	
}
