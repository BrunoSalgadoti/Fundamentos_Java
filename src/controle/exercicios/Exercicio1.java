package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		// 10 e é par;
		
		//11 de set. de 2022 //bruno // Criação de snippet (entrada)
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int valor = entrada.nextInt();
		
		if (valor >= 0 || valor <= 10) {
			
			if(valor % 2 == 0) {
			System.out.println("Valor digitado foi: " + valor + " É um numero PAR");
			}
			else {
				System.out.println("Valor digitado foi: " + valor + " NÃO é um número PAR");
			}
			
		}else{
			System.out.println("Valor excede o esperado entre 0 a 10");
		}

		entrada.close();
		
	}

}
