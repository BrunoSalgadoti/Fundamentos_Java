package classe;

public class PrimeiroTrauma {
	
    int a = 3; //não pode mexer aqui!!
    static int b = 4;

	
	public static void main(String[] args) {
		//pode mexer em qualquer parte aqui para resolver o problema "imprima a"
		
		PrimeiroTrauma trauma = new PrimeiroTrauma();
		System.out.println(trauma.a);
		
		// trauma.a;          <------ estava tentando desta forma :( 
	    // System.out.println(a);  <----- não consegui!!!!
		
		System.out.println(b);
	}
}
