package caseStudy2Inheritance;

public class WaterLavaDino extends LavaDino{
	
	private int numberOfFins;
	private float numberOfTails;
	private float waterMultiplier;


	public WaterLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfFins,
			float numberOfTails, float waterMultiplier) {
		super(species, locomotionType, locomotionSpeed);
		this.numberOfFins = numberOfFins;
		this.numberOfTails = numberOfTails;
		this.waterMultiplier = waterMultiplier;
	}

	void displayDinoSpeed(float locomotionSpeed,String species)
	{
		float locomotion=locomotionSpeed;
		float speed = locomotion+(numberOfFins+numberOfTails)*waterMultiplier;
		System.out.println(species);
		System.out.println(speed);

	}
	
}
