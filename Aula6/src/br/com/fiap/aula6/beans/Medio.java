package br.com.fiap.aula6.beans;

public class Medio extends Formacao {
	private String tipo;
	
	public Medio () {}

	public Medio(String descricao, int duracao, float mensalidade, short periodo, String tipo) {
		super(descricao, duracao, mensalidade, periodo);
		this.tipo = tipo;
	}
	
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void calcularMensalidade(double fator) {
		// TODO Auto-generated method stub
		this.mensalidade = (float) (this.duracao * fator * 100);
	}
	
	
}
