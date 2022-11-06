package classe;

public class AreaCirc {
	
	double raio;
	//double pi = 3.14;
	//static double pi = 3.14;
	final static double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
