package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// 4 de set. de 2022 //bruno //Criado por Snippet (entrada)
		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar " + "as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}

}
