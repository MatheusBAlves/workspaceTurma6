package br.com.fiap.aula7.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.aula7.beans.Aluno;

public class ExecutarArrayList {

	public static void main(String[] args) {

		List<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("Ana");
		listaNomes.add("Maria");
		listaNomes.add("Beatriz");
		listaNomes.add("Jose");
		listaNomes.add(0,"Pedro");
		listaNomes.add("Cris");
		
		System.out.println("Tamanho da lista: " + listaNomes.size());
		System.out.println("Mostrar conteudo: " + listaNomes.get(0));
		
		Collections.sort(listaNomes);
		
		System.out.println("Conteudo: " + listaNomes);
		
		// Pesquisar 
		String pesquisa = JOptionPane.showInputDialog("Nome para pesquisa");
		
		int posicao = listaNomes.indexOf(pesquisa);
		if (posicao >= 0) {
			System.out.println("Encontrou na posição: " + posicao);
		}else {
			System.out.println("Não localizado..!");
		}
		
		// Trabalhando com classe
		
		System.out.println("--- Agora é Classe :-) ");
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("Pedro", 8, 50, 20);
		Aluno a2 = new Aluno("Ana", 9, 5, 21);
		Aluno a3 = new Aluno("Maria", 8, 0, 18);
		
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		listaAlunos.add(a3);

		System.out.println("Tamanho da lista: " + listaAlunos.size());
		
		System.out.println("Mostrar posicao [2]" + listaAlunos.get(2).toString());
		
		for (Aluno item: listaAlunos ) {
			System.out.println(item.getNome() +" : " + item.getIdade());
		}
		
		Collections.sort(listaAlunos);
		
		System.out.println("Ordem por Nome: " + listaAlunos);
		

		
		
		
	}

}
