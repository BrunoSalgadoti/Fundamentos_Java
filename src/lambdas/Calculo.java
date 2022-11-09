package lambdas;

@FunctionalInterface // este tipo de interface só aceita um método, porém, o default por não ser
						// abstract pode ser inserida ou um método stático
public interface Calculo {

	double executar(double entrada1, double entrada2);

	default String legal() {
		return "Legal!!";
	}

	static String muitoLegal() {
		return "Muito Legal!!";
	}
}
