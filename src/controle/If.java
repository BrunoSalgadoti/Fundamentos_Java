package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!"); // <------ mais de uma expressão {}
			System.out.println("Parabéns!");
		}

		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperaçao!");
		}

		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;

		if (criterioReprovacaoAtingido)
			System.out.println("Reprovado"); // <---- só precisa criar o bloco de código usual {} se...
												// tiver mais de uma expressão

		entrada.close();
	}

}
