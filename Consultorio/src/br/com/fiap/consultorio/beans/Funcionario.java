package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Funcionario extends Pessoa {
	private int id;
	private Date dtadmissao;
	private Date  dtdemissao;
	protected double salario;
	private String departamento;
	
	public Funcionario () {}
	
	public Funcionario(String nome, String cpf, String fone, Date dtadmissao, Date dtdemissao, double salario) {
		super(nome, cpf, fone);
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
		this.salario = salario;
	}
	
	
	public Funcionario(String nome, String cpf, String fone, int id, Date dtadmissao, Date dtdemissao, double salario,
			String departamento) {
		super(nome, cpf, fone);
		this.id = id;
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
		this.salario = salario;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
	
	
	public void pesquisar(){
		System.out.println("Pesquisa dados de Funcionario");
	}
	public void salvar() {
		System.out.println("Salva dados de Funcionario");
	}
	
	public double calcularParticipacaoNosLucros() {
		return this.salario * 0.2;
	}
	
	
}
