package arrays.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		/*-------------SCOPO------------------
		 * Calcular a média das notas de um aluno
		 * 1 - O programa pergunta quantas notas o usuário quer armazenar
		 * 2 - Criar o array com a quantidade de notas informadas
		 * 3 - Criar 2 laços for: 
		 * 3.1 - 1º pegar as notas e armazenar no array com for tradicional
		 * 3.2 - 2º com o Foreach percorrer todas as notas e adicionar na variável soma
		 */

		// 21 de set. de 2022 //bruno // Criação de snippet (entrada)
		Scanner entrada = new Scanner(System.in);
		int sequenciaNotas = 0;
		int posicao = 0;

		System.out.print("Informe a quantidade de notas que deseja inserir: ");
		int quantidadeNotas = entrada.nextInt();

		double[] notas =  new double[quantidadeNotas];

		while (sequenciaNotas < notas.length) {
			sequenciaNotas++;

			System.out.printf("Informe a %dª nota: ", sequenciaNotas);
			double notaInformada = entrada.nextDouble();

			if ( posicao < sequenciaNotas) {
				notas[posicao] = notaInformada;
				posicao++;
				System.out.println(Arrays.toString(notas));

			}
		}
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		System.out.println("Média do aluno é : " + soma / quantidadeNotas);

		entrada.close();
	}

}
