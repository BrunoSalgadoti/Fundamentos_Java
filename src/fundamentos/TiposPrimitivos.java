package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionario

		// Range dos tipos inteiros numéricos
		/*
		 * byte -> -128 até + 128 short -> +- 32.767 1 byte = 8bits
		 */

//----------------------Tipos de Variáveis Primitivas-------------------------------------		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipos booleano
		boolean estaDeFerias = false; // true "não considera 0 ou 1 como valor"

		// Tipo caractere
		char status = 'A'; // ativo

//----------------Utilizando as Variáveis------------------------------------------------------		

		// Dias de empresa
		System.out.println("O Funcionário tem: " + anosDeEmpresa * 365 + " anos de empresa");

		// numero de viagens
		System.out.println("Quantidade de voos realizados " + numeroDeVoos / 2);

		// Pontos por real
		System.out.println("Pontos Acumulados: " + pontosAcumulados / vendasAcumuladas);

		// Id Usuario
		System.out.println("ID do usuário: " + id + ": ganha --> " + salario);

		// Férias
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}
}