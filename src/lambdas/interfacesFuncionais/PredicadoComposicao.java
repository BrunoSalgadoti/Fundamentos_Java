package lambdas.interfacesFuncionais;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		// Interface funcional padrão do Java
//		Representa um predicado (função com valor booleano) de um argumento.
		
		Predicate<Integer> isPar = numero -> numero % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				numero -> numero >= 100 && numero <= 999;
				
		System.out.println(isPar.and(isTresDigitos).test(123)); // Operação lógica && (E)
		System.out.println(isPar.and(isTresDigitos).negate().test(123)); // Operação lógica && e ! (E e Negação)
		System.out.println(isPar.or(isTresDigitos).test(123));  // Operação lógica || (OU)
	}
}


