package Q6;

import java.util.Arrays;

public class Empresa {
	private Funcionario funcionarios[];
	private static int posicao;
	
	
	public Empresa() {		 
		 
		funcionarios =new Funcionario[posicao];
	}

public Empresa(Funcionario[] funcionarios) {
		
		this.funcionarios = funcionarios;
		
	}
	

	
	public Funcionario getFuncionario(int posicao){
		return this.funcionarios[posicao];
	}
	
	

	/*public String toString() {
		return "Empresa [funcionarios=" + Arrays.toString(funcionarios) + "]";
	}*/


	
public String mostraFuncEmpresa(){
		
		return   Arrays.toString(funcionarios) ;
	
	}

	private static int getPosicao(){
		return   ++posicao;
	}

	

}
