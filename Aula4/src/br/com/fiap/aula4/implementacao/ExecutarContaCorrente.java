package br.com.fiap.aula4.implementacao;

import br.com.fiap.aula4.beans.Banco;
import br.com.fiap.aula4.beans.Cliente;
import br.com.fiap.aula4.beans.ContaCorrente;
import br.com.fiap.aula4.util.Input;

public class ExecutarContaCorrente {

	public static void main(String[] args) {
		
		//Dados Fixo
		Cliente cliente1 = new Cliente("Ana Maria Braga","1234567","119998855");
		
		Banco bb = new Banco("Bradesco", 237);
		
		// Abrindo CC 1
		ContaCorrente cliente1CC = new ContaCorrente(1010,10101,500,cliente1, bb);
		cliente1CC.extrato();
		
		// Abrindo CC2  - mesmo cliente/banco
		ContaCorrente cliente1CC2 = new ContaCorrente(1010,10202,50,cliente1, bb);
		cliente1CC2.extrato();
		
		
		// Entrada via tela
		
		Cliente cliente2 = new Cliente(Input.texto("Nome do Cliente"), 
									   Input.texto("CPF"), 
									   Input.texto("Telenone de Contato"));
		
		Banco banco2 = new Banco(Input.texto("Razão Social"),
								 Input.inteiro("Num Banco"));
		
		ContaCorrente contaNew= new ContaCorrente(Input.inteiro("Agencia: "),
												Input.inteiro("Conta: "), 
												Input.decimal("Saldo:"), 
												cliente2, 
												banco2); 
		contaNew.extrato();
	}

}
