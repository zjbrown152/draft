
public class Location {
	protected int xCoord;
	protected int yCoord;
	
	public Location() 
	{
		update(0,0);
		
	}
	
	public Location(int x, int y)
	{
		update(x,y);
		
	}
	public void update(int x, int y) throws InvalidCoordinateException
	{
		if(x<0 || y<0) {
			throw new InvalidCoordinateException();
		}
		xCoord=x;
		yCoord=y;
		
	}
	public int[] getCoordinates()
	{
		int[] spot= {xCoord, yCoord};
		return spot;
		
	}

	
}
