package br.com.fiap.consultorio.beans;

import br.com.fiap.consultorio.interfaces.persistencia;

public abstract class Pessoa implements persistencia {
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

}
