package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bruno", 7.1);
		Aluno a2 = new Aluno("Luana", 6.1);
		Aluno a3 = new Aluno("Nicole", 8.1);
		Aluno a4 = new Aluno("Maria", 10);
		Aluno a5 = new Aluno("Bruno", 7.2);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Nicole", 8.1);
		Aluno a8 = new Aluno("João", 10);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		//OBS: para o distinct trabalhe de forma correta (pois ele pega o endereço de memória) 
		//tem que ser implementado na classe Aluno o método toSting / equals e hascode.
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2) // ponto inicial
		.limit(2) // limite do retorno
		.forEach(System.out::println);
		
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7.0)
		.forEach(System.out::println);
	}
	
	
	
}
