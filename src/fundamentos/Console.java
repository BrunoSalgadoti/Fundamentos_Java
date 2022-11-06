package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print("dia!\n\n");

		System.out.println("Bom");
		System.out.println("Dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 9, 14, 22, 23, 51, 60);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");

// ---------------ENTRADA DE DADOS ---------------------------		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

		entrada.close();

	}

}
