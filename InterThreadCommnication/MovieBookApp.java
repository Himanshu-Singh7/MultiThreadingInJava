package InterThreadCommnication;

public class MovieBookApp {
	public static void main(String[] args) throws InterruptedException {
		TotalEarning te = new TotalEarning();
		te.start();
		//System.out.println("Tatal earing of Movie : " + te.total+" Rs");
		synchronized (te) {
			te.wait();
			System.out.println("Tatal earing of Movie : " + te.total+" Rs");
		}
		
	}

}
