package selfstudy;

import java.util.Scanner;

public class TestTicket {

	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);

	        System.out.println("Enter stage event :  ");
	        String stg = sc.nextLine();
	     
	        System.out.println("Enter  customer name : ");
	        String cname = sc.nextLine();
	     
	        
	        System.out.println("Enter number of seats : ");
	        String seats = sc.nextLine();
	     
	        
	        
	        TicketBooking booking = new TicketBooking(stg,cname,Integer.parseInt(seats));

	        System.out.println("Choose payment method:");
	        System.out.println("1. Cash");
	        System.out.println("2. Online Wallet");
	        System.out.println("3. Credit Card");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.println("Enter amount:");
	            double camount = sc.nextDouble();
	            booking.printReceipt();
	            booking.makePayment(camount);
	            
	        } else if (choice == 2) {
	            System.out.println("Enter wallet number:");
	            String wnumber = sc.next();
	            System.out.println("Enter wallet amount:");  
	            double wamount = sc.nextDouble();
	            booking.printReceipt();  
	            booking.makePayment(wnumber, wamount);
	            
	        } else if (choice == 3) {
	        	
	            System.out.println("Enter card number :");
	            String cnumber = sc.next();
	            System.out.println("Enter card holder name:");  
	            String hname = sc.next();
	            System.out.println("Enter amount:");   
	            double camount = sc.nextDouble();
	            booking.printReceipt();
	    	    
	            booking.makePayment(cnumber, hname, camount);
	        } else {
	            System.out.println("Error.....!!");

	        }

	}

}
