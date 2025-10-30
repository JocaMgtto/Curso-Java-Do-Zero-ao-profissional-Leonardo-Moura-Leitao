package fundamentos;

import java.util.Scanner;

public class TipoString2 {
	public static void main(String[] args) {
		 String x = "ola";
		 
		 System.out.println("ola" == x);
		 
		 Scanner leitura = new Scanner(System.in);
		 System.out.println("digite um numero");
		 String variavel = leitura.nextLine();
		 System.out.println(x.equalsIgnoreCase(variavel.trim()));
		 leitura.close();
	}
}
