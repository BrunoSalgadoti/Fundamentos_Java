package fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//int b = (int) Math.pow(a, 3); //<-- potência usar Math.pow(valor , potencia);
		//double c = Math.pow(a, 3);  // < ---- demostrando que teve que usar no exemplo 1 o (CAST)... 
		                            //devido a Math ser do tipo double
		
		//System.out.println(b);
		//System.out.println(c);
//------------------------------------------------------------------------------------------------------
		
		int num1 = 6 * (3 + 2);
		num1 = (int) Math.pow(num1, 2);
		int deno1 = 3 * 2;
		
		int num2 = (1 - 5) * (2 - 7);
		num2 = (int) Math.pow(num2, 2);
		int deno2 = 2;
		num2 = num2 / deno2;
			
		int resultF1 = num1 / deno1;
		int resultF2 = num2 / deno2;
		
		int numF3 = (resultF1 -  resultF2);
		int denoF3 = (int) Math.pow(10, 3);
		numF3 = (int) Math.pow(numF3, 3);
		
		int resulado = numF3 / denoF3;
	
		System.out.println(resulado);
		
	}

}
