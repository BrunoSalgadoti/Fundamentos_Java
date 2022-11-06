package classe.desafios.Jantar;

public class Comida {

	String nomeDaComida;
	double pesoDaComida;

	Comida(String nomeDaComida, double pesoDaComida) {
		this.nomeDaComida = nomeDaComida;
		this.pesoDaComida = pesoDaComida;
	}

	Comida() {

	}
	
	public double opcaoLeitaoFrito() {
		double pratoLeitaoFrito = 0.780;
		this.pesoDaComida = pratoLeitaoFrito;	
		return pesoDaComida;
	}

	public double opcaoMacaxeiraComCarneDoSol() {
		double pratoMacaxeiraComCarneDoSol = 0.280;
		this.pesoDaComida = pratoMacaxeiraComCarneDoSol;
		return pesoDaComida;
	}
}
