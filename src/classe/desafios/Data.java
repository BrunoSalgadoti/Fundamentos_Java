package classe.desafios;

public class Data {

	public int dia;
	public String mes;
	public int ano;

	public Data(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data() {
		this(01, " de Janeiro de ", 1970);
//		dia = 01;
//		mes = " de Janeiro de ";
//		ano = 1970;

	}

	// Minha lógica
//	String obterDataFormatada() {
//						
//		return  dia + mes + ano;
//	}

	// Lógica Professor

	public String obterDataFormatada() {
		final String formatoDaData = "%d%s%d";  
		return String.format(formatoDaData, this.dia, mes, ano);
	}

	void imprimirDataFormnatada() {
		System.out.println(this.obterDataFormatada());
	}

}
