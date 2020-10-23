
public class Main {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno(8.1,9.1);
		aluno.Nota3 = 7.2;
		aluno.Nota4 = 5.5;
		aluno.Matricula = "xyz123";
		aluno.Nome = "João";
		aluno.Idade = 15;	
		
		System.out.println("O nome do aluno é: " + aluno.Nome);
		System.out.println("A matrícula do aluno é: " + aluno.Matricula);
		System.out.println("A idade do aluno é: " + aluno.Idade);
		aluno.Media();


	}

}
