package lambdas.desafio;

import java.util.Locale;

public class TesteLocale {
	
	public static void main(String[] args) {
		
		//Mudando no Eclipse para EN US
		//Windows / preferences / java / installed JREs
		// Selecione a opção do java ao qual você quer estabelecer a linguagem padrão
		// Clique em Editar depois:
		// em Default VM arguments insira o seguinte linha:
		// -Duser.language=en -Duser.country=US
		
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));

	}

}
