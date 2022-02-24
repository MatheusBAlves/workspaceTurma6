package br.com.fiap.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.aula9.excecao.meuControleException;

public class ExecutarMeuControleException {

	public static void main(String[] args) throws meuControleException  {

		try {
			int vl1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1"));
			int vl2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2"));

			JOptionPane.showMessageDialog(null, "Resultado:" + (vl1 / vl2));

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Estamos com indisponibilidade..!!");
			throw new meuControleException("EMAIL", e);
		
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null,"Estamos com indisponibilidade..!!");
			throw new meuControleException("LOG", e);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Estamos com indisponibilidade..!!");
			throw new meuControleException("ERRO", e);
		} finally {
			JOptionPane.showMessageDialog(null, "Processo finalizado");
		}
		
	}

}
