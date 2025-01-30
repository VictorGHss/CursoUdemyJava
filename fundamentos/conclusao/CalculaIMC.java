package fundamentos.conclusao;

import javax.swing.JOptionPane;

public class CalculaIMC {

	public static void main(String[] args) {
		System.out.println("=======Calcula IMC=======");

		String altura = JOptionPane.showInputDialog("Digite sua altura");
		double h = Double.parseDouble(altura);
		String peso = JOptionPane.showInputDialog("Digite seu peso");
		double kg = Double.parseDouble(peso);

		double imc = kg / (h * h);

		JOptionPane.showMessageDialog(null,"Seu IMC é de: " + imc);
	}

}
