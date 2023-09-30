package Join;

public class Test1 extends Thread {
	static Thread mainthread;
	public void run() {
		
		try {
			mainthread.join();
			for(int i = 1; i <= 5; i++) {
				System.out.println("Child thread" + ":" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		mainthread = Thread.currentThread();
		Test1 t1 = new Test1();
		t1.start();
		
		try {
			
			for(int i = 1 ; i <= 5 ; i++) {
				System.out.println("Main Thread" + ":"+ i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
