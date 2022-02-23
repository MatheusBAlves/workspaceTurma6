package br.com.fiap.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutarException {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		try {
			System.out.println("Dig vl1:");
			int vl1 = s.nextInt();
			System.out.println("Dig vl2:");
			int vl2 = s.nextInt();

			System.out.println("Divisão: " + (vl1 / vl2));
		} catch (ArithmeticException e) {
			System.out.println("Não é possivel realizar divisão por ZERO");
			
		} catch (InputMismatchException e) {
		    System.err.println("meu... vc tem q digitar numeros :) ");
		    
		} catch (Exception e) {
			//tratar a mensagem de erro
			System.out.println("Ocorreu ERRO:");
			System.out.println(e.getClass());
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim da rotina");

		
		// Gerando minha Exceção (chamar um Exception)

		try {
			System.out.println("Digite a palavra secreta:");
			String palavra = s.nextLine();
	
			if (! palavra.equalsIgnoreCase("java") ) {
				throw new Exception("Palavra invalida");
			}
			System.out.println("Acertou :) ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Passou por Finally");
			System.out.println("Fecha conexao DB / Limpa os dados de Tela");
		}
		
		System.out.println("Final do processo");
		
	}

}
