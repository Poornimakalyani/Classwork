package classwork;


class Movies {
	String movieName;
	private double price;
	private String movieCategory;
	private String langauge;
	private int noOfTickets;
	private double totalPrice;
	private int availableTickets;

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalprice2) {
		this.totalPrice = totalprice2;

	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}

	public void setLanguage(String langauge) {
		this.langauge = langauge;
	}

	public String getMovieName() {
		return movieName;
	}

	public double getPrice() {
		return price;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public String getLangauge() {
		return this.langauge;
	}

	public int getRemainingTickets() {
		return this.availableTickets - this.noOfTickets;
	}
	
	public double getTotalTicketPrice() {
		return this.price*this.noOfTickets;
	}

}

public class MovieTest {

	
	  //we can use this as well instead of getTotalTicketPrice 
	
	  public static double totalPrice(double ticketPrice, int tickets)  {
	  return ticketPrice * tickets;
	  
	  
	  }
	 

	public static void main(String[] args) {
		System.out.println("====================first Movie Details============================");
		Movies movie1 = new Movies();
		movie1.setMovieName("Despicable 4");
		movie1.setPrice(300);
		movie1.setMovieCategory("Cartoon");
		movie1.setLanguage("English");
		movie1.setAvailableTickets(50);
		movie1.setNoOfTickets(10);
	//	double totalprice = totalPrice(movie1.getPrice(), movie1.getNoOfTickets());
		double totalprice = movie1.getTotalTicketPrice();
		movie1.setTotalPrice(totalprice);
		System.out.println("Movie Name: " + movie1.getMovieName());
		System.out.println("Movie Price: " + movie1.getPrice());
		System.out.println("Movie Category: " + movie1.getMovieCategory());
		System.out.println("Movie Langauge: " + movie1.getLangauge());
		System.out.println("Available Tickets: " + movie1.getAvailableTickets());
		System.out.println("No of Tickets Booked: " + movie1.getNoOfTickets());
		System.out.println("Remaining Tickets:" + movie1.getRemainingTickets());
		System.out.println("Total Tickets price:" + movie1.getTotalPrice());
		
		
		
		System.out.println("====================Second Movie Details============================");
		Movies movie2 = new Movies();
		movie2.setMovieName("moni");
		movie2.setPrice(123.5);
		movie2.setMovieCategory("horror");
		movie2.setLanguage("English");
		movie2.setAvailableTickets(80);
		movie2.setNoOfTickets(20);
		/*
		 * double totalprice2 = totalPrice(movie2.getPrice(), movie2.getNoOfTickets());
		 * movie2.setTotalPrice(totalprice2);
		 */
		System.out.println("Second Movie Details ");
		System.out.println("Movie Name: " + movie2.getMovieName());
		System.out.println("Movie Price: " + movie2.getPrice());
		System.out.println("Movie Category: " + movie2.getMovieCategory());
		System.out.println("Movie Langauge: " + movie2.getLangauge());
		System.out.println("Available Tickets: " + movie2.getAvailableTickets());
		System.out.println("No of Tickets Booked: " + movie2.getNoOfTickets());
		System.out.println("Remaining Tickets:" + movie2.getRemainingTickets());
		System.out.println("Total Tickets price:" + movie2.getTotalTicketPrice());

	}

}
