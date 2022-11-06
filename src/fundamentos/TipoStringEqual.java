package fundamentos;

import java.util.Scanner;

public class TipoStringEqual {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); //<--- Com o .equals ele compara os conte�dos

		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim()); //<--- '.trim()' remove espaçamentos em branco digitados
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}
}
