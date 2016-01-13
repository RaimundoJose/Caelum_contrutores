package Q6;

import java.util.Scanner;



public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		
		Funcionario[] funcionarios = new Funcionario[10];
		
	       
	    
	    Scanner n = new Scanner(System.in);
		
	   
	    
	    System.out.println("Digite um nome de funcionario ");
	    String nome = n.nextLine();
	    
	    System.out.println("Digite um salário de funcionario ");
	    String salario = n.nextLine();
		
	    System.out.println("Digite um cpf de funcionario ");
	    String cpf = n.nextLine();
		
	    
		
		
		 
		
		 
		 
		 
		 System.out.println(e.mostraFuncEmpresa());
		 
	}
	

}
