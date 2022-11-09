package lambdas;

public interface CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calculo = (entrada1, entrada2) -> {
			return entrada1 + entrada2;
		}; // função/método lambda pode ser composta (função anonima)
		System.out.println(calculo.executar(2, 3));

		calculo = (entrada1, entrada2) -> entrada1 * entrada2; // função/método lambda simples (função anonima)
		System.out.println(calculo.executar(2, 3));

		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal()); // Acessar diretamente a interface

	}

}
