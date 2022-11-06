package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();  //Criação de um set "Conjunto"

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Interger
		conjunto.add('x'); // char -> Charactere

		System.out.println("Tamanho é " + conjunto.size());

		// Implementando mais elementos porém o Set não aceita repetição
		conjunto.add("Teste"); // não será contado "não aceita repetição"
		conjunto.add('x'); // não será contado "não aceita repetição"
		System.out.println("Tamanho é " + conjunto.size()); // Informa o tamanho do conjunto "quantidade de itens"

		System.out.println(conjunto.remove("Teste")); // Removerá o elemento do conjunto -> Teste (Retornará true pois
														// ele existe no Conjunto)
		System.out.println(conjunto.remove("teste")); // Não Removerá o elemento do conjunto -> teste (Retornará false
														// pois ele Não existe no Conjunto)

		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x'));  // Retornará true pois o elemento existe no conjunto inicialmente criado
		System.out.println(conjunto.contains('X')); //OBS: nos conjuntos as letras minusculas são diferenciadas das maiusculas
		System.out.println(conjunto.contains("Teste")); // Retornará false pois ele foi apagado pelo remove superior a
														// está linha.

		Set nums = new HashSet();  //Criando outro set "Conjunto"
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);  
		
		conjunto.addAll(nums); // União entre dois Conjuntos
		System.out.println(conjunto); // O número 1 como na regra do Set foi ignorado pois já existia no conjunto "conjunto"
		
		conjunto.retainAll(nums); // Intercessão entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpa todo o conjunto
		System.out.println(conjunto);
	}

}
