package Inheritancecase6;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
	    
	    

	    	System.out.println("Enter the Source:\\n");
	    	String source = s.next();
	    	System.out.println("Enter the Destination:\\n");
	    	String destination = s.next();
	    	System.out.println("Enter the DateOfTravel:\\n");
	    	String dateOfTravel = s.next();
	    	System.out.println("Enter the numberOfPassengers:\\n ");
	    	int numberOfPassengers =s.nextInt();
	    	System.out.println("Enter the choice:\n");
	    	System.out.println("1.BusBooking\n2.TrainBooking\n3.FlightBooking\n");
	    	int n = s.nextInt();
	    		    	
	   switch(n)
	   {
	    	
	    case 1:
	    	System.out.println("Enter is AC:");
	    	boolean isAC = s.nextBoolean();
	    	System.out.println("Enter is Sleeper:");
	    	boolean isSleeper = s.nextBoolean();
	    	System.out.println("Enter has Wifi:");
	    	boolean hasWifi = s.nextBoolean();
	    	BusBooking bb = new BusBooking(source, destination, dateOfTravel, numberOfPassengers, isAC,isSleeper,hasWifi);
	    	bb.displaycalculateBill();
	    	break;
	    	
	    case 2:
	    	System.out.println("Enter the type of coach:");
	    	String coach = s.next();
	    	System.out.println("enter mealsOpted:");
	    	int mealsOpted = s.nextInt();
	    	TrainBooking tb = new TrainBooking(source,destination, dateOfTravel, numberOfPassengers, coach, mealsOpted);
	    	tb.calculateBill();
	    	
	    	break;
	    	
	    case 3:
	    	System.out.println("Enter class:");
	    	String classs = s.next();
	    	System.out.println("Enter luggageWeight:");
	    	float luggageWeight = s.nextFloat();
	       FlightBooking fb = new FlightBooking(source,destination, dateOfTravel, numberOfPassengers,classs,luggageWeight);
	       fb.calculateBill(luggageWeight);
	       break;
	    }
		}
	}


