package implementacao;

import java.util.Scanner;
import beans.Livro;

public class ExecutarLivro {

	public static void main(String[] args) {
		
		System.out.println("Iniciando..!!");
		
		Livro objetoLivro = new Livro();
		
		objetoLivro.titulo = "Aprendendo JAVA_UML";
		objetoLivro.editora = "Books Editora";
		objetoLivro.numPagina = 100;
		objetoLivro.preco = 150.01;
		objetoLivro.edicao = 2;
		
		System.out.println("Dados do Livro");
		System.out.println("Titulo:" + objetoLivro.titulo);
		System.out.println("Preço: " + objetoLivro.preco);
		
		Livro objetoLivro2 = new Livro();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Titulo:");
		objetoLivro2.titulo = leitor.nextLine();
		System.out.println("Digite o autor");
		objetoLivro2.autor = leitor.nextLine();
		
		System.out.println("Dados do Livro 2");
		System.out.println("Titulo:" + objetoLivro2.titulo);
		System.out.println("Preço: " + objetoLivro2.preco);
		System.out.println("Editora: " + objetoLivro2.edicao);
		
		
		leitor.close();
		
	}

}
