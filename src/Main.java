
public class Main {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno(8.1,9.1);
		aluno.Nota3 = 7.2;
		aluno.Nota4 = 5.5;
		aluno.Matricula = "xyz123";
		aluno.Nome = "Jo�o";
		aluno.Idade = 15;	
		
		System.out.println("O nome do aluno �: " + aluno.Nome);
		System.out.println("A matr�cula do aluno �: " + aluno.Matricula);
		System.out.println("A idade do aluno �: " + aluno.Idade);
		aluno.Media();


	}

}
