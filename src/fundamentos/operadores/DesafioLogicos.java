package fundamentos.operadores;

import javax.swing.JOptionPane;

public class DesafioLogicos {

	public static void main(String[] args) {

		/// -------ESCOPO---------------------------------------
		// Trabalho na Ter�a (V ou F)
		// Trabalho na Quarta (V ou F)

		// terça V && quata V = Comprar TV 50' e tomar sorvete
		// terça ? || quata ? = Comprar TV 32' e tomar sorvete
		// terça F && quata F = tomar sorvete
		// ------------------------------------------------------

		boolean terca = false;
		boolean quarta = false;
		String digi = "";

		String resp1 = JOptionPane.showInputDialog("Trabalhou na Terça? sim ou não: ")
				.toLowerCase().replaceAll("ã","a");

		System.out.println(resp1);
		digi = resp1;

		while (!resp1.contains("nao") && !resp1.contains("sim")) {
			resp1 = JOptionPane
					.showInputDialog(
					"Resposta não satisfatória \n voce digitou: " + digi + "\n responda com SIM ou NÃO: ")
					 .toLowerCase().replaceAll("ã", "a");
			digi = resp1;
			System.out.println(resp1);

		};

		if (resp1.contains("sim")) {
			terca = true;
		};

		System.out.println(terca);

		String resp2 = JOptionPane.showInputDialog("Trabalhou na Quarta? sim ou não: ")
				.toLowerCase().replaceAll("ã","a");

		System.out.println(resp2);
		digi = resp2;

		while (!resp2.contains("nao") && !resp2.contains("sim")) {
			resp2 = JOptionPane.showInputDialog(
					"Resposta não satisfatória \n voce digitou: " + digi + "\n responda com SIM ou NÃO: ")
					.toLowerCase().replaceAll("ã", "a");
			digi = resp2;
			System.out.println(resp2);
		};

		if (resp2.contains("sim")) {
			quarta = true;
		};

		System.out.println(quarta);

		if (terca == true && quarta == true) {
			JOptionPane.showMessageDialog(null, "Vamos Comprar uma TV de 50' e tormar Sorvete :)");
		} else if (terca == false && quarta == false) {
			JOptionPane.showMessageDialog(null, "Vamos s� tomar sorvete para esfriar a cabeça :(");
		} else {
			JOptionPane.showMessageDialog(null, "Vamos Comprar uma TV de 32' e tormar Sorvete :/");
		}

	}

}
