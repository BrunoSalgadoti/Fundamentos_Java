package Streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	// Com o construtor privado não conseguirão instanciar uma nova class
	private Utilitarios( ) {
		
	}
	
	//Lambdas Staticos
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
			
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
			
	//Função statica		
	public final static String grito(String n) {
		return n + "!!! ";		
	} 

}
