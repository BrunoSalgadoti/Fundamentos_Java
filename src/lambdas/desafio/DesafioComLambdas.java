package lambdas.desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class DesafioComLambdas {

	public static void main(String[] args) {

		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = 
				//preco -> Double.parseDouble(String.format("%.2f", preco)); // <-- Errro nesta linha
				preco -> Double.parseDouble(String.format("%.7s", preco)); // <-- como no meu código (funciona)
		Function<Double, String> formatar = 
				preco -> ("R$ " + preco).replace(".", ",");

		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é: " + preco);

	}
}
