package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		//EXEMPLOS DE COMO TRABALHA COM STREAMS
		
		// Interface funcional padrão do Java
		//Representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.
		Consumer<String> print = System.out::print;  // Consumer<String> print  = (Método reference) 
		Consumer<Integer> println = System.out::println;  // Consumer<Integer> print  = (Método reference) 
		
		//Stream.of -> Um método stático (Acessa diretamente a partir da interface )
		Stream<String> langs = Stream.of("Java ", "Angular ", "JS ", "Flutter\n ");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); //Stream paralelo (os valores são executados em sequencias diferentes)
		
		//Métodos que Geram uma Stream de forma infinita
//		Stream.generate(() -> "a").forEach(println); 
		Stream.iterate(0, n -> n + 1).forEach(println);
		
		
	}

}
