package classe.Equals;

//import java.util.Date;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Bruno Salgado";
		u1.email = "brunosalgado@hotmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Bruno Salgado";
		u2.email = "brunosalgado@hotmail.com";

		System.out.println(u1 == u2); // Compara o endereço de memória do objeto (Retornando false porque são dois
										// objetos com referências diferentes)

		System.out.println(u1.equals(u2)); // Compara o endereço de memória do objeto (porém com a construção do equals
											// na classe usuario comparará os dados dos usuarios)
		System.out.println(u2.equals(u1)); // Compara o endereço de memória do objeto (porém com a construção do equals
											// na classe usuario comparará os dados dos usuarios)

		// System.out.println(u2.equals(new Date()));
	}

}
