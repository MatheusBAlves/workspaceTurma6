package br.com.fiap.aula10.implementacaoView;

import br.com.fiap.aula10.beansModel.Veiculo;
import br.com.fiap.aula10.daoController.VeiculoDao;
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
				try {
					Veiculo v = new Veiculo(Input.texto("Placa:"), 
										Input.texto("Modelo:"),
										Input.inteiro("Potencia:"),
										Input.texto("Proprietario:"),
										Input.inteiro("Ano Fab:"));
					veiculoDao.incluir(v);
				}catch (Exception e) {
					Input.mensagem(e.getMessage());
				}
				break;

			case 'A':
				// fazer alteração
				placa = Input.texto("Digite placa de pesquisa para Alterar:");
				
				try {
					veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);
				
					if 	(veiculoLocalizado == null) {
						Input.mensagem("Veiculo não Localizado");
					} else {
						veiculoLocalizado.setPotencia(Input.inteiro("Potencia:"));
						veiculoLocalizado.setProprietario(Input.texto("Proprietario:"));
				
						veiculoDao.alterar(veiculoLocalizado);
					}
				} catch (Exception e) {
					Input.mensagem(e.getMessage());
				}
				break;

			case 'C':
				// fazer consulta
				placa = Input.texto("Digite placa de pesquisa:");
				try {
					veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);

					if 	(veiculoLocalizado == null) {
						Input.mensagem("Veiculo não Localizado");
					} else {
							
						Input.mensagem("--- Dados do Veiculo ---" 
								+ "\n Placa: " + veiculoLocalizado.getPlaca()
								+ "\n Modelo: " + veiculoLocalizado.getModelo()
								+ "\n Potencia: " + veiculoLocalizado.getPotencia()
								+ "\n Proprietario: " + veiculoLocalizado.getProprietario());
					}
				} catch (Exception e) {
					Input.mensagem(e.getMessage());
				}
				break;

			case 'E':
				// fazer excluir
				placa = Input.texto("Digite placa de pesquisa para Excluir:");
				try {
						
					veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);
					
					if 	(veiculoLocalizado == null) {
						Input.mensagem("Veiculo não Localizado");
					} else {

						if (veiculoDao.excluir(veiculoLocalizado)) {
							Input.mensagem("Excluido com sucesso! placa:" + veiculoLocalizado.getPlaca() );
						} else {
							Input.mensagem("Não Localizado ! placa:" + veiculoLocalizado.getPlaca() );
						}
					}
				} catch (Exception e) {
					Input.mensagem(e.getMessage());
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
