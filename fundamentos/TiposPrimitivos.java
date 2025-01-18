package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// info do funcionario

		// tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56731;
		long pontosAcumulados = 3_234_783_154L;

		// tipos numericos reais

		float salario = 11_555.77F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo booleano

		boolean estaDeFerias = false;
		// boolean estaDeFerias = true;

		// tipo caractere

		char status = 'A';

		// dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// numero de viagens
		System.out.println(numeroDeVoos / 2);

		// pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias?" + estaDeFerias);
		System.out.println("Status: " + status);

	}

}
