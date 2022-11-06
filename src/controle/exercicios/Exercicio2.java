package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		// 2. Criar um programa informa se o ano atual é um ano bissexto;

		//11 de set. de 2022 //bruno // Criação de snippet (entrada)
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o ano atual: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0); //copiado

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		
		entrada.close();
	}

}
