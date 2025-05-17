package controle;

import javax.swing.*;
import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = JOptionPane.showInputDialog("Informe a nota: ");
        double nota = Double.parseDouble(valor);

        if (nota > 10 || nota < 0) {
            JOptionPane.showMessageDialog(null, "Nota invalida. Vai mentir assim lá na pqp");
        } else if (nota >= 8.1) {
            JOptionPane.showMessageDialog(null, " Conceito A");
        } else if (nota >= 6.1) {
            JOptionPane.showMessageDialog(null, " Conceito B");
        } else if (nota >= 4.1) {
            JOptionPane.showMessageDialog(null, " Conceito C");
        } else if (nota >= 2.1) {
            JOptionPane.showMessageDialog(null, " Conceito D");
        } else {
            JOptionPane.showMessageDialog(null, " Conceito E");
        }
        sc.close();
    }
}

