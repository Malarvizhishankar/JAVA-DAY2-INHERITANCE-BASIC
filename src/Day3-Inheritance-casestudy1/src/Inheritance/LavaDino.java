package Inheritance;

public class LavaDino extends Dinosaur {

	private boolean hasHeatResistance;
	

	public LavaDino(String species, String locomotionType, boolean hasHeatResistance) {
		
		super(species, locomotionType);
		this.hasHeatResistance = hasHeatResistance;
	}

	public void  display(String species,String locomotionType,boolean hasHeatResistance)
	{
		super.display(species,locomotionType,hasHeatResistance);
		if(hasHeatResistance)
		{
			System.out.println("HasHeatResistance\t"+this.hasHeatResistance);
			System.out.println("Species "+species+" exist");
		}
		else
		{
			System.out.println("HasHeatResistance\t"+this.hasHeatResistance);
			System.out.println("Species "+species+" not exist");
		}
		
	}
	
}
