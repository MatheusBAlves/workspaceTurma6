package br.com.fiap.aula6.beans;

public class Tecnologo extends Formacao {
	private boolean planoEstendido;
	
	public Tecnologo () {}

	public Tecnologo(String descricao, int duracao, float mensalidade, short periodo, boolean planoEstendido) {
		super(descricao, duracao, mensalidade, periodo);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	@Override
	public void calcularMensalidade(double fator) {
		this.mensalidade = (float) (this.duracao * fator * 200);
	}
	
	
}
