package br.com.fiap.aula5.util;

import javax.swing.JOptionPane;

public class Input {
	// atributos
	// construtor
	// metodos
	
	public static String texto(String msg) { 
	   return JOptionPane.showInputDialog(msg);
	}
	
	public static float decimal(String msg) {
		return Float.parseFloat(JOptionPane.showInputDialog(msg));
	}
	
	public static boolean logico(String msg) {
		int resp = JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION);
		
		if (resp == 0) {
			return true;
		} 
		return false;
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
}
