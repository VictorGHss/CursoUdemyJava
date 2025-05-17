package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!\nParabens!");
        }
        if (media <= 4.5)
            System.out.println("Em recuperação");

        boolean criterioReprovacaoAntigido = media < 4.5 && media >= 0;

        if (criterioReprovacaoAntigido) {
            System.out.println("Reprovado!");
        }

        entrada.close();
    }

}
