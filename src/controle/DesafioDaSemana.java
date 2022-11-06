package controle;

import javax.swing.JOptionPane;

public class DesafioDaSemana {

	public static void main(String[] args) {
		// Domingo -> 1
		// Quarta -> 4
		// terça -> 3 <-----todos os dias da semana retorna seu grau asc perante a
		// semana

		String diaSemana = "";

		while (!diaSemana.equals("segunda") || !diaSemana.equals("terca") || !diaSemana.equals("quarta")
				|| !diaSemana.equals("quinta") || !diaSemana.equals("sexta") || !diaSemana.equals("sabado")
				|| !diaSemana.equals("domingo")) {

			diaSemana = JOptionPane.showInputDialog("Informe o dia da semana: ").toLowerCase().replaceAll("ç", "c")
					.replaceAll("á", "a");

			if (diaSemana.equals("domingo")) {
				JOptionPane.showMessageDialog(null, "1º dia da Semana");
				break;
			} else if (diaSemana.equals("segunda")) {
				JOptionPane.showMessageDialog(null, "2º dia da Semana");
				break;
			} else if (diaSemana.equals("terca")) {
				JOptionPane.showMessageDialog(null, "3º dia da Semana");
				break;
			} else if (diaSemana.equals("quarta")) {
				JOptionPane.showMessageDialog(null, "4º dia da Semana");
				break;
			} else if (diaSemana.equals("quinta")) {
				JOptionPane.showMessageDialog(null, "5º dia da Semana");
				break;
			} else if (diaSemana.equals("sexta")) {
				JOptionPane.showMessageDialog(null, "6º dia da Semana");
				break;
			} else if (diaSemana.equals("sabado")) {
				JOptionPane.showMessageDialog(null, "7º dia da Semana");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Valor Digitado: " + diaSemana.toUpperCase() + " Inválido!\n"
						+ "Digite o nome de um dia da Semana");

			}
			;
		}
		;
	}
}
