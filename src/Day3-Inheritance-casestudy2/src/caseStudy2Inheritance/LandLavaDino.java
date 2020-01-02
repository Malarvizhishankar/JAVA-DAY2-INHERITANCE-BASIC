package caseStudy2Inheritance;

public class LandLavaDino extends LavaDino {

	
	private int numberOfLegs;
	

	public LandLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfLegs) {
		super(species, locomotionType, locomotionSpeed);
		this.numberOfLegs = numberOfLegs;
	}

	void  displayDinoSpeed(float locomotionSpeed,String species)
	{
		float lSpeed=locomotionSpeed;
		float speed = lSpeed*numberOfLegs;
		System.out.println(species);
		System.out.println(speed);
	}
}
