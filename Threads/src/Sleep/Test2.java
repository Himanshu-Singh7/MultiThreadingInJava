package Sleep;

public class Test2 extends Thread {
	
	public void run() {
		for(int i = 1 ; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + ":" + Thread.currentThread().getName());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
     
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.start();
		
		Test2 t3 = new Test2();
		t3.start();
		
	}
}
