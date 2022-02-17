package br.com.fiap.aula6.beans;

public abstract class Formacao {
	protected String descricao;
	protected int duracao;
	protected float mensalidade;
	protected short periodo;

	public Formacao() {}

	public Formacao(String descricao, int duracao, float mensalidade, short periodo) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
		this.periodo = periodo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public short getPeriodo() {
		return periodo;
	}

	public void setPeriodo(short periodo) {
		this.periodo = periodo;
	}

	// metodos

	public float retornarMedia(float ps1, float ps2) {
		return (ps1 + ps2) / 2;
	}

	public float retornarMedia(float ps1, float ps2, float nac1, float nac2) {
		return (((ps1 + ps2) / 2) + ((nac1 + nac2) / 2) * 0.05f);
	}

	public float retornarMedia(float ps1, float ps2, float nac1, float nac2, float am1, float am2) {
		return (ps1 + ps2 + nac1 + nac2 + am1 + am2) / 6;
	}
	
	public void definirDucacao() {
		//
	}
	
	public void calcularMensalidade(double fator) {
		
	}

}
