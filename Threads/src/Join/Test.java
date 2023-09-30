package Join;

public class Test extends Thread {
	
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			try {
				System.out.println("Child thread" + ":" + i);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		t.start();
		t.join();
		
		try {
			for(int i = 1; i <= 5 ; i++) {
				
				System.out.println("Main thread" + ":" +i);
				Thread.sleep(100);
			
				
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
