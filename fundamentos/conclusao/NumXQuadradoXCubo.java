package fundamentos.conclusao;

import javax.swing.JOptionPane;

public class NumXQuadradoXCubo {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Digite um número para descobrir o valor dele ao quadrado e ao cubo");
		double n = Double.parseDouble(num);

		double quadrado = (n * n);
		double cubo = (n * n * n);

		JOptionPane.showMessageDialog(null,
				"O valor de " + n + " ao quadrado é de: " + quadrado + "\n O valor de " + n + " ao cubo é de: " + cubo);
	}

}
