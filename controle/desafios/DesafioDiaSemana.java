package controle.desafios;

import javax.swing.*;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Informe o dia da semana em números : ");
        int numDia = Integer.parseInt(dia);

        if(numDia == 1){
            System.out.println("Domingo.");
        } else if (numDia == 2){
            JOptionPane.showMessageDialog(null, "Segunda-feira.");
        } else if (numDia == 3) {
             JOptionPane.showMessageDialog(null, "Terça-feira.");
        } else if (numDia == 4){
            JOptionPane.showMessageDialog(null, "Quarta-feira.");
        } else if (numDia == 5){
            JOptionPane.showMessageDialog(null, "Quinta-feira.");
        } else if (numDia == 6){
            JOptionPane.showMessageDialog(null, "Sexta-feira.");
        } else if (numDia == 7){
            JOptionPane.showMessageDialog(null, "Sábado.");
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido.");
        }
    }
}
