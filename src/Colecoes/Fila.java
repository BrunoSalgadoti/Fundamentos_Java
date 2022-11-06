package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> Adicionam elementos na fila

		// Diferença é o comportamento que ocorre
		// quando a fila está cheia!
		fila.add("Ana"); // Retorna null
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> Obter o próximo elemento da fila (sem remover)

		// Diferença é o comportamento que ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Retorna uma exceção
		System.out.println(fila.element());

		// Poll e Remove -> obter o próximo elemento
		// da fila (e remove!)

		// Diferença é o comportamento que ocorre
		// quando a fila está vazia!
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size(); // Mostra o tamanho da fila
		// fila.clear(); // Limpa a fila
		// fila.isEmpty(); // Verifica se a lista está vazia
		// fila.contains(...); // Verifica se contém um elemento na fila

	}

}
