package SychrozationBlock;

public class MovieBookApp extends Thread{
	static BookTheaterSeat b;
	int seats ;
	public void run() {
		
		b.bookSeat(seats);
	}
    
	public static void main(String[] args) {
		b = new BookTheaterSeat();
		MovieBookApp himanshu = new MovieBookApp();
		himanshu.seats = 7;
		himanshu.start();
		
		MovieBookApp rahul = new MovieBookApp();
		rahul.seats = 6;
		rahul.start();
		
		
		
	}

}
