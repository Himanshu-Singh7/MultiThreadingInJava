package NamingMethod;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Himanshu");
		//System.out.println("New thread name : "+Thread.currentThread().getName());
		System.out.println(10/0);
	}

}
