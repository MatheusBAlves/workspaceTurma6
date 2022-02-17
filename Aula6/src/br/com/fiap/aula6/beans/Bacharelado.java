package br.com.fiap.aula6.beans;

public class Bacharelado extends Formacao {
	private short cargaHorariaEstagio;
	private String projetoConclusao;

	
	public Bacharelado () {}


	public Bacharelado(String descricao, int duracao, float mensalidade, short periodo, short cargaHorariaEstagio,
			String projetoConclusao) {
		super(descricao, duracao, mensalidade, periodo);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.projetoConclusao = projetoConclusao;
	}


	public short getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}


	public void setCargaHorariaEstagio(short cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}


	public String getProjetoConclusao() {
		return projetoConclusao;
	}


	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	// metodo 

	@Override
	public void calcularMensalidade(double fator) {
		this.mensalidade = (float) (this.duracao * fator * 200) + (this.cargaHorariaEstagio*12);
	}
	

	
	
}
