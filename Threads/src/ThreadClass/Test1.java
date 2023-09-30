package ThreadClass;

public class Test1 extends Thread {
    public void run() {
    	System.out.println("Single task");
    }
    
    public static void main(String[] args) {
    	Test1 t1 = new Test1();
    	t1.start();
    	
    	Test1 t2 = new Test1();
    	t2.start();
	}
}
