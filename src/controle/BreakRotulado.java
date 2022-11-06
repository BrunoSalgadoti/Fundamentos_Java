package controle;

public class BreakRotulado {

	public static void main(String[] args) {

		// Tem como caráter de Demonstração da possibilidade não recomenda-se a prática

		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;   // <-- Quebra o laço nomeado como Externo
			//		break;           // <-- Quebra o laço interno
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("FIM!");
	}
}
