package RunnableInterface;

public class Test implements Runnable {
	
	public void run() {
		System.out.println(200);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
	}

}
