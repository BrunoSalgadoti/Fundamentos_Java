package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Bruno";
		var sobrenome = "Salgado";
		var idade = 40;
		var salario = 18345.987;

		System.out.println("Nome: " + nome + "\nSobrenome: " // <----- não é uma boa prática de se fazer
				+ sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

		System.out.printf("O Senhor %s %s tem %d anos e ganha R$ %.2f.", // <-- melhor forma
				nome, sobrenome, idade, salario);

//-------Mesmo Resultado só que armazenado o valor dentro de uma variável tipo String--------------------	 	
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase + "\n");

		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));

	}

}