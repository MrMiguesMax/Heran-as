package Principal;

import java.util.Scanner;
import Entidades.Alunos;
import Entidades.Pessoa1;
import Entidades.Professor;

public class Exerc1 {

	public static void main(String[] args) {
		int escolha, ID = 0, materia, Turma;
		String nome = null, mat�ria = null, turma = null;
		Scanner lerdados = new Scanner (System.in);
		
		Pessoa1 pessoa = new Pessoa1(nome, ID);
		Alunos aluno = new Alunos (mat�ria, ID);
		Professor prof = new Professor (turma, ID);

		System.out.println("Antes de come�ar, digite a seguinte informacao");
		System.out.println("1 para Aluno");
		System.out.println("2 para Professor");
		escolha = lerdados.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			System.out.println("Informe o seu ID (numero de identificacao): ");
			ID = lerdados.nextInt();
			System.out.println("Informe o numero de mat�rias: ");
			materia = lerdados.nextInt();
			String[] Nmateria = new String [materia];
			for(int i=0; i<materia; i++) {
					System.out.printf("Informe as mat�rias[%s]:",i);
					Nmateria[i]=lerdados.next();
		}
			System.out.println("Estou Estudando!!");
			break;
		case 2:
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			System.out.println("Informe o seu ID (numero de identificacao): ");
			ID = lerdados.nextInt();
			System.out.println("Informe o numero de turmas: ");
			Turma = lerdados.nextInt();
			String[] Nturma = new String [Turma];
			for(int j=0; j<Turma; j++) {
					System.out.printf("Informe as turmas[%s]:",j);
					Nturma[j]=lerdados.next();
		}
			System.out.println("Estou Ensinado!!");
			break;
			default:
				System.out.println("Numero incorreto, tente novamente.");
		}
	}
}