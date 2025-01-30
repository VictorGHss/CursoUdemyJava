package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		String input = entrada.next().replace(",", ".");
		double media = Double.parseDouble(input);

		if (media <=10 && media >= 7.0) {
			System.out.println("Aprovado!\nParabens!");
		} if (media <=7 && media <=4.5)
			System.out.println("Em recuperção");

		entrada.close();
	}

}
