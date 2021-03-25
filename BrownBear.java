import java.util.Arrays;


public class BrownBear extends Animal implements Walkable, Swimmable {
	final protected String[] ss= {
			"Alaskan", "Asiatic", "European",
			"Grizzly", "Kodiak", "Siberian"};
	
	protected String subSpecies;
	
	public BrownBear() {
		super();
		setSubSpecies("Alaskan");
		
	}
	
	public BrownBear(int simID, Location location, String subSpecies)
	{
		super(simID, location);
		setSubSpecies("Alaskan");
		
	}

	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		if(!Arrays.asList(ss).contains(subSpecies)) {
			throw new InvalidSubspeciesException();
		}
		this.subSpecies = subSpecies;
	}
	
	public void swim(int direction) {
		int currentX=super.location.getCoordinates()[0];
		int currentY=super.location.getCoordinates()[1];
		if(direction%2==0) {
			currentX += 2;
		}else {
	
			currentY += 2;
		}
		super.location.update(currentX, currentY);
	}
	
	public void walk(int direction)
	{
		int currentX=super.location.getCoordinates()[0];
		int currentY= super.location.getCoordinates()[1];
		if(direction %2==0) {
			currentX += 3;
		}else {
			currentY += 3;
		}
		super.location.update(currentX, currentY);
	}
	

}
