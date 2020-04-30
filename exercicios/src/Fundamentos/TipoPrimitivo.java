package Fundamentos;

public class TipoPrimitivo {

	
	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos numéricos interiros
		byte anoDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipo numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; 
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println( anoDeEmpresa * 365 );
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2 );
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha => " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
	
}
