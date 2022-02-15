package br.com.fiap.consultorio.beans;

public class Medico extends Pessoa {
	private String especialidade;
	private String crm;
	
	public Medico() {}
	
	public Medico(String nome, String cpf, String fone, String especialidade, String crm) {
		super(nome, cpf, fone);
		this.especialidade = especialidade;
		this.crm = crm;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
	public void incluir() {};
	
	public void criar() {}
	public void alterar() {
		System.out.println("Alterar do Class: Medido");
	}
	public void pesquisar() {}
	
	
	
	
}
