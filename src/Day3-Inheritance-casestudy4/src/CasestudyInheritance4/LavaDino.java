package CasestudyInheritance4;

public class LavaDino extends Dinosaur {

	
	private boolean   canBreatheFire;
	private boolean hasHeatResistance;
	
	public LavaDino(String species, String consumptionType, boolean canBreatheFire, boolean hasHeatResistance) {
		super(species, consumptionType);
		this.canBreatheFire = canBreatheFire;
		this.hasHeatResistance = hasHeatResistance;
	}


	
	public void displayDinoDetails()
	{
		System.out.println("canBreatheFire:"+canBreatheFire);
		System.out.println("hasHeatResistance:"+hasHeatResistance);
	}
}
