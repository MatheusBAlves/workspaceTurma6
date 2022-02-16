package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Gerente extends Funcionario {
	private String deptResponsavel;

	public Gerente () {}
	
	public Gerente(String nome, String cpf, String fone, Date dtadmissao, Date dtdemissao, double salario,
			String deptResponsavel) {
		super(nome, cpf, fone, dtadmissao, dtdemissao, salario);
		this.deptResponsavel = deptResponsavel;
	}

	public String getDeptResponsavel() {
		return deptResponsavel;
	}

	public void setDeptResponsavel(String deptResponsavel) {
		this.deptResponsavel = deptResponsavel;
	}

	@Override
	public double calcularParticipacaoNosLucros() {
		// TODO Auto-generated method stub
		return this.salario * 0.5;
	}
	
	
}
