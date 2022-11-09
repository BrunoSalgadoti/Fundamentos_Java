package lambdas.interfacesFuncionais;

import java.util.Arrays;
import lambdas.Produto;
import java.util.List;
import java.util.function.Consumer;


public class Consumidor {

	public static void main(String[] args) {

		// Interface funcional padrão do Java
//		Representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.
		
		Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome + "!!!");

		Produto p1 = new Produto("Caneta", 12.34, 0.99);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 5312.99, 0.25);
		Produto p3 = new Produto("Caderno", 15.00, 0.03);
		Produto p4 = new Produto("Livro", 120.24, 0.18);
		Produto p5 = new Produto("Agenda", 45.50, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.nome + " R$ " + p.preco));

		produtos.forEach(System.out::println); // Para a funcionalidade retornar o valor em String necessita implementar
												// na class Produto o método toString
	}
}
