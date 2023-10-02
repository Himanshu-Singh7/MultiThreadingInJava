package Dedlock;

public class Dedlock2 {

	public void run2() {
		//T3
		synchronized (Test.obj2) {//T2
			//
			synchronized (Test.obj1) {
				
			}
			
		}
	}
}
