package lambdas.desafio;

import lambdas.Produto;

public class Desafio {

	public static void main(String[] args) {

		/*
		 * 1. A partir do produto calcular p preco real (com desconto) 
		 * 2. Imposto Municipal: >= 2500 (8,2%) / < 2500 (Isento) 
		 * 3. Frete: >= 3000 (100) / < 3000 (50) 
		 * 4. Arredondar: Deixar duas casas decimais 5. Formatar: R$ 1234,56
		 */

		Produto produto = new Produto("iPad", 3235.89, 0.13);

		Double precoFinal = produto.preco * (1 - produto.desconto);
		double frete = 100;
		double impostoMunicipal = precoFinal - (precoFinal * 0.82);

		System.out.printf("O preço do produto com desconto é: %.2f ", precoFinal);

		if (precoFinal >= 2500) {
			precoFinal += impostoMunicipal;
			System.out.printf("\nO valor do produto incide imposto Municipal de : R$ %.2f", impostoMunicipal);
			System.out.printf("\nValor do produto com imposto: R$ %.2f", precoFinal);
		} else if (precoFinal >= 3000.00) {
			precoFinal += frete;
		} else {
			System.out.println("O valor do produto é Isento de imposto ");
			frete = 50;
			precoFinal += frete;
		}
		// System.out.printf("\nValor total do produto com frete é: R$ %.7s", precoFinal.toString().replace(".", ","));
		System.out.printf("\nValor total do produto com frete é: R$ %.2f", precoFinal);

	}
}
