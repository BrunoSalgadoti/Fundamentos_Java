package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = + 1;
		--b; // b = - 1;  <-- precedencia maior 
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio ... ");
		System.out.println(++a == b--); // <-- a variável 'a' tem precedencia maior de incremento
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
