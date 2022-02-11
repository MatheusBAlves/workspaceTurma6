package br.com.fiap.aula4.implementacao;

import br.com.fiap.aula4.beans.Motor;
import br.com.fiap.aula4.beans.Veiculo;

public class ExecutarVeiculo {

	public static void main(String[] args) {

		Veiculo fusca = new Veiculo();
		
		Motor motorizacao = new Motor(50,4,"gasolina");
		
		
		fusca.setCategoria("compacto");
		fusca.setPlaca("ABC123A");
		fusca.setMotorizacao(motorizacao);
		
		
		System.out.println("Dados do veiculo: placa:" + fusca.getPlaca() + " - classe Motor:" + fusca.getMotorizacao());
		System.out.println("Dados do veiculo: placa:" + fusca.getPlaca() + 
					" - classe Motor:" + fusca.getMotorizacao() + 
					" conteudo motor: "+ fusca.getMotorizacao().getCombustivel());
		
	}
}
