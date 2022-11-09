package lambdas.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		// Interface funcional padrão do Java
//		Representa um fornecedor de resultados.
		
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Bruno", "Nicole", "Maria", "Rosy");
				
		System.out.println(umaLista.get());
	}

}
