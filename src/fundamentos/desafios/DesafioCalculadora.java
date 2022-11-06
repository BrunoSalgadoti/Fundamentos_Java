package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// Ler num1
		// Ler nem2
		// + - * / % escolher operador
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Digite o primeiro valor: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o primeiro Operador : ");
		String op = entrada.next().replace("x", "*");
		
		System.out.print("Digite o segundo valor: ");
		double num2 = entrada.nextDouble();
		
		// Lógica Calculadora
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, op, num2, resultado);
		
		entrada.close();		
	}

}
