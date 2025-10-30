package fundamentos;

public class ConversoesTipoPrimitivoNumerico {
	public static void main(String[] args) {
		float a = (float) 90.7; // conversao explicita
		System.out.println(a);
		double b = 1; // conversao implicita
		System.out.println(b);
		
		int c = 12;
		byte d = (byte) c;
		System.out.println(d);// explicita (cast)
		
		double e = 1.99932;
		int f = (int) e;
		System.out.println(f); // explicita (cast)
		
	}
}
