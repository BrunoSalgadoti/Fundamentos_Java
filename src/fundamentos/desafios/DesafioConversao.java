package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		// 3 strings com ultimos três salários de um funcionário
		// pode ter flexibilidade de digitar , ou .
		// retornar a média do funcionário

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira seu Antepenúltimo salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");

		System.out.print("Insira seu Penúltimo salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");

		System.out.print("Insira seu último salário: " );
		String salario3 = entrada.nextLine().replace(",", ".");

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		double soma = valor1 + valor2 + valor3;

		System.out.println("\nO seu Antepenúltimo salario informado foi: " + salario1);
		System.out.println("O seu Penúltimo salario informado foi:     " + salario2);
		System.out.println("O seu último salario informado foi:        " + salario3 + "\n\n");
		System.out.println("A sua média salarial é de :                " + soma / 3);

		entrada.close();

	}

}
