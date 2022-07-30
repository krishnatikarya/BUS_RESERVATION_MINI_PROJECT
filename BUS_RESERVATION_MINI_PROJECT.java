//KRISHNA TIKARYA || A208 || 70012000212 || BTECH-IT
import java.util.Scanner;
import java.util.Date;

public class Main {

	// we have Created an array of 6 seats, 3 sitting and 3 sleeper.
	private static int[] seats = new int[6];

	public static void main(String args[]) {
	    System.out.println("OOP MINI PROJECT:-");
	    System.out.println("BUS TICKETS BOOKING SYSTEM");
	    System.out.println("MADE BY:- KRISHNA TIKARYA || A208 || 70012000212 || BTECH-IT 2ND YEAR THIRD SEMESTER || NMIMS SHIRPUR CAMPUS");
	    System.out.println();
	    System.out.println("WELCOME TO KANHNA BUS SERVICES:-");
            System.out.println("near apollo cross roads chhatarpur mp");
            System.out.println("Bus no:- mp12cb2919, From:-chhatarpur to nagpur");
	    System.out.println("Thank you for choosing kahna bus services" );
	    System.out.println();
		
	    for (int i = 0; i < 6; i++) {
		seats[i] = 0;
	    }

	    // Setup our scanner and default the choice to sitting.
	    Scanner s = new Scanner(System.in);
	    int choice = 1;

	    //  we Ask user our for a sitting or an sleeper seat and store their coice.
	    System.out.print("Please choose from the following options:- \n");
            System.out.print("For sitting seat please press 1, \n");
	    System.out.print("For sleeper seat please press 2, \n");
	    System.out.print("For exit press 0, \n\n");
	    choice = s.nextInt();

	    // While their choice is not the one for exit, execute our booking.
	    while (choice != 0) {
		int seatnumber = 0;


		// If the user choose a sitting seat, so we do attempt to book it.
		if (choice == 1) {
		    seatnumber = bookSitting();


		    // No sitting seats available, try booking an sleeper seat for them instead.
		    if (seatnumber == -1) {
			seatnumber = bookSleeper();
	
			if (seatnumber != -1) {
			System.out.println("Sorry, we were not able to book a sitting seat. But do have an sleeper seat.");
			printBoardingPass(seatnumber);
	            }
		}
		else {
	             // when we used to Booking a sitting seat was successful.
        	     System.out.println();
		     System.out.println("You are in luck, we have a sitting seat available!");
		     printBoardingPass(seatnumber);
				}
		}
		else if (choice == 2) {

		     // If they chose booking an sleeper, check to see if it is available.
		     seatnumber = bookSleeper();
			
		    // If not available, see if we have sitting seats available.
		    if (seatnumber == -1) {
			seatnumber = bookSitting();

		        if (seatnumber != -1) {
			    System.out.println("Sorry, we were not able to book an sleeper seat. But do have a sitting seat.");
			    printBoardingPass(seatnumber);
		        }
		    }
		    else {
			 // Booking an sleeper seat was successful.
			 System.out.println();
			 System.out.println("you are lucky, we have an sleeper seat available!");
			 printBoardingPass(seatnumber);
		    }
		}
		else {
		     // Print an error message if they did not choose 1, 2, or 0 for their choice.
		     System.out.println("Invalid choice made. Please try again!");
		     choice = 0;
		}


		// No sitting or sleeper seats were available. 
		if (seatnumber == -1) {
		    System.out.println("We are sorry, there are no sitting or sleeper seats available.");
		    System.out.println();
		}


		// Reprompt for a choice
		System.out.print("Please choose from the following options:- \n");
                System.out.print("For sitting seat please press 1, \n");
		System.out.print("For sleeper seat please press 2, \n");
		System.out.print("For exit press 0, \n\n");
		choice = s.nextInt();
	    }

			
	}
	// This function checks for sitting seats and returns seat number or -1 if full.
	private static int bookSitting() {
		for (int i = 0; i < 3; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;
	}
	// This function checks to see if sleeper seats were available, -1 if full.
	private static int bookSleeper() {
		for (int i = 0; i < 6; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;

	}
	// this will print a boarding pass with all guidelines, thankyou
	private static void printBoardingPass(int seatnumber) {
	    System.out.println();
	    System.out.print ("For Booking please enter the following details \n");
	    Scanner Charname = new Scanner (System.in);
            System.out.print ("Please Enter Your Name:- ");
            Charname.nextLine();
            Scanner num = new Scanner (System.in);
            System.out.print ("Enter Your age:- ");
            num.nextLine();
            System.out.println();
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("your booking has been confirmed");
            System.out.println("please Pay Your seat charges at the time of boarding to the bus");
	    Date timenow = new Date();
	    System.out.println();
	    System.out.println("Date: " + timenow.toString());
	    System.out.println("The Boarding pass for seat number: " + seatnumber);
	    System.out.println("bus from :-chhatarpur to nagpur");
	    System.out.println("please arrive 15 min before the departure time given on tickets");
	    System.out.println("Please wear mask and do sanitize your hands fequently");             
	    System.out.println("bus is fully sanitized, please carry your vaccine certificate while travelling, Enjoy your trip.");
	    System.out.println("Thank you for choosing kahna bus service, have a safe journey");
	    System.out.println();
	}
}