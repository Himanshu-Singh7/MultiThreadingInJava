package DaemonThread;

public class Test extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("daemon thred");
	}
	
	public static void main(String[] args) {
		System.out.println("Main thread");
		Test t = new Test();
		t.setDaemon(true);
		t.start();
		
	}

}
