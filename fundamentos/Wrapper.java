package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i  = 10000;
		Long l = 100000l;
		Float f = 100.33f;
		Double d = 2212313.3313;
		System.out.println(f);
		System.out.println(d);
		System.out.println(i);
		System.out.println(l);
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		Boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(bo);
		
		Character c  = '#';
		System.out.println(c + "....");
	}
}
