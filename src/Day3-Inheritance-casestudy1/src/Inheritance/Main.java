package Inheritance;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String species;
		String LocomotionType;
		boolean hasHeatResistance;
		species=in.nextLine();
		LocomotionType=in.nextLine();
		hasHeatResistance  =in.nextBoolean();
		LavaDino ld=new LavaDino(species,LocomotionType,hasHeatResistance);
     	ld.display(species,LocomotionType,hasHeatResistance);

	}

}
