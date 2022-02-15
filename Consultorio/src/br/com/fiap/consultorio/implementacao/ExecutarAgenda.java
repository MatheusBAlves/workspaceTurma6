package br.com.fiap.consultorio.implementacao;

import br.com.fiap.consultorio.beans.Funcionario;
import br.com.fiap.consultorio.beans.Medico;
import br.com.fiap.consultorio.beans.Paciente;
import br.com.fiap.consultorio.beans.Pessoa;

public class ExecutarAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente paciente = new Paciente("Fausto Silva","1345679","998989898");
		
		System.out.println(paciente.getNome());
		paciente.alterar();
		
		Medico medico = new Medico("Dr. Fausto","123789789","9999999","Cardiologista","101010");
		
		System.out.println(medico.getNome() + " : " + medico.getEspecialidade());
		medico.alterar();
		
		Funcionario fun = new Funcionario();
		fun.setNome("Funcionario ANA");
		
		System.out.println(fun.getNome());
		
		
		//Pessoa p = new Pessoa("MARIO", "12346","989898");
		//System.err.println(p.getNome());

	}

}
