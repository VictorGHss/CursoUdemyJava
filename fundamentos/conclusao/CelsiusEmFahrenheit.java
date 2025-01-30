package fundamentos.conclusao;

import javax.swing.JOptionPane;

public class CelsiusEmFahrenheit {

	public static void main(String[] args) {
		String celsius = JOptionPane.showInputDialog("DIgite a temperatura em Celsius");
		double c = Double.parseDouble(celsius);

		double fahrenheit = (c * 1.8) + 32;

		JOptionPane.showInputDialog(null, "A temperatura de " + c + " em Fahrenheit fica: ", fahrenheit);

	}

}
