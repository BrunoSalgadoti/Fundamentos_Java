package Streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Bruno", 41, 1994);
		Cliente c2 = new Cliente("Ricado", 62, 1990);
		Cliente c3 = new Cliente("Leo", 16, 1999);
		Cliente c4 = new Cliente("Nicole", 13, 2016);
		Cliente c5 = new Cliente("Aparecida", 50, 2000);
		Cliente c6 = new Cliente("Flávio", 63, 1993);
		Cliente c7 = new Cliente("Roberto", 14, 2020);
		Cliente c8 = new Cliente("Maria", 23, 2018);
		Cliente c9 = new Cliente("Kevin", 23, 1991);
		
		List<Cliente> cliente = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9);
		
		Predicate<Cliente> prioridadePreferencial = c -> c.idade >= 60;
		Predicate<Cliente> clienteFidelidade = c -> c.clienteDesde <= 1999;
		Predicate<Cliente> prioridadeFidelidade =  c -> c.idade <= 60 && c.clienteDesde <= 1999;
		
		Function<Cliente, String> msnPreferencial =  c -> "Parabéns " + c.nome + 
				" é nosso cliente desde a década de abertura da Loja!";
		Function<Cliente, String> msnPreferencialFidelidade =  c -> "Parabéns " + c.nome + 
				" é nosso cliente desde a década de abertura da Loja "
				+ "e com nível ouro (preferêncial!!!)";

		
		cliente.stream()
		.filter(clienteFidelidade)
		.filter(prioridadeFidelidade)
		.map(msnPreferencial)
		.forEach(System.out::println);
		
		System.out.println("\n-----------------------\n");
		
		cliente.stream()
		.filter(prioridadePreferencial)
		.filter(clienteFidelidade)
		.map(msnPreferencialFidelidade)
		.forEach(System.out::println);
		
		
	}

}
