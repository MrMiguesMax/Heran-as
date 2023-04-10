package Entidades;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	public String getDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		return "Acao Concluida";
	}

	public int getIdade() {
		return idade;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}
	
}