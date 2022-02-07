package beans;

public class Pessoa {
	
	// Atributos 
	private int id;
	private String nome ;
	private int idade;
	private String cidade;
	private String sentimento;
	
	// setters
	public void setNome(String nomeParametro) {
		this.nome = nomeParametro;
	}
	public void setIdade(int valor) {
		if (valor < 0) {
			this.idade = 0;
		} else {
			this.idade = valor;
		}
	}
	
	// getter  
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	
	
	
	// metodos + operações
	public void comer(String alimento) {
		System.out.println("Matando a Fome..!!" + alimento);
	}
	public void dormir(int tempo) {
		System.out.println("Tempo para descansar:" + tempo);
	}
	
}
