package br.com.fiap.aula6.implementacao;

import br.com.fiap.aula6.beans.Medio;
import br.com.fiap.aula6.beans.Tecnologo;

public class ExecutarFormacao {

	public static void main(String[] args) {

		Medio m = new Medio("Ensino Medio", 3 , 0f, (short) 1,"obrigatorio");
		
		System.out.println("Medio Mensalidade: " + m.getMensalidade());
		m.calcularMensalidade(5);
		System.out.println("Medio Mensalidade (fator 5): " + m.getMensalidade());
	
		Tecnologo t = new Tecnologo("Ensino Tecnologo",2,0f,(short) 2, true);
		
		System.out.println("Tecnologo Mensalidade: " + t.getMensalidade());
		t.calcularMensalidade(5);
		System.out.println("Tecnologo Mensalidade (fator 5): " + t.getMensalidade());
		
		
		System.out.println("Tecnologo:" +  t.getDuracao());
		
		t.setDuracao(100);
		
		System.out.println("Tecnologo:" +  t.getDuracao());
	}

}
