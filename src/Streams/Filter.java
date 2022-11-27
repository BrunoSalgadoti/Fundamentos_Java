package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
				Aluno a1 = new Aluno("Bruno", 7.8, false);
				Aluno a2 = new Aluno("João", 5.8, true);
				Aluno a3 = new Aluno("Daniel", 9.8, true);
				Aluno a4 = new Aluno("Carla", 3.2, true);
				Aluno a5 = new Aluno("Suzana", 6.5, false);
				Aluno a6 = new Aluno("Maria", 7.8, true);
				
				List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5 ,a6);
				
				Predicate<Aluno> aprovado = a -> a.nota >= 7;
				Predicate<Aluno> bomComportamento = a -> a.bomComportamento;
				Function<Aluno, String> suadacaoAprovado = 
						a -> "Parabéns " + a.nome + "! Você foi aprovado (a)!";
				
				alunos.stream()
				.filter(aprovado)
				.filter(bomComportamento)
				.map(suadacaoAprovado)
				.forEach(System.out::println);
				
	}

}
