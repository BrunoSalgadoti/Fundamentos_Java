package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		java.lang.String s = "Import do packege Date"; // <---- o packege java.lang está disponível em todas as class 
		java.lang.System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		//JButton botao = new JButton(); //< ---Ctrl + o "retirou o import não usado
	}

}
