package Q4;



public class Funcionario {
	private String nome;
	private int matricula;
	private double salario;
	
	
	
	




public Funcionario() {
	 
		
	}

public Funcionario(String nome) {
	this.nome=nome;
	
		
	}

public Funcionario(int matricula, double salario) {
	
	this.matricula =matricula;
	this.salario = salario;
}



public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
	
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}





public String toString(){
	return "Funcionário:" +"   Nome "+getNome()  +"  Matrícula "+getMatricula()+"  Salário "  + getSalario();
}

public static void main(String[] args) {
	 Funcionario f1= new Funcionario(0,00.0);
	 Funcionario f2= new Funcionario(0,00.0);
	 
	
	 f1.setNome("Rai");
	 f2.setNome("José");
	 f1.setSalario(1000.0);
	 f2.setSalario(2000.0);
	 
	 System.out.println("O funcionário  é:   "+f1.toString());
	 System.out.println("O funcionário  é: "+f2.toString());
	 

	}

}
