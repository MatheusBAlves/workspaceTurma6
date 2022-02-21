package br.com.fiap.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

import br.com.fiap.aula8.util.Input;

public class ExecutarControleAcessoSET {

	public static void main(String[] args) {

		Set<String> controleAcesso = new HashSet<String>();

		while (true) {

			String cracha = Input.texto("Leitor Cracha:");

			if (!controleAcesso.contains(cracha)) {
				Input.mensagem("Bem Vindo!  \n\t Acesso Liberado.");
				controleAcesso.add(cracha);
			} else {
				Input.mensagem("Obrigado pela visita !");
				controleAcesso.remove(cracha);
			}
		}
	}

}
