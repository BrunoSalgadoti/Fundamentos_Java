package fundamentos;

public class PrimitivoVsObj {

	public static void main(String[] args) {

		String s = new String("texto"); // <--- tipo String é do tipo obj
		s = s.toUpperCase(); // <------ comportamento ou atributos os Obj possuem
		System.out.println(s);

		// Wrappers são a versão objeto dos tipos primitivos
		int a = 123; // <---- tipos primitivos por padrão não possuem atributos e comportamento
		// a.!!!!
		System.out.println(a);
	}

}
