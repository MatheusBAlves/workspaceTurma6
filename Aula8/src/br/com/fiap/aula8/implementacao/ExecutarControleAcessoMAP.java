package br.com.fiap.aula8.implementacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.aula8.util.Input;

public class ExecutarControleAcessoMAP {

	public static void main(String[] args) {
		
		Map<String,Date> controleAcesso = new HashMap<String,Date>();
				
		DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		String tipo, cracha;
		
		System.out.println("Controle de Acesso");
		
		while (true) {
		
			tipo = Input.texto("Digite <E>ntrada ou <S>aida");
			if (tipo.equalsIgnoreCase("E")) {
				cracha = Input.texto("Leitor Cracha:");	
				if (!controleAcesso.containsKey(cracha)) {
					Input.mensagem("Bem Vindo!  \n\t Acesso Liberado. "+ cracha);
					
					//captura data do sistema
					Date dataSistema = new Date();
					controleAcesso.put(cracha, dataSistema);
					
				} else {
					Input.mensagem("Entrada já registrada para esse cracha!"+ cracha
							  +" - Acesso Bloqueado..! \n\t "+ dataFormat.format(controleAcesso.get(cracha)));
										
				}
			}
			if (tipo.equalsIgnoreCase("S")) {
				cracha = Input.texto("Leitor Cracha:");	
				if (!controleAcesso.containsKey(cracha)) {
					Input.mensagem("Entrada NÃO registada para esse cracha "+ cracha+"! - Acesso Bloqueado para sair");
				} else {
					Input.mensagem("Obrigado pela Visita!"+ cracha + "-"+ dataFormat.format(controleAcesso.get(cracha)));
					controleAcesso.remove(cracha);
				}
			}
			System.out.println(controleAcesso.entrySet());

		}

	}

}
