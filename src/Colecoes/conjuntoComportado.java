package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); // Conjunto ordenado

		listaAprovados.add("Ana");
		listaAprovados.add("Lucas");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		//nums.get(1); Não é possível acessar pelo índice em um conjunto 

		for (int n : nums) {
			System.out.println(n);
		}

	}
}
