package lambdas.interfacesFuncionais;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		// Interface funcional padrão do Java
        /* Representa uma operação em um único operando 
         * que produz um resultado do mesmo tipo que seu operando.
     	*/	
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}

}
