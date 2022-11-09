package lambdas.interfacesFuncionais;

import java.util.function.Predicate;

import lambdas.Produto;

public class Predicado {
	
	public static void main(String[] args) {
		
		// Interface funcional padrão do Java
//		Representa um predicado (função com valor booleano) de um argumento.
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}

}
