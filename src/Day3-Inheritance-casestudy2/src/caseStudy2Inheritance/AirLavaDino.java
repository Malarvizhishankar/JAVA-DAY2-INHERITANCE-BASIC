package caseStudy2Inheritance;

public class AirLavaDino extends LavaDino {
	
	private int numberOfWings;
	private float speedPerWing;
	private float ashResistance;
	
	public AirLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfWings,
			float speedPerWing, float ashResistance) {
		super(species, locomotionType, locomotionSpeed);
		this.numberOfWings = numberOfWings;
		this.speedPerWing = speedPerWing;
		this.ashResistance = ashResistance;
	}

	
	void displayDinoSpeed(float  locomotionSpeed,String species)
	{
		//float locomotionspeed=locomotionSpeed;
		float speed = locomotionSpeed +(numberOfWings*speedPerWing)- ashResistance;
		System.out.println(species);
		System.out.println(speed);
	}
}
