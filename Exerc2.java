package Principal;

import java.util.Scanner;

import Entidades.Pessoa;
import Entidades.Aluno;

public class Exerc2 {

	public static void main(String[] args) {
		int escolha, idade = 0;
		String nome = null, curso = null;
		
		
		Scanner lerdados = new Scanner(System.in);
		Pessoa pessoas = new Pessoa(nome, idade);
		Aluno alunos = new Aluno(nome, idade, curso); 
		
		System.out.println("Quer se increver!");
		System.out.println("Escolha umas das opcoes abaixo");
		System.out.println("1 para Aluno");
		System.out.println("2 para Outros");
		escolha = lerdados.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = alunos.setNome(nome);
			System.out.println("Idade: ");
			idade = lerdados.nextInt();
			idade = alunos.setIdade(idade);
			System.out.println("Curso: ");
			curso = lerdados.next();
			curso = alunos.setCurso(curso);
			System.out.println("Nome: " + nome);
			System.out.println("Idade : " + idade);
			System.out.println("Curso : " + curso);
			break;
		case 2:
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = pessoas.setNome(nome);
			System.out.println("Idade: ");
			idade = lerdados.nextInt();
			idade = pessoas.setIdade(idade);
			System.out.println("Nome: " + nome);
			System.out.println("Idade : " + idade);
		}
		lerdados.close();
	}

}
