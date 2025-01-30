package fundamentos.conversao;

import javax.swing.JOptionPane;

//recebe 3 salarios de um funcionario e calcula a media de salario dessa pessoa
//converter virgulas em pontos quando o usuario digitar o salario
//somar e dividir por 3

public class DesafioConversao {

	public static void main(String[] args) {
		// Usuario insere nome e salario, onde o codigo vai substituir virgulas por pontos
		String nome = JOptionPane.showInputDialog("Digite seu nome ");
		String salario1 = JOptionPane.showInputDialog("DIgite seu salario do mês 1: ").replace(",", ".");
		String salario2 = JOptionPane.showInputDialog("DIgite seu salario do mês 2: ").replace(",", ".");
		String salario3 = JOptionPane.showInputDialog("DIgite seu salario do mês 3: ").replace(",", ".");

		// Converte string para double
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);

		// Soma e media dos salarios
		double soma = sal1 + sal2 + sal3;
		double media = soma / 3;

		// Arredondando
		soma = Math.round(soma * 100.0) / 100.0;
		media = Math.round(media * 100.0) / 100.0;

		// Exibe os resultados
		System.out.println("A soma do salário do colaborador " + nome + " neste trimestre foi: " + soma);
		System.out.println("A média salarial do colaborador " + nome + " neste trimestre foi: " + media);
	}
}