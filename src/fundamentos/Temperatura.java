package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC)

		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;

		double f = 86;
		double resultC = (f - AJUSTE) * FATOR;
		System.out.println("O  Valor de  " + f + " ºf em ºC é:" + resultC);

		f = 150;
		resultC = (f - AJUSTE) * FATOR;
		System.out.println("O Valor de  " + f + "ºf em  ºC é:" + resultC);
	}
}
