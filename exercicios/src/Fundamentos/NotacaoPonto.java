package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s.toUpperCase();
		s = s.replace("X", "Senhora");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toLowerCase() 
				.concat("!!!") ;
		System.out.println(y);
		
		String r = "Leo".toUpperCase();
		System.out.println(r);
		
		String q = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		
		//Tipos primitivos não tem o operador "."
		int d = 3;
		System.out.println(d);
				
	}
	
	
}
