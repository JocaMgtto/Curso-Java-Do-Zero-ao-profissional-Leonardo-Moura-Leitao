package Streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media()
						.add(9.3)
						.add(6.3)
						.add(7.3)
						.add(2.3);
		Media m2 = new Media()
				.add(4.3)
				.add(5.3)
				.add(9.3)
				.add(8.3);
	
		System.out.println(Media.combinar(m1, m2).getValor());
		
	}
	
}
