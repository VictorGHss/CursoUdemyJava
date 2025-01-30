package fundamentos.tiposprimitivos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Jalam";
		var sobrenome = "Bipal";
		var idade = 33;
		var salario = 12345.678;

		// System.out.println("Nome completo: " + nome + " " + sobrenome);
		// System.out.println("Idade: " + idade);
		// System.out.println("Salario: " + salario);

		System.out.printf("%s %s tem %s anos e recebe R$%.2f por mês.", nome, sobrenome, idade, salario);

		String frase = String.format("\n%s %s tem %s anos e recebe R$%.2f por mês.", nome, sobrenome, idade, salario);
		System.out.println(frase);

		System.out.println("Frase fodase".contains("fodase"));
		System.out.println("Frase fodase".indexOf("fodase"));
		System.out.println("Frase fodase".substring(6, 8));

	}

}
