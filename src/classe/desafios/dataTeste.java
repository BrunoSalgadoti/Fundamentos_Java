package classe.desafios;

public class dataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
//		d1.dia = 14;
//		d1.mes = " de setembro de ";
//		d1.ano = 1981;

		Data d2 = new Data(25, " de junho de ", 2014);
//		d2.dia = 25;
//		d2.mes = " de junho de ";
//		d2.ano = 2014;

		System.out.printf("Data comemorativa importante para Bruno: " + "Meu Aniversário: %s\n",
				d1.obterDataFormatada());

		System.out.printf("Data comemorativa importante para Bruno: " + "Aniversário Nicole: %s\n",
				d2.obterDataFormatada());

		d2.imprimirDataFormnatada();
		d1.imprimirDataFormnatada();

	}

}
