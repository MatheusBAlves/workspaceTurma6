package br.com.fiap.aula10.implementacao;

import br.com.fiap.aula10.beans.Veiculo;
import br.com.fiap.aula10.dao.VeiculoDao;
import br.com.fiap.aula10.util.Input;

public class ExecutarVeiculo {

	public static void main(String[] args) {

		VeiculoDao veiculoDao = new VeiculoDao();

		String opc;
		String placa;
		Veiculo veiculoLocalizado;

		do {
			opc = Input.texto("===  Controle de Veiculo ==== \n\n "
					+ "Escolha opção: \n<I>ncluir \n<A>lterar \n<C>onsultar \n<E>cluir \n<S>air");

			switch (opc.charAt(0)) {
			case 'I':
				// fazer a inclusao
				Veiculo v = new Veiculo(Input.texto("Placa:"), 
										Input.texto("Modelo:"),
										Input.inteiro("Potencia:"),
										Input.texto("Proprietario:"));
				veiculoDao.incluir(v);
				break;

			case 'A':
				// fazer alteração
				placa = Input.texto("Digite placa de pesquisa para Alterar:");
				
				veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);
				
				veiculoLocalizado.setPotencia(Input.inteiro("Potencia:"));
				veiculoLocalizado.setProprietario(Input.texto("Proprietario:"));
				
				veiculoDao.alterar(veiculoLocalizado);
				
				break;

			case 'C':
				// fazer consulta
				placa = Input.texto("Digite placa de pesquisa:");
				
				veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);
				Input.mensagem("--- Dados do Veiculo ---" 
								+ "\n Placa: " + veiculoLocalizado.getPlaca()
								+ "\n Modelo: " + veiculoLocalizado.getModelo()
								+ "\n Potencia: " + veiculoLocalizado.getPotencia()
								+ "\n Proprietario: " + veiculoLocalizado.getProprietario());
				
				break;

			case 'E':
				// fazer excluir
				placa = Input.texto("Digite placa de pesquisa para Excluir:");
				
				veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);
				
				if (veiculoDao.excluir(veiculoLocalizado)) {
					Input.mensagem("Excluido com sucesso! placa:" + veiculoLocalizado.getPlaca() );
				} else {
					Input.mensagem("Não Localizado ! placa:" + veiculoLocalizado.getPlaca() );
				}
				break;

			case 'S':
				// sair do processo
				break;

			default:
				Input.mensagem("Digite as letras iniciais do menu..");
				break;
			}
		} while (!opc.equalsIgnoreCase("S"));
		System.out.println("Terminou..!");
	}

}
