package controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe um numero: ");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é par");
        } else {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é impar");
        }
    }
}
