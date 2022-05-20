package com.masai;

public class Ticket {
	private int ticketid;
	private int price; 
	private static int availableTickets;
	
	public int calculateTicketCost(int nooftickets) {
		availableTickets=availableTickets-nooftickets;
		if(availableTickets>=0) {
		
			int  totalamount = getPrice()*nooftickets;
			return totalamount;
		}else {
			availableTickets=availableTickets+nooftickets;
			return -1;
		}
	
		
	}
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
			Ticket.availableTickets = availableTickets;
		}
	
	}
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

}
