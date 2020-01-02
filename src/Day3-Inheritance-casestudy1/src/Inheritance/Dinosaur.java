package Inheritance;

public class Dinosaur {

	String  species;
	String  locomotionType;
	
	

	public Dinosaur(String species, String locomotionType) {
		// TODO Auto-generated constructor stub
		super();
		this.species = species;
		this.locomotionType = locomotionType;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getLocomotionType() {
		return locomotionType;
	}

	public void setLocomotionType(String locomotionType) {
		this.locomotionType = locomotionType;
	}
	
	public void display(String species,String locomotionType,boolean hasHeatResistance)
	{
		
		
		System.out.println("Species\t"+this.species);
		System.out.println("LocomotionType\t"+this.locomotionType);
	}
	
}
