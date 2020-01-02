package caseStudy2Inheritance;

public class LavaDino {

	
	 String species;
	 String locomotionType;
	 float  locomotionSpeed;
	
	

	
	public LavaDino(String species, String locomotionType, float locomotionSpeed) {
		// TODO Auto-generated constructor stub
		super();
		this.species = species;
		this.locomotionType = locomotionType;
		this.locomotionSpeed = locomotionSpeed;
	}


	void   displayDinoSpeed()
	{
		System.out.println(species);
		float speed=locomotionSpeed;
		System.out.println(speed);
	}
}
