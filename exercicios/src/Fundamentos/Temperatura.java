package Fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		//(ºF - 32) x 5/9 = º C
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
	    System.out.print("Digite a temperatura em fahrenheit => ");
		
		double fahrenheit = sc.nextDouble();
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é "+  celcius +"º Celcius");
		
	}
	
}
