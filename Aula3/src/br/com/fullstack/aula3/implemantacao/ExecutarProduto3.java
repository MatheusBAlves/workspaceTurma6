package br.com.fullstack.aula3.implemantacao;

import br.com.fullstack.aula3.beans.Produto;
import br.com.fullstack.aula3.util.Input;

public class ExecutarProduto3 {
	
	public static void main(String[] args) {

		
		Produto p1 = new Produto();
		
		p1.setMarca(Input.texto("Informe a Marca"));
		p1.setNome(Input.texto("Informe a Nome/Descrição"));
		p1.setValor(Input.decimal("Informe o Valor"));
		p1.setPromocao(Input.logico("Esta em promoção?"));
		System.out.println(p1.detalhe());
	}	
 
}
