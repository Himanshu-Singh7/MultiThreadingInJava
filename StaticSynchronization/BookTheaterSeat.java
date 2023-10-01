package StaticSynchronization;

public class BookTheaterSeat {

	static int total_Seats = 20;
	
	static synchronized void bookSeat(int seats) {
		if(total_Seats >= seats) {
			total_Seats = total_Seats - seats;
			System.out.println(seats +"Book Seat is confirm");
			System.out.println("Ramaing Seats : " +total_Seats );
		}else {
			System.out.println("Sorry seats can not booked");
			System.out.println("Ramaing Seats : " +total_Seats );
		}
	}
}
