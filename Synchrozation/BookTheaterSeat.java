package Synchrozation;

public class BookTheaterSeat {
    int total_Seat = 10;
	
   synchronized void bookSeat(int seats) {
		
    	if(total_Seat >= seats) {
    		
    		System.out.println(seats + "Seats booked sucessfully");
    		total_Seat = total_Seat - seats;
    		System.out.println("Seats remaing : " + total_Seat);
    		
    	}else {
    		System.out.println(seats +"Seats can not booked");
    		System.out.println("Seats left :" + total_Seat);
    	}
	}
}
