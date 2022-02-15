package br.com.fiap.consultorio.beans;

import br.com.fiap.consultorio.interfaces.crud;

public abstract class Pessoa implements crud {
	private String nome;
	private String cpf;
	private String fone;
	
	public Pessoa (){}
	
	public Pessoa(String nome, String cpf, String fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
		
	public void remover() {}
	//public void alterar() {
	//	System.out.println("Alterar da class: Pessoa");
	//}
	//public void consultar() {}
		
	
	
}
