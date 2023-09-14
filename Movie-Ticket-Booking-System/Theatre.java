package com.jsp.MovieTicketBookingSystem;

public class Theatre {
	
		private String theatre_name;
		private int no_of_seats;
			
		private Ticket ticket;
		
		
		public Theatre(String t, int n){
			this.theatre_name=t;
			this.no_of_seats=n;		
		}
	
		public String getTheatre_name() {
			return theatre_name;
		}
	
		public void setTheatre_name(String theatre_name) {
			this.theatre_name = theatre_name;
		}
	
		public int getNo_of_seats() {
			return no_of_seats;
		}
	
		public void setNo_of_seats(int no_of_seats) {
			this.no_of_seats = no_of_seats;
		}
	
		public Ticket getTicket() {
			return ticket;
		}
	
		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		
				
		// To book a ticket
		public int bookTicket() {
			if(ticket.getNo_of_tickets()<= no_of_seats) {
				no_of_seats = no_of_seats-ticket.getNo_of_tickets();
				return ticket.getNo_of_tickets();			
			}else {
				return -1;
			}
		}
		
		
		// To check seat availability
		public void showSeatAvailability() {
			if(no_of_seats>0) {
				System.out.println(no_of_seats+ " seats are available");
			}else {
				System.out.println("Sorry, the theatre is housefull. All the seats are booked");
			}
		}
		
		
		// To cancel a ticket
		public void cancelTickets(int cancel_tickets) {
			if(ticket==null) {
				System.out.println("Kindly, book tickets first");
			}else {
				if(cancel_tickets <= ticket.getNo_of_tickets()) {
					no_of_seats = no_of_seats+cancel_tickets;
					ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancel_tickets);
					System.out.println("Tickets cancelled Succesfully");				
				}else {
				System.out.println("Error: Number of tickets to be cancelled exceeds number of tickets booked");
				}
			}
		}
				
			
		// To show ticket details
		public void showTicketDetails() {
			if(ticket==null) {
				System.out.println("Please book ticket first");
			}else {
				ticket.printTicketDetails();
				}
		}

}
