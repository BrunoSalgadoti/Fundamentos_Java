package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a'; // não é uma boa prática só demosntração que cada char representa um número na
						// tabela unicode!

		System.out.println(a == b);
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);

		double nota = 9.7;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;

		System.out.println("Tem desconto? " + temDesconto);

	}
}
