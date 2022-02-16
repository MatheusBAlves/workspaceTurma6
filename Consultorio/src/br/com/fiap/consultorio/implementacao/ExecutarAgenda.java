package br.com.fiap.consultorio.implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.com.fiap.consultorio.beans.Funcionario;
import br.com.fiap.consultorio.beans.Gerente;
import br.com.fiap.consultorio.beans.Medico;
import br.com.fiap.consultorio.beans.Paciente;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

		
		Paciente paciente = new Paciente("Fausto Silva","1345679","998989898");

		Funcionario fun = new Funcionario("Ana Maria","Cpf12346","98989898",formatarData.parse("03/02/2022"), null, 500);
		
		Medico medico = new Medico("Dr. Fausto","CPF123789789","9999999",formatarData.parse("16/02/2022"),null,5000,"Cardiologista","101010");

		Gerente g = new Gerente("BONINHO", "Cpf1234679", "9999999", null, null, 10000, "Finanças");
				
				
		JOptionPane.showMessageDialog(null, "Funcionario: " + fun.getNome() + "\n\tSalario: "+ fun.getSalario() + "\n\tParticipação: " + fun.calcularParticipacaoNosLucros());
		JOptionPane.showMessageDialog(null, "Medico: " + medico.getNome() + " \n\tSalario: " + medico.getSalario() + "\n\tParticipação: " + medico.calcularParticipacaoNosLucros() );
		JOptionPane.showMessageDialog(null, "Gerente: " + g.getNome() + " \n\tSalario: " + g.getSalario() + "\n\tParticipação: " + g.calcularParticipacaoNosLucros() );

		
	}

}
