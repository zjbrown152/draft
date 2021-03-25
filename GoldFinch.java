
public class GoldFinch extends Animal implements Flyable, Walkable 
{
	double wingSpan;
	
	public GoldFinch()
	{
		super();
		setWingSpan(9.0);
		
		
	}
	
	public GoldFinch(int simID, Location location, double wingSpan)
	{
		super(simID, location);
		setWingSpan(wingSpan);
		
		
	}

	public double getWingSpan() {
		return this.wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		if(wingSpan < 5.0 || wingSpan>11.0) {
			throw new InvalidWingspanException();
		}else 
		{
			
		this.wingSpan = wingSpan;
		}
	
	}
	
	public void walk(int direction) {
		int currentX=super.location.getCoordinates()[0];
		int currentY=super.location.getCoordinates()[1];
		if(direction %2==0) {
			currentX += 1;
		}else 
		{
			currentY += 1;
		}
		super.getLocation().update(currentX, currentY);
	}
	public void fly(Location location)
	{
		super.setLocation(location);
	}
}
