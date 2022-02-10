package implemantacao;

import beans.ContaBancaria;
import util.Input;

public class ExecutarConta {

	public static void main(String[] args) {
		
		ContaBancaria cc = new ContaBancaria(Input.texto("Informe Numero:"),
											 Input.texto("Cliente:"), 
											 Input.decimal("Qual o valor de Limite?"), 
											 Input.texto("Informe tipo 'corrrente' ou 'poupança'"));
		
		cc.extrato();
		
		cc.deposito(Input.decimal("Qual o deposito:"));
		cc.saque(Input.decimal("Valor de Saque:"));
		cc.saque(Input.decimal("Valor de Saque:"));

	}

}
