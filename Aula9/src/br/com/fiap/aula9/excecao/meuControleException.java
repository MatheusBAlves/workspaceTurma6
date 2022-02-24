package br.com.fiap.aula9.excecao;

public class meuControleException extends Exception {

	private static final long serialVersionUID = 1L;
	// atributos
	private String smtpServer = "smtp://www.fiap.com.br";
	private String smtpPorta  = "22";
	
	public meuControleException(String message, Exception ex) {
		super(message, ex);
		
		print();

		if (message.equalsIgnoreCase("email")) {
			enviarEmail();
		}
		if (message.equalsIgnoreCase("log")) {
			logBanco();	
		}
	}
	
	public void enviarEmail() {
		System.out.println("Abrindo conexão email:");
		System.out.println("email Suporte: Suporte@fiap.com.br");
		System.out.println("==== Detalhe ====");
		System.out.println(getMessage());
		printStackTrace();
	}
	
	public void logBanco() {
		System.out.println("Abrindo conexão DB:");
		System.out.println("==== Gravando Detalhe ====");
		System.out.println(getMessage());
		printStackTrace();
	}
	
	public void print() {
		System.out.println("=== Meu Exception ===");
		System.out.println(getMessage());
	}
	
	
}
