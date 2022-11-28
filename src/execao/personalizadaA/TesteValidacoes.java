package execao.personalizadaA;

import execao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM :)");
	}

}
