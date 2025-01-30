package fundamentos.conclusao;

import javax.swing.JOptionPane;

public class CalculaArea {

	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Digite o valor da base");
		double b = Double.parseDouble(base);
		String altura = JOptionPane.showInputDialog("Digite a altura: ");
		double h = Double.parseDouble(altura);
		
		double area = (b * h) / 2;
		
		JOptionPane.showMessageDialog(null,"A area deste triangulo é: " + area);

	}

}
