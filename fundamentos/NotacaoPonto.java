package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replace("X", "Parça");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		String viados = ("Victor ".toUpperCase());
		System.out.println(viados);
		
		String y = "Bom dia X"
				.replace("X", "Victor")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// tipos primitivos nao tem o operador ""
		
		int a = 3;
		System.out.println(a);
	}

}
