package com.jsp.MovieTicketBookingSystem;

import java.util.Scanner;

public class BoxOffice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("PVR", 500);
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("1. Show Seat Availability");
			System.out.println("2. Book Ticket");
			System.out.println("3. Check Ticket Details");
			System.out.println("4. Cancel Ticket");
			System.out.println("5. Exit");
			
		int n = sc.nextInt();
		
		switch(n) {
		
			case 1:{
					theatre.showSeatAvailability();
			}break;
				
			
			case 2:{
					System.out.println("Enter the Movie Name: ");
					String name = sc.next();
					System.out.println("Enter the number of seats to be booked: ");
					int num = sc.nextInt();
					
					theatre.setTicket(new Ticket(name, num));
					int booked = theatre.bookTicket();
					if(booked==-1) {
						System.out.println("Sorry, the number of seats you are trying to book are not available.");
					}else {
						System.out.println("Hurray! Tickets are booked successfuly. Enjoy the movie!");
					}
					
			}break;
			
				
			case 3:{
					theatre.showTicketDetails();
			}break;
				
			
			case 4:{
					System.out.println("Enter the number of tickets to be cancelled ");
					int cancel = sc.nextInt();
					theatre.cancelTickets(cancel);
			}break;
				
			
			case 5:{
					System.out.println("Thank You for using our Ticket Booking System!");
					flag = false;
			}break;
				
			
			default:{
					System.out.println("Invalid choice");
			}
		}
	}
  }
}
