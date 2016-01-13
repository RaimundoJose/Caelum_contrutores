package Q8;

import java.util.Date;
import java.util.Scanner;

public class TestaData {
	private int dia, mes, ano;
	
	public String toString(int dia, int mes, int ano){
    	return "Dia"+ dia+"Mes"+mes+"Ano"+ano;
    	
    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		Scanner dat = new Scanner(System.in);
		System.out.println("Entre com dia");
        int dia= dat.nextInt();
        System.out.println("Entre com mes");
        int mes= dat.nextInt();
        System.out.println("Entre com ano");
        int ano= dat.nextInt();
        System.out.println("A data armazenada é  "+dat.toString());
        
       
        
        
     //   System.out.println("A data armazenada é  "+dat1);
	}

}
	/*@Override
	public String toString() {
		return "TestaData [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
*/

