package caseStudy2Inheritance;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String species=s.next();
		String locomotionType=s.next();
		float  locomotionSpeed=s.nextFloat();
		int numberOfWings;
		float speedPerWing;
		float ashResistance;
		int numberOfFins;
		float numberOfTails;
		float waterMultiplier;
		int numberOfLegs;
		
		//LavaDino ld=new LavaDino(species,locomotionType,locomotionSpeed);
		//ld.displayDinoSpeed();
		if (species.equalsIgnoreCase("Air"))
		{
			  numberOfWings=s.nextInt();
			 speedPerWing=s.nextFloat();
			 ashResistance=s.nextFloat();
			AirLavaDino ald=new AirLavaDino(species,locomotionType,locomotionSpeed,numberOfWings,speedPerWing,ashResistance);
			ald.displayDinoSpeed(locomotionSpeed,species);
		}else if(species.equalsIgnoreCase("Water"))
		{
			numberOfFins=s.nextInt();
			numberOfTails=s.nextFloat();
			waterMultiplier=s.nextFloat();
			WaterLavaDino wld=new WaterLavaDino(species,locomotionType,locomotionSpeed,numberOfFins,numberOfTails,waterMultiplier);
			wld.displayDinoSpeed(locomotionSpeed,species);
		}
		else if(species.equalsIgnoreCase("Land"))
		{
			numberOfLegs=s.nextInt();
			LandLavaDino lld= new LandLavaDino(species,locomotionType,locomotionSpeed,numberOfLegs);
			lld.displayDinoSpeed(locomotionSpeed,species);
		}
		else
			System.out.println("No Identified species");
		
	}

}
