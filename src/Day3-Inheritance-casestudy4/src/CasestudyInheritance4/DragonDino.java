package CasestudyInheritance4;

public class DragonDino extends LavaDino {
	
	private int numberOfWings;
	private int numberOfScales;
	
	
	public DragonDino(String species, String consumptionType, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfWings, int numberOfScales) {
		super(species, consumptionType, canBreatheFire, hasHeatResistance);
		this.numberOfWings = numberOfWings;
		this.numberOfScales = numberOfScales;
	}

	public void displayDinoDetails()
	{
		System.out.println("numberOfWings:"+numberOfWings);
		System.out.println("numberOfScales:"+numberOfScales);
	}
}
