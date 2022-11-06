package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu")); // Uma foi excluida
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3)); // Acessa pelo índice (Usa o método ToString no Usuario)

		System.out.println(">>>>> Item removido " + lista.remove(1)); // Remove pelo índice (não oferece retorno se não
																		// colocar em um print)
		System.out.println("Removido? " + lista.remove(new Usuario("Manu"))); //Mostra True ou false
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

		for (Usuario u : lista) {
			System.out.println(u.nome); // Só mostra o nome por ter colocado a conotação .nome
		}

	}

}
