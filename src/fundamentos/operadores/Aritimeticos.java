package fundamentos.operadores;

public class Aritimeticos {
	
	public static void main(String[] args) {
		
		System.out.println( 2 + 3 ); //<--- pode-se fazer operações diretamente no System.out
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println( x + y );
		System.out.println( x - y );
		System.out.println( x * y );
		System.out.println( x / y );
		
		int a = 8;
		int b = 3;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println( a / (double) b );  //<----- Usando o (CAST) para converter em double
		System.out.println( a / (float) b );   //<----- Usando o (CAST) para converter em float
		
		
		System.out.println( a % b ); // <---- Resto da divisão 
		System.out.println( 8 % 3 ); // <---- Resto da divisão 
		
		System.out.println(x + y - a * b); //<---- não se preoculpar com parenteses 
		                                   // o JAVA interpreta a precedencia
		
	}

}
