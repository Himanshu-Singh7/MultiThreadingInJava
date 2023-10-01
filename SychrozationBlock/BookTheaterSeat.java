package SychrozationBlock;

public class BookTheaterSeat {
	
	int total_Seat = 10;
	
	
	    void bookSeat(int seats) {
	    	System.out.println("hi :" + Thread.currentThread().getName());
	    	System.out.println("hi :" + Thread.currentThread().getName());
	    	System.out.println("hi :" + Thread.currentThread().getName());
	    	System.out.println("hi :" + Thread.currentThread().getName());
	    	System.out.println("hi :" + Thread.currentThread().getName());
			synchronized (this) {
				if(total_Seat >= seats) {
	    		
	    		System.out.println(seats + "Seats booked sucessfully");
	    		total_Seat = total_Seat - seats;
	    		System.out.println("Seats remaing : " + total_Seat);
	    		
	    	}else {
	    		System.out.println("Sorry Seats can not booked");
	    		System.out.println("Seats left :" + total_Seat);
	    	}
			}
	    	System.out.println("Bye :" + Thread.currentThread().getName());
	    	System.out.println("Bye :" + Thread.currentThread().getName());
	    	System.out.println("Bye :" + Thread.currentThread().getName());
	    	System.out.println("Bye :" + Thread.currentThread().getName());
	    	System.out.println("Bye :" + Thread.currentThread().getName());
	    	System.out.println("Bye :" + Thread.currentThread().getName());
		}
}
