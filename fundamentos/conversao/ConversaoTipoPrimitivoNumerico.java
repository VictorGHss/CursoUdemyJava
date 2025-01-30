package fundamentos.conversao;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.123456789999; // explicita (CAST)
		System.out.println(b);
		
		int c = 129;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);
		
		double e = 1.0;
		int f = (int) e;
		System.out.println(f);
		

	}

}
