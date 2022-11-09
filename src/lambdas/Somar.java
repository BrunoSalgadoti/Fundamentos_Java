package lambdas;

public class Somar implements Calculo {

	@Override
	public double executar(double entrada1, double entrada2) {
		return entrada1 + entrada2;
	}
}
