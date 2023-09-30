package ThreadClass;

public class Test extends Thread {
	
	public void run() {
		System.out.println(100);
	}
    public static void main(String[] args) {
		Test t = new Test();
		t.start();
	}
}
