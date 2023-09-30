package Priority;

public class Test extends Thread {
    public void run() {
    	System.out.println("child thread");
    	System.out.println("Child thred : "+Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
		System.out.println("Main thread : "+Thread.currentThread().getPriority());
    	Test t = new Test();
    	t.setPriority(MAX_PRIORITY);
    	t.start();
	}
}
