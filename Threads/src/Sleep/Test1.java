package Sleep;

public class Test1 extends Thread {
    
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.start();
	}
}
