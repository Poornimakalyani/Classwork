package classwork;


interface Flightbooking1{
	
abstract void checkAvailablity();
	
	static void displayPassangerDetails() {
		
		String passangerName="Poornima Kalyani";
		int seatNumber=25;
		String flightName="Vistara";
		int flightNumber=67890;
		
		
		
        
		System.out.println("****Booking Details of passanger****");
		System.out.println("Passanger Name:"+ passangerName);
		System.out.println("Seat Number:"+ seatNumber);
		System.out.println("Flight Name:"+ flightName);
		System.out.println("Flight Number:"+flightNumber);
		
	}
	
}

class RemainingTickets implements Flightbooking1{
	int availableTickets=50;
	int totalTicketsBooked=22;
	double totalPriceOfOneTicket=1000;
	
	@Override
	public void checkAvailablity() {
		
	int remainingtickets=this.availableTickets- this.totalTicketsBooked;
	double totalBookedTicketPrice=this.totalTicketsBooked*this.totalPriceOfOneTicket;
	
	System.out.println("Total available Tickets:"+availableTickets);
	System.out.println("Total Booked Ticket:"+totalTicketsBooked);
	System.out.println("Price of one Ticket:"+totalPriceOfOneTicket);
	System.out.println("Remaining tickets:"+remainingtickets);
	System.out.println("Total Booked ticket Price:"+totalBookedTicketPrice);
		
	}
	
}


class Vistara implements Flightbooking1 {

	@Override
	public void checkAvailablity() {
		System.out.println("Vistara flights are avilable on 20-07-2024");
		
	}
	
		
	}
class AirIndiaExpress implements Flightbooking1{

	@Override
	public void checkAvailablity() {
		
		System.out.println("AirIndiaExpress flights are available on 01-08-2024");
		
	}
	
	
}
public class MakemyTripBookingDetails {
	

	public static void main(String[] args) {
		
		Vistara vis=new Vistara ();
		vis.checkAvailablity();
		
		AirIndiaExpress air=new AirIndiaExpress ();
		air.checkAvailablity();
		
		Flightbooking1.displayPassangerDetails();
		
	
		RemainingTickets rt=new RemainingTickets();
		rt.checkAvailablity();
		
		
		
		

	}

}
