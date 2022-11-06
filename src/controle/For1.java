package controle;

public class For1 {

	public static void main(String[] args) {
		
//		int contador = 1;
//
//		while (contador <= 20) {
//			System.out.printf("i = %d\n", contador);
//			contador++; // incrementa de 1 em 1
//			// contador += 2; //incrementa de 2 em 2
//		}
		
		for(int contador = 0; contador <= 20; contador++) {
			System.out.println(contador);
		}
		
		// sem declarar a variável dentro do for (Não é uma boa prática)
//		int x = 2;
//		for(; x < 10;) {
//			System.out.println("x = " + x);
//			x++;
//		}
		
		//laço infinito
//		for(;;) {  
//			System.out.println("FIM!");
//		}
	}
}
