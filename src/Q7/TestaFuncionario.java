
public class TestaFuncionario {

	public static void main(String[] args) {
		Professor p = new Professor ();
		
		p.setNome("Jo�o");
		p.setSobreNome("Jos�");
		p.setSalario(2000);
		
		
		System.out.println(p.getNomeCompleto());
		System.out.println(p.getSalarioPrimeiraParcela());
		System.out.println(p.getSalarioSegundaParcela()); 

	}

}
