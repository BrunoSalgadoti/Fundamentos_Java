package controle;

public class WhileDeterminado {

	public static void main(String[] args) {

		int contador = 1;

		while (contador <= 20) {
			System.out.printf("i = %d\n", contador);
			contador++; // incrementa de 1 em 1
			// contador += 2; //incrementa de 2 em 2
		}
	}
}