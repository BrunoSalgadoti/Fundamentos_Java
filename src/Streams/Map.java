package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + "!!! ";
		
		System.out.println("\n\nUsando composição...");
		marcas.stream()
			.map(Utilitarios.maiuscula) //Usando o operador unário da class Utilitarios
			.map(primeiraLetra) // Usando diretamente da class Map
			.map(Utilitarios::grito) // Usando a função da class Utilitarios (Usando reference metods)
			.forEach(print);
	}
}
