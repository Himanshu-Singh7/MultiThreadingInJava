package Dedlock;

public class Dedlock1 {

	public void run1() {
		// remaing thread waiting T4 , T5
		synchronized (Test.obj1) {//T1
			//
			synchronized (Test.obj2) {
				
			}
			
		}
	}
}
