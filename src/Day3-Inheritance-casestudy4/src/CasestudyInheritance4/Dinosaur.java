package CasestudyInheritance4;

public class Dinosaur {

	

	private String species;
	private String consumptionType;
	
	
	public Dinosaur(String species, String consumptionType) {
		super();
		this.species = species;
		this.consumptionType = consumptionType;
	}

	public void displayDinoDetails()
	{
		System.out.println("Species:"+species);
		System.out.println("consumptionType:"+consumptionType);
	}

}
