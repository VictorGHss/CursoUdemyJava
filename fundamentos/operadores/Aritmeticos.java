package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {

		System.out.println(2 + 3);

		var x = 34.56;
		double y = 2.2;

		System.out.println("Soma de X e Y: " + (x + y));
		System.out.println("Subtração de X e Y: " + (x - y));
		System.out.println("Multiplicação de X e Y: " + (x * y));
		System.out.println("Divisão de X e Y: " + (x / y));
		System.out.println("Resto da divisao de X e Y: " + (x % y));
		System.out.println("===================================");

		int a = 8;
		int b = 3;

		System.out.println("Soma de A e B: " + (a + b));
		System.out.println("Subtração de A e B: " + (a - b));
		System.out.println("Multiplicação de A e B: " + (a * b));
		System.out.println("Divisão de A e B: " + (a / (double) b));
		System.out.println("Divisão de A e B: " + (a / (float) b));

		System.out.println("Resto da divisao de A e B: " + (a % b));
		System.out.println(8 % 3);

		System.out.println(x + y - a * b);
	}

}
