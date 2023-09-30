package ThreadClass;


class Test3 extends Thread {
	public void run() {
		System.out.println("task 1");
	}
}

class Test4 extends Thread{
	public void run() {
		System.out.println("task 2");
	}
}

public class Test5 {
    public static void main(String[] args) {
		Test3 t3  = new Test3();
		t3.start();
		Test4 t4 = new Test4();
		t4.start();
	}
}
