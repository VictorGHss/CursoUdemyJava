package fundamentos.conclusao;

import javax.swing.JOptionPane;

public class Bhaskara {

	public static void main(String[] args) {
		System.out.println("===== Calculadora de Equações de Segundo Grau =====");
		String a = JOptionPane.showInputDialog("Digite o valor de A");
		double A = Double.parseDouble(a);
		String b = JOptionPane.showInputDialog("Digite o valor de B");
		double B = Double.parseDouble(b);
		String c = JOptionPane.showInputDialog("Digite o valor de C");
		double C = Double.parseDouble(c);

		System.out.println("Sua equação é: " + A + "x² + " + B + "x + " + C + " = 0");

		double delta = (B * B) - (4 * A * C);
		double raizDelta = Math.sqrt(Math.abs(delta));

		double x1 = (-B + raizDelta) / (2 * A);
		double x2 = (-B - raizDelta) / (2 * A);

		System.out.println("Δ (Delta) = " + delta);
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
	}

}
