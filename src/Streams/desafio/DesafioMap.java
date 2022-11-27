package Streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		UnaryOperator<String> inverterNumeros = numerosInvertidos -> 
												new StringBuilder(numerosInvertidos)
												.reverse()
												.toString();
	    Function<String, Integer> stringToInt = n -> Integer.parseInt(n, 2);
												
		/* USANDO O MAP
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * 
		 * Interger.
		 * */
				
		System.out.println("1. Número para string binária...");
		numeros.stream()
			.map(Integer::toBinaryString)
			.forEach(System.out::println);
		
		System.out.println("1. Inverter a string...");
		numeros.stream()
			.map(Integer::toBinaryString)
			.map(inverterNumeros)
			.forEach(System.out::println);
		
		System.out.println("Converter de volta para inteiro...");
		numeros.stream()
			.map(Integer::toBinaryString)
			.map(inverterNumeros)
			.map(stringToInt)
			.forEach(System.out::println);
		
	}
	
}
