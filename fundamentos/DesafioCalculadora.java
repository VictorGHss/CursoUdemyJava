package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double num2 = Double.parseDouble(input2);

        String op = JOptionPane.showInputDialog("Escolha a operação (+, -, *, /):");

        double resultado = 
              ("+".equals(op) ? num1 + num2 : 0)
            + ("-".equals(op) ? num1 - num2 : 0)
            + ("*".equals(op) ? num1 * num2 : 0)
            + ("/".equals(op) ? num1 / num2 : 0);

        JOptionPane.showMessageDialog(null, String.format("%.2f %s %.2f = %.2f", num1, op, num2, resultado));
    }
}
