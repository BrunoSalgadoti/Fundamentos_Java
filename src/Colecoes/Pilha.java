package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Escaravelho de Ouro");
		livros.push("A cor que caiu do céu");
		livros.push("O coração Delator");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println();
		
		for(String livro: livros) {
			System.out.println(livro);			
		}
		
		System.out.println();
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.remove());
		
//		livros.size();
//		livros.clear();
//		livros.contains("O Coração Delator");
//		livros.isEmpty();
		
	}

}
