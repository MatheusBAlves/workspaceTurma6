package br.com.fiap.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.aula9.beans.Login;

public class ExecutarLogin {

	public static void main(String[] args) {

		String usuario = JOptionPane.showInputDialog("Usuario de Acesso:");
		String senha = JOptionPane.showInputDialog("Senha de Acesso:");

		Login login = new Login();

		if (login.fazeLogin(usuario, senha)) {
			JOptionPane.showMessageDialog(null, "Credenciais aceitas...");
		} else
			JOptionPane.showMessageDialog(null, "Credenciais invalidas...");

	}

}
