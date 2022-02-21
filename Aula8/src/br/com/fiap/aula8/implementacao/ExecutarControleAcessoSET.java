package br.com.fiap.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

import br.com.fiap.aula8.util.Input;

public class ExecutarControleAcessoSET {

	public static void main(String[] args) {

		Set<String> controleAcesso = new HashSet<String>();
		String tipo, cracha;
		
		System.out.println("Controle de Acesso");
		
		while (true) {
		
			tipo = Input.texto("Digite <E>ntrada ou <S>aida");
			
			if (tipo.equalsIgnoreCase("E")) {
				cracha = Input.texto("Leitor Cracha:");	
				if (!controleAcesso.contains(cracha)) {
					Input.mensagem("Bem Vindo!  \n\t Acesso Liberado. "+ cracha);
					controleAcesso.add(cracha);
				} else {
					Input.mensagem("Entrada já registrada para esse cracha!"+ cracha+" - Acesso Bloqueado..!");
				}
			}
			if (tipo.equalsIgnoreCase("S")) {
				cracha = Input.texto("Leitor Cracha:");	
				if (!controleAcesso.contains(cracha)) {
					Input.mensagem("Entrada NÃO registada para esse cracha "+ cracha+"! - Acesso Bloqueado para sair");
				} else {
					Input.mensagem("Obrigado pela Visita!"+ cracha);
					controleAcesso.remove(cracha);
				}
			}
		}
	}

}
