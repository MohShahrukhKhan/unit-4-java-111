package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		Ticket ticket=new Ticket() ;
		System.out.println("Enter No of Booking:");
		int booking=input.nextInt();
		System.out.println("Available tickets:");
		  int availableTickets=input.nextInt();
		ticket.setAvailableTickets(availableTickets);

		for(int i=0;i<booking;i++) {
		System.out.println("Enter the ticketid:");
		 int ticketid=input.nextInt();
			System.out.println(" Enter the price:");
		 int price=input.nextInt();
		
					  System.out.println(" Enter the no of tickets:");
			 int nooftickets=input.nextInt();
			ticket.setPrice(price);
			ticket.setTicketid(ticketid);
			
			int totalAmount= ticket.calculateTicketCost(nooftickets);
		  
		  //output
		  System.out.println("Total Amount :"+"  "+totalAmount);
		System.out.println("Available ticket after booking:"+" "+ticket.getAvailableTickets());
		} 
	}

}
