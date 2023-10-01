package Synchrozation;

public class MyClass extends Thread {
	 
	static MyObject obj;
	
	 String name ;
	public void run() {
		
		obj.foo(name);
	}
	
	
	public static void main(String[] args) {
		obj = new MyObject();
		
		MyClass myclass1 = new MyClass();
		myclass1.name = "Himanshu";
		myclass1.start();
		
		MyClass myclass2 = new MyClass();
		myclass2.name = "rahul";
		myclass2.start();
	}
	

}
