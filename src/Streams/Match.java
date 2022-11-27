package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bruno", 7.1);
		Aluno a2 = new Aluno("Luana", 7.2);
		Aluno a3 = new Aluno("Nicole", 8.1);
		Aluno a4 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		Predicate<Aluno> reprovado = aprovado;
		Predicate<Aluno> reprovado2 = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));  // Equivalente ao && "e"
		System.out.println(alunos.stream().anyMatch(aprovado));  // Equivalente ao || "ou"
		System.out.println(alunos.stream().noneMatch(reprovado));  // Retorna false quando a condição "aprovado" não for atendida 
																	                                //(nenhum aluno reprovado)
		System.out.println(alunos.stream().noneMatch(reprovado2));  // Negação do noneMatch 

	}

}
