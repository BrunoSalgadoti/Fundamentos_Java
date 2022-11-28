package execao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		//Teste o erro dividindo por 0
		
		//28 de nov. de 2022 //bruno // Criação de snippet (entrada)
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Digite um valor: ");
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		} finally { // Este bloco será sempre chamado (irá fechar a execução do Scanner)
			System.out.println("Finally... #01!");
			//entrada.close();	
		}
		
		try {
			System.out.println(7 / entrada.nextInt());
		} finally { // Este bloco será sempre chamado (irá fechar a execução do Scanner)
			System.out.println("Finally... #02!");
			entrada.close();	
		}
		
		System.out.println("FIM!");
	}

}
