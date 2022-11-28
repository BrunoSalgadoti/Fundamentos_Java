package execao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		// Erro tratado ou verificado
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
	
	// EXCECÃO NÃO checada ou NÃO verificada
	static void geraErro1()  {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		
	}
	
	// EXCECÃO checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}

}
