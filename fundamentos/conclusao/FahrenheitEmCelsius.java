package fundamentos.conclusao;

import javax.swing.JOptionPane;

public class FahrenheitEmCelsius {

	public static void main(String[] args) {

		String fahrenheit = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit");
		double f = Double.parseDouble(fahrenheit);

		double celsius = (f - 32) * (5.0 / 9.0);

		JOptionPane.showMessageDialog(null, "A temperatura de " + f + " em Celsius fica: " + celsius);

	}

}
