package Q6;



public class Funcionario {
	private String nome;
	private int matricula;
	private double salario;
	private static int  identificador=0;
	
	


public Funcionario() {
	 Funcionario.getIdentificador();
		
	}

public Funcionario(String nome) {
	this.nome=nome;
	 Funcionario.getIdentificador();
		
	}

public Funcionario(int matricula, double salario) {
	
	this.matricula =Funcionario.getIdentificador();
	this.salario = salario;
}

/*public void getCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;}
		private void validaCPF(String cpf) {
		// s�rie de regras aqui, falha caso nao seja v�lido
		}
		*/

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

private static int getIdentificador(){
	return ++ identificador;
}



public String mostraTudo(){
	return "Funcion�rio:" +"   Nome "+getNome()  +"  Matr�cula "+getMatricula()+"  Sal�rio "  + getSalario();
}


}
