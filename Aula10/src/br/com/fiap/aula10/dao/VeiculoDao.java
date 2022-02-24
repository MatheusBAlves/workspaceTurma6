package br.com.fiap.aula10.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.aula10.beans.Veiculo;

public class VeiculoDao {

	// --- objetivo de simular um BD
	List<Veiculo> bancoDeVeiculos = new ArrayList<Veiculo>();
	// ---

	public VeiculoDao() {
	}

	public boolean ConectarBD(String UrlConexaoBD) {
		// Neste ponto deveria estabelecer todos os passos para criar uma conexão no
		// Banco de Dados
		return true;
	};

	public boolean incluir(Veiculo v) {
		// salvar no banco
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return false;
		}
		bancoDeVeiculos.add(v);
		System.out.println("SALVAR OK");
		return true;
	}

	public boolean alterar(Veiculo v) {
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return false;
		}
		
		for(Veiculo elemento: bancoDeVeiculos ) {
			if (elemento.getPlaca().equalsIgnoreCase(v.getPlaca())) {
				bancoDeVeiculos.remove(elemento);
				bancoDeVeiculos.add(v);
				System.out.println("ALTERAR OK");
				return true;
			}
		}
		return false;
	}

	public Veiculo consultarPorPlaca(String placa) {
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return null;
		}

		for (Veiculo elemento : bancoDeVeiculos) {
			if (elemento.getPlaca().equalsIgnoreCase(placa))
				System.out.println("CONSULTAR OK");
				return elemento;
		}
		return null;
	}

	public boolean excluir(Veiculo v) {
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return false;
		}
		for(Veiculo elemento: bancoDeVeiculos ) {
			if (elemento.getPlaca().equalsIgnoreCase(v.getPlaca())) {
				bancoDeVeiculos.remove(elemento);
				System.out.println("EXCLUIR OK");
				return true;
			}
		}
		return false;
	}

}
