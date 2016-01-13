package Q9;

public class PessoaFisica {
	private String nome;
	private String cpf;
	
	
	

 public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




private void validaCPF(String cpf){
	
		this.cpf=getCpf();
		
		System.out.println("CPF cadastrado com sucesso");
	
 }

}

 

 