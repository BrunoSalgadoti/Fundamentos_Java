package controle.desafios;

public class DesafioFor {
	
	public static void main(String[] args) {
//		
//		String valor = "#";
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		// Versão desafio
		// Não pode usar valor numérico para controlar o laço!
		

		for(String valor = ""; !valor.equals("&&&&&");) {
			valor += "&";
			System.out.println(valor);
		}
		
	}
}
