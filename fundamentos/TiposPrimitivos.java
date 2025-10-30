package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informaçoes do funcionario
		
		// tipos numericos
		byte anosdeempresa = 23;
		short numerooDeVoos = 542;
		int id = 44342;
		// definir literal Long, necessario colocar um "L" do lado do numero
		long pontosAcumulados = 3_342_432_343L;
		
		// tipos numericos
		
		/*
		 * necessario o "F" no final, para o java entender
		 *  que é um float
		 *  pois o padrao java é o double
		 */
		float salario = 43_432.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo boolean
		boolean estaDeFerias = true;
		
		
		// caracter	
		char status = 'A'; // ativo
		
		// dias de empresa
		System.out.println("dias de empresa: " + anosdeempresa * 365);
		
		//numero de viagens
		
		System.out.println("numero de viagens: " + numerooDeVoos / 2);
		
		// pontos reais
		System.out.println("pontos reais " + pontosAcumulados / vendasAcumuladas);
		
		// id + salario
		
		System.out.println("o id " + id + " ganha -> " + salario);
		System.out.println("ferias ? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
	}
}
