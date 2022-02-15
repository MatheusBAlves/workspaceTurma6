package br.com.fiap.aula5.implementacao;

import br.com.fiap.aula5.beans.Banco;
import br.com.fiap.aula5.beans.Cliente;
import br.com.fiap.aula5.beans.ContaCorrente;
import br.com.fiap.aula5.beans.Poupanca;

public class ExecutarContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dados Fixo
		Cliente cliente1 = new Cliente("Ana Maria Braga","1234567","119998855");
		
		Banco bb = new Banco("Bradesco", 237);
		
		Poupanca pp = new Poupanca();
		
		pp.setAgencia(1010);
		pp.setnumConta(1010111);
		pp.setBanco(bb);
		pp.setCliente(cliente1);
		
		pp.deposito(100);
		pp.extrato();
		
		Poupanca pp2 = new Poupanca(1010, 1010112, 50, cliente1, bb, 10);
		
		
		pp2.extrato();
		pp2.creditarRendimento();
		pp2.extrato();
		
		
		ContaCorrente cc = new ContaCorrente(1020,102022,600,cliente1,bb,1000,20);
		
		cc.extrato();
		
		
	}

}
