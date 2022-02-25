package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Agendamento {
	// atributos
	private Paciente paciente;
	private Date dataHora;
	private Medico medico;
	private double valor;
	private Funcionario atendente;
	
	// Construtor
	public Agendamento() {}
	
		
	public Agendamento(Paciente paciente, Date dataHora, Medico medico, double valor, Funcionario atendente) {
		super();
		this.paciente = paciente;
		this.dataHora = dataHora;
		this.medico = medico;
		this.valor = valor;
		this.atendente = atendente;
	}


	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}


	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}


	// Getters Setters
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// Metodos
	public void agendar() {
		System.out.println("Paciente: " + paciente.getNome() + " fone: "+ paciente.getFone()  
					+ " data:" + this.dataHora + " Medico:" + medico.getEspecialidade() + " Atendente: " + atendente.getNome());
	}
}
