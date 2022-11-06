package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//Tipos não primitivos
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora"); 
		
		s = s.toUpperCase(); //transforma a String em Upcase
		
		s = s.concat("!!!!");
		
		System.out.println(s);
		
		String x = "Bruno".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "NICK")
				.toLowerCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		
	}

}
