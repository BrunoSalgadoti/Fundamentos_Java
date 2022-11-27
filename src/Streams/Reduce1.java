package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		// Reduce com valor inicial, porém, COM PARALLELSTREAM (Agrega a cada valor do stream o valor inicial)
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		
		// Reduce com valor inicial, porém, sem parallelStream (Agrega somente uma vez o valor inicial e 
																				//depois soma com o Stream)
		Integer total3 = nums.stream().reduce(100, soma);
		System.out.println(total3);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
		.filter(n -> n > 5) // Um filtro de condição!!
		.reduce(soma)
		.ifPresent(System.out::println);
	}

}
