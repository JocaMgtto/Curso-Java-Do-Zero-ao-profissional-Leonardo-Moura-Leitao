package fundamentos;

public class numString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length()  + " ola");
		String real = num1.toString();
		System.out.println(real.length() + ",  " + real);
		int num2 = 2025;
		byte num3 = 33;
		System.out.println(Integer.toString(num2));
		System.out.println(Byte.toString(num3));
		String num4 = Byte.toString(num3);
		System.out.println(num4);
		
	}
}
