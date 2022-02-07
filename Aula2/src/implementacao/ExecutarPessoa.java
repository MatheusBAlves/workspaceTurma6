package implementacao;

import beans.Pessoa;

public class ExecutarPessoa {

	public static void main(String[] args) {
		

		System.out.println("Funcionou!!");
		
		Pessoa cliente1 = new Pessoa();
		
		//cliente1.nome = "Ana Maria";
		//cliente1.idade = -10;
		cliente1.setNome("Fausto Silva");
		cliente1.setIdade(30);
		System.out.println("Cliente:" + cliente1.getNome());
		System.out.println("Idade:" + cliente1.getIdade());		
		
		
		//cliente1.idade = 30;
		
		//cliente1.comer("BigMac");
		//cliente1.dormir(5);
		
		//System.out.println("Idade:" + cliente1.idade);		
		
	}

}
