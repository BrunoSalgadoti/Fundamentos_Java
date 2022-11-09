package lambdas.interfacesFuncionais;

import java.util.function.BinaryOperator;

public interface binaryOperator {

	public static void main(String[] args) {

		// Interface funcional padrão do Java
//		Representa uma operação sobre dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo dos operandos.

		BinaryOperator<Double> calculo = (entrada1, entrada2) -> {
			return entrada1 + entrada2;
		};
		System.out.println(calculo.apply(2.0, 3.0));

		calculo = (entrada1, entrada2) -> entrada1 * entrada2;
		System.out.println(calculo.apply(2.0, 3.0));
// -----------------------------------------------------------------------
		BinaryOperator<Integer> calculo2 = (entrada1, entrada2) -> {
			return entrada1 + entrada2;
		};
		System.out.println(calculo2.apply(2, 3));

		calculo2 = (entrada1, entrada2) -> entrada1 * entrada2;
		System.out.println(calculo2.apply(2, 3));
	}

}
