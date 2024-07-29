package selfstudy;

public class TicketBooking {
		
	
	 	private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    
	    public TicketBooking() {}

	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }


	   
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    public String getCustomer() {
	        return customer;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    public Integer getNoOfSeats() {
	        return noOfSeats;
	    }

	    public void setNoOfSeats(Integer noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	  	
	    public void makePayment(double amount) {
	        System.out.printf("Payment in cash : "+ amount+"\n");
	    }

	    public void makePayment(String walletNumber, double amount) {
	        System.out.printf("Payment using wallet : "+ amount+"    Wallet Number :  "+ walletNumber);
	    }

	    public void makePayment(String cardNumber, String cardHolderName, double amount) {
	        System.out.printf("Payment using card : "+ amount+ " Card number : "+ cardNumber+"Card holder name : " +cardHolderName);
	    }

	    public void printReceipt() {
	        System.out.println("Invoice ===>>>>");
	        System.out.println("Stage Event: " + stageEvent);
	        System.out.println("Customer: " + customer);
	        System.out.println("Number of Seats: " + noOfSeats);
	    }


}
