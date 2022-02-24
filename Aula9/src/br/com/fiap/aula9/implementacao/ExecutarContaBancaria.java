package br.com.fiap.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.aula9.beans.ContaBancaria;

public class ExecutarContaBancaria {

	public static void main(String[] args) {

		boolean resp = true;
		ContaBancaria cc = new ContaBancaria(5000);

		while (resp = true) {
			try {
				// obter os valores via tela
				// fazer as consistencias da entrada de dados
				// precisa controlar o laço

				System.out.println("saldo:" + cc.getSaldo());

				cc.depositar(1500);

				System.out.println("saldo:" + cc.getSaldo());

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			resp = false;
		}

	}

}
