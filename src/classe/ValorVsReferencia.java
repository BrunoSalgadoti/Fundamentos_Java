package classe;

import classe.desafios.Data;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a; // Atribuição por Valor (Tipo primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(1, " de janeiro de ", 1970);
		Data d2 = d1; // Atribuição por Referência (Objeto)

		// tive que trocar dentro de desafio para public as variáveis e...
		// os construtores por está dentro de outro pacote (desafios)
		d1.dia = 31;
		d2.mes = " de dezembro de ";

		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada()); // recebeu a referencia do método em memória...
														// por isso alterou dos dois (não é uma boa prática)

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(Data d) { // a variável recebe a referencia do método em memória (new Dtata())
		d.dia = 1;
		d.mes = " de janeiro de ";
		d.ano = 1970;
	}

	static void alterarPrimitivo(int c) { // não vai modificar por ser atribuição de valor primitivo
		c++; 							 // cria outro espaço de memória e não como uma referência
	}

}
