package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // implícita não gera problema na corvers�o pq double é maior q int
		System.out.println(a);

		float b = (float) 1.123456788888; // explícitas (CAST) com perda de dados
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // explícitas (CAST) porém não faz sentido este tipo de conversão 
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // explícitas (CAST) com perda de dados
		System.out.println(f);
	}

}
