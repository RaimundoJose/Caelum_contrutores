package Q1;

public class Funcionario {
		private int matricula;
		private double salario;
		
		
		
		private int getMatricula() {
			// TODO Auto-generated method stub
			return this.matricula;
		}
	
//nao consegue imprimir a nao ser que crie o metodo matricula

	public static void main(String[] args) {
	 Funcionario f1 = new Funcionario();
	 f1.matricula = 1;
	 System.out.println("A matricula é: "+f1.getMatricula());

	}






	
}
