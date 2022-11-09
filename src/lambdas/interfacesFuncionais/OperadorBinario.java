package lambdas.interfacesFuncionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		// Interface funcional padrão do Java
        /* Representa uma operação sobre dois operandos do mesmo tipo, 
         * produzindo um resultado do mesmo tipo dos operandos.
         */
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) /2;
		System.out.println(media.apply(9.1, 6.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7.0 ? "Aprovado!!" : "Reprovado!";
		};
		System.out.println(resultado.apply(9.7, 5.1));
				
		Function<Double, String> conceito = 
				mediaConceito -> mediaConceito >= 7 ? "Aprovado!!" : "Reprovado!";
		System.out.println(media.andThen(conceito).apply(6.5, 7.3));
	}

}
