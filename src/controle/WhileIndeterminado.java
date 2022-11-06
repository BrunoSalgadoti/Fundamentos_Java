package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String DgUsuario = "";

		while (!DgUsuario.equalsIgnoreCase("sair")) {

			System.out.print("Digite o que quiser. Para terminar digite \"sair\": ");
			DgUsuario = entrada.nextLine();
		}
		System.out.println("\nVOCÊ DIGITOU SAIR, FIM DA PROGRAMAÇÃO!!!");

		entrada.close();
	}

}
