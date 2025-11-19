package Excecao;



public class ChecadaNChecada {

	public static void main(String[] args) {
		try {
			gerarErro();
		} catch (RuntimeException exp) {
			System.out.println(exp.getMessage());
			
		}
		try {
			gerarErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
		
	}
	

	// nao checada ou nao verificada.
	static void gerarErro() {
		// throw significa lancar erro.
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		
	}
	//Excessao checada ou veri
	static void gerarErro2() throws Exception{
		
		throw new Exception("Ocorreu um erro bem legal");
	}

}