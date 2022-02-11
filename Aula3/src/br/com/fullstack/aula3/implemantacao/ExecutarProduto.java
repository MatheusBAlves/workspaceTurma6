package br.com.fullstack.aula3.implemantacao;

import java.util.Scanner;

import br.com.fullstack.aula3.beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto();
		
		p1.setNome("Notebook 14");
		p1.setValor(1000.0005f);
		System.out.println(p1.detalhe());
		System.out.println(p1.getMarca());
		
		Produto p2 = new Produto("Impressora HP", 100.0f);
		
		System.out.println(p2.detalhe());
		System.out.println(p2.getMarca());
		
		Produto p3 = new Produto("Sansung TV","LG",5000.50f,true);
		System.out.println("p3-"+ p3.detalhe());
		
		System.out.println(p3.getMarca());
		
		Scanner leitor = new Scanner(System.in);
		
		p2.setMarca(leitor.next());
		System.out.println("p2-marca:" + p2.getMarca());
		
		
	}

}
