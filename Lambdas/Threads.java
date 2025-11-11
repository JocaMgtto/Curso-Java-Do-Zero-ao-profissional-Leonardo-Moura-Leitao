package Lambdas;



public class Threads {

	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho1();
		Runnable t2 = new Runnable() {
			public void run() {
				for(int i = 0; i < 10; i ++) {
					System.out.println("Tarefa 02#");
					try {
						Thread.sleep(100);
					}catch(Exception e) {
					}
				}
			}
		};
		Runnable trabalho3 = Threads::trabalho3;
		
		
		Thread t3 = new Thread(trabalho3);
		Thread trab1 = new Thread(t1);
		Thread trab2 = new Thread(t2);
		
		t3.start();
		trab1.start();
		trab2.start();
		
		
		
		
	} 
	
	static void trabalho3() {
		for(int i = 0; i < 10; i ++) {
			System.out.println("Tarefa 03#");
			try {
				Thread.sleep(100);
			}catch(Exception e) {
			}
		}
	}
		
	
}
