public class Aluno {
	
	public String Matricula;
	public String Nome;
	public int Idade;
	public String RG;
	
	private double Nota1;
	private double Nota2;
	public double Nota3;
	public double Nota4;
	
	public Aluno(double nota1, double nota2) {
		Nota1 = nota1;
		Nota2 = nota2;
	}
	
	public void Media() {
		double media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		System.out.println("A média é: " + media);
	}

}
