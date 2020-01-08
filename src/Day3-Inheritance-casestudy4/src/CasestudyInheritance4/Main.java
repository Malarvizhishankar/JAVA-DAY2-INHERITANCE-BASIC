package CasestudyInheritance4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s =new Scanner(System.in);
		 String species= s.next();
		 String consumptionType=s.next();
		 boolean   canBreatheFire=s.hasNextBoolean();
		boolean hasHeatResistance=s.hasNextBoolean();
		 int numberOfWings=s.nextInt();
		 int numberOfScales=s.nextInt();
		 DragonDino dd=new DragonDino(species, consumptionType, canBreatheFire, hasHeatResistance, numberOfWings, numberOfScales);
		 dd.displayDinoDetails();
	}

}
