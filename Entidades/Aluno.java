package Entidades;

public class Aluno extends Pessoa{
	private String Curso;
	
	public Aluno(String nome, int idade, String Curso) {
		super (nome, idade);
		this.Curso = Curso;
	}
	
	public String getDados() {
		System.out.println();
		System.out.println();
		System.out.println();
		return "Acao concluida";
	}

	public String getCurso() {
		return Curso;
	}

	public String setCurso(String curso) {
		return this.Curso = curso;
	}
	
}