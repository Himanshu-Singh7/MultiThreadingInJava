package NamingMethod;

public class Test1 extends Thread{
	public void run() {
		
		Thread.currentThread().setName("Himanshu");
		System.out.println("Himanshu thread : "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}

}
