package br.com.fiap.consultorio.beans;

public class Gerente extends Funcionario {
	private String deptResponsavel;

	
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
