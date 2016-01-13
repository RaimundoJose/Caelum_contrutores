
public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	
	public double getSalarioPrimeiraParcela() {
	    return salario * 0.6;	
		
	}
	
	public double getSalarioSegundaParcela() {
	    return salario * 0.4;	
		
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
	
	

}
