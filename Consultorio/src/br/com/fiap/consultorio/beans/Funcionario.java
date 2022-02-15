package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Funcionario extends Pessoa {
	private Date dtadmissao;
	private Date  dtdemissao;
	private double salario;
	
	public Funcionario () {}
	
	public Funcionario(String nome, String cpf, String fone, Date dtadmissao, Date dtdemissao, double salario) {
		super(nome, cpf, fone);
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
		this.salario = salario;
	}
	
	
	public Date getDtadmissao() {
		return dtadmissao;
	}
	public void setDtadmissao(Date dtadmissao) {
		this.dtadmissao = dtadmissao;
	}
	public Date getDtdemissao() {
		return dtdemissao;
	}
	public void setDtdemissao(Date dtdemissao) {
		this.dtdemissao = dtdemissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void pesquisar(){}
	public void salvar() {}
	public void incluir() {};
	public void demitir() {};
	
	
	
}
