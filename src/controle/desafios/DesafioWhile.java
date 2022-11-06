package controle.desafios;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		// -------------SCOPO----------------------------------
		// * calcular média das notas de uma turma
		// X quantidade de alunos
		// usuário vai digitando as notas da quantidade x de alunos *Notas Válidas
		// (válidas de 0 a 10)
		// ao ser inserida uma nota válida armazenar em uma *Variável com o nome TOTAL
		// acrescentando sempre que uma nota válida for inserida na variável TOTAL
		// no final a variável TOTAL terá a *Soma de todas as notas
		// Criar uma outra variável X para saber quantas notas válidas foram digitadas
		// * Quando digitar -1 o programa entende que o usuário quer finalizar a
		// operação e mostar a média

		Integer quantAlunos = 0;
		double total = 0.0;
		Double totalParcial = 0.0;
		double valorDigitadoValido;

		String nota = JOptionPane.showInputDialog("Digite a nota do Aluno ou \"-1\" para Sair: ");
		if (nota.isBlank()) {
			nota = "-1.1";
		}
		Double valorDigitado = Double.parseDouble(nota);
		System.out.println("Primeiro Valor: " + valorDigitado);

		while (valorDigitado != -1) {

			valorDigitadoValido = valorDigitado;

			while (valorDigitado >= 0.0 && valorDigitado <= 10.0) {
				System.out.println("Nota que chegou Valido : " + valorDigitadoValido);
				quantAlunos++;

				nota = JOptionPane.showInputDialog("Digite a nota do Aluno: ");
				if (nota.isBlank()) {
					nota = "-1.1";
				}
				valorDigitado = Double.parseDouble(nota);

				if (valorDigitado >= 0.0 && valorDigitado <= 10.0) {
					valorDigitadoValido = valorDigitadoValido + valorDigitado;
				} else
					totalParcial += valorDigitadoValido;
				System.out.println("Total Parcial :" + totalParcial.toString());
			}

			while (valorDigitado >= 10.1 || valorDigitado <= -1.1) {

				nota = JOptionPane.showInputDialog("Digite uma nota válida entre 0.0 a 10.0: ");
				if (nota.isBlank()) {
					nota = "-1.1";
				}
				valorDigitado = Double.parseDouble(nota);
				System.out.println("Valor Invalido : " + valorDigitado);
			}

		}

		total = totalParcial;
		double mediaTurma = total / quantAlunos;

		JOptionPane.showMessageDialog(null, "Foram inseridas: " + quantAlunos.toString() + " Notas de Alunos\n"
				+ "Soma total das Notas: " + total + "\nA media da turma é de: " + mediaTurma);
	}
}
