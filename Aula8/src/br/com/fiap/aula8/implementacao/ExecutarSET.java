package br.com.fiap.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSET {

	public static void main(String[] args) {
		
		Set<String> h_set = new HashSet<String>();
		
		//adicionar
		
		h_set.add("azul");
		h_set.add("amarelo");
		System.out.println(h_set.add("verde"));
		System.out.println(h_set.add("amarelo"));
		
		// listar
		System.out.println(h_set);
		
		for (String elemento: h_set) {
			System.out.println("conteudo: " + elemento);
		}
		
		//tem conteudo ?
		System.out.println("Esta vazia ?" + h_set.isEmpty());
		
		// procurar elemento
		
		System.out.println("Tem a cor azul? " + h_set.contains("azul"));
		System.out.println("Tem a cor cinza? " + h_set.contains("cinza"));
		
		// remover elemento
		h_set.remove("azul");
		System.out.println(h_set);
		
		// trocar o azul por AZUL
		h_set.remove("azul");
		h_set.add("AZUL");
		System.out.println(h_set);
		
		
		
		
	}

}
