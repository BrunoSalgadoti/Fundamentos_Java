package classe.desafios.Jantar;

import java.util.Scanner;

public class Jantar {

	double pesoDaComidaEscolhida;

	public static void main(String[] args) {
		Jantar jantar = new Jantar();
		Pessoa pessoaNaMesaDeJantar = new Pessoa("", 0);
		Comida opcaoEscolhida = new Comida();

		// 19 de set. de 2022 //bruno // Criação de snippet (entrada)
		Scanner entrada = new Scanner(System.in);
		double pratoMacaxeira = opcaoEscolhida.opcaoMacaxeiraComCarneDoSol();
		double pratoLeitaoFrito = opcaoEscolhida.opcaoLeitaoFrito();

		System.out.print("Seja Bem Vindo: Qual o seu primeiro nome Sr.(a)? ");
		pessoaNaMesaDeJantar.nomeDaPessoa = entrada.next();

		System.out.print("\nPor gentileza informe o seu peso atual: ");
		pessoaNaMesaDeJantar.pesoDaPessoa = entrada.nextDouble();

		System.out.printf("\nBem Vindo Sr.(a) %s ao Restaurante Leitão na Brasa\n", 
							pessoaNaMesaDeJantar.nomeDaPessoa);

		System.out.println(
				"Escolha o prato do dia:\n  " 
				 + "1 para Leitão Frito \n ou \n " 
				 + "2 para Macaxeira com carne do sol");
		int escolha = entrada.nextInt();

		if (escolha != 1 && escolha != 2) {
			System.out.println("Prato não disponível!!");
		} else if (escolha == 1) {
			jantar.pesoDaComidaEscolhida = pratoLeitaoFrito;
			opcaoEscolhida.nomeDaComida = "Leitão Frito";
		} else {
			jantar.pesoDaComidaEscolhida = pratoMacaxeira;
			opcaoEscolhida.nomeDaComida = "Macaxeira com carne do sol";
		}

		if (escolha == 1 || escolha == 2) {
			double pesoDaPessoaPosJanta = jantar.pesoDaComidaEscolhida + pessoaNaMesaDeJantar.pesoDaPessoa;

			System.out.printf(
					"Senhor(a) %s  o seu peso informado foi de %.3f kg\n "
							+ "depois de jantar o delicioso prato: %s escolhido pesará %.3f kg ",
					pessoaNaMesaDeJantar.nomeDaPessoa, pessoaNaMesaDeJantar.pesoDaPessoa, 
					opcaoEscolhida.nomeDaComida, pesoDaPessoaPosJanta);
		} else {
			System.out.println("Volte outro dia ou escolha uma opção válida");
		}

		entrada.close();
	}

}
