package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;  //declaração e inicialização
		System.out.println(a);

		a = 12;
		System.out.println(a);
		
		// a =  "..." <---- erro porque está declarada do tipo double na linha 7
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c= "Outro texto";
		System.out.println(c);
		
		//c = 4.5; <--erro C já foi inferida do tipo String na linha 18
		
		double d; //Variável declarada
		d = 123.65; //Variável foi inicializada
		System.out.println(d);
		
		//var e;  <--- Não pode declarar uma var sem inicializar
		//e = 123.5; <---- erro 
		var e = 123.45;
		System.out.println(e);

	}

}
