package Q2;



public class Funcionario {
	
	private int matricula;
	private double salario;
	


public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}





public static void main(String[] args) {
	 Funcionario f1= new Funcionario();
	 Funcionario f2= new Funcionario();
	
	 f1.setSalario(1000.0);
	 f2.setSalario(2000.0);
	 
	 System.out.println("O salário é: "+f1.getSalario());
	 System.out.println("O salário é: "+f2.getSalario());
	 

	}

}
