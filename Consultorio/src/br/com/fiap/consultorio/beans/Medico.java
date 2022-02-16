package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Medico extends Funcionario {
	private String especialidade;
	private String crm;
	
	public Medico() {}
	
	// #Dica: novo construtor baseado no Funcionario
	public Medico(String nome, String cpf, String fone, Date dtadmissao, Date dtdemissao, double salario,
			String especialidade, String crm) {
		super(nome, cpf, fone, dtadmissao, dtdemissao, salario);
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

	@Override
	public double calcularParticipacaoNosLucros() {
		return this.salario * 0.6;
		
		// caso não usar o modificado "protected"
		//return this.getSalario() * 0.6;
	}

	
	
}
