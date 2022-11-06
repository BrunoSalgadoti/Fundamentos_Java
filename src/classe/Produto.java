package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto (){
		
	}

	double precoComDesconto() {

		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente) {

		return preco * (1 - desconto + descontoGerente);
	}
}
