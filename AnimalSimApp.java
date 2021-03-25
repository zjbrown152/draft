
public class AnimalSimApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*********************************************
		 Location Tests
		*********************************************/
		System.out.println("***************\nLocation Tests\n***************");
		
		Location firstLocation = new Location();
		int[] coords = firstLocation.getCoordinates();
		System.out.println("First Location X: " + coords[0] + " Y: " + coords[1]);
		System.out.println("First Location updated.");
		firstLocation.update(7, 11);
		coords = firstLocation.getCoordinates();
		System.out.println("First Location X: " + coords[0] + " Y: " + coords[1]);

		Location secondLocation = new Location(4, 5);
		coords = secondLocation.getCoordinates();
		System.out.println("Second Location X: " + coords[0] + " Y: " + coords[1]);
		
		try {
			System.out.println("Attempting to set Second Location to (-1, 0). ( Which will trigger an Exception)");
			secondLocation.update(-1, 0);
		} catch (InvalidCoordinateException e) {
			System.out.println("InvalidCoordinateException caught");
		}

		/*********************************************
		 Animal Tests
		*********************************************/
		System.out.println("***************\nAnimal Tests\n***************");

		Animal test = new BrownBear();
		System.out.println("Current simID for Animal: " + test.getSimID());
		test.setSimID(77);
		System.out.println("New simID for Animal: " + test.getSimID());
		test.setLocation(secondLocation);
		coords = test.getLocation().getCoordinates();
		System.out.println("Set  to Second Location at X: " + coords[0] + " Y: " + coords[1]);
		while(!test.isFull()) {
			System.out.println("Is Animal full? " + test.isFull());
			test.eat();
			System.out.println("Animal eats.");
		}
		System.out.println("Is Animal full? " + test.isFull());
		test.setFull(false);		
		System.out.println("Set full to " + test.isFull());
		System.out.println("Is Animal rested? " + test.isRested());
		test.setRested(false);
		System.out.println("Set rested to " + test.isRested());
		while (!test.isRested()) {
			test.sleep();
			System.out.println("Animal sleeps.");
		}
		System.out.println("Is Animal rested? " + test.isRested());
		System.out.println("Creating a new Animal Test 2 that has parameters");
		Animal test2 = new GoldFinch(55, new Location(4,9), 5.5);
		try {
			System.out.println("Setting Test2 to Sim ID to -5");
			test2.setSimID(-5);
		} catch (InvalidSimIDException e) {
			System.out.println("InvalidSimIDException is caught.");
		}
		
		/*********************************************
		 GoldFinch Tests
		*********************************************/
		System.out.println("***************\nGoldfinch Tests\n***************");

		System.out.println("Creating GoldFinch with an empty constructor");
		GoldFinch goldFinch = new GoldFinch();
		System.out.println("GoldFinch current wingspan: " + goldFinch.getWingSpan());
		goldFinch.setWingSpan(9.1);
		System.out.println("GoldFinch new wingspan: " + goldFinch.getWingSpan());
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("GoldFinch X: " + coords[0] + " Y: " + coords[1]);
		goldFinch.fly(new Location(9,6));
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("Fly the GoldFinch to X: " + coords[0] + " Y: " + coords[1]);
		goldFinch.walk(1);
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("Walk the GoldFinch in the direction of y: X: " + coords[0] + " Y: " + coords[1]);
		goldFinch.walk(2);
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("Walk the GoldFinch in the direction of x: X: " + coords[0] + " Y: " + coords[1]);
		System.out.println("creating goldFinch2 from parameter constructor");		
		try {
			System.out.println("Creating GoldFinch3 with wingspan 2.5");
			GoldFinch goldFinch3 = new GoldFinch(33, new Location(88,88), 2.5);
		} catch (InvalidWingspanException e) {
			System.out.println("InvalidWingspanException was caught");
		}


		/*********************************************
		 BrownBear Tests
		*********************************************/
		System.out.println("***************\nAnimal Tests\n***************");
		
		System.out.println("creating brownBear with empty constructor");
		BrownBear brownBear = new BrownBear();
		System.out.println("brownBear subspecies "+ brownBear.getSubSpecies());
		brownBear.setSubSpecies("Grizzly");
		System.out.println("set brownBear subspecies to "+ brownBear.getSubSpecies());
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear @ X: " + coords[0] + " Y: " + coords[1]);
		brownBear.walk(1);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("BrownBear walks towards y @ X: " + coords[0] + " Y: " + coords[1]);
		brownBear.walk(2);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("BrownBear walks in the direction of x at X: " + coords[0] + " Y: " + coords[1]);
		brownBear.swim(1);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear swims in the direction of y at X: " + coords[0] + " Y: " + coords[1]);
		brownBear.swim(2);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("BrownBear swims in the direction of  x at X: " + coords[0] + " Y: " + coords[1]);
		System.out.println("Creating a BrownBear 2 with parameters");
		BrownBear brownBear2 = new BrownBear(84, new Location(3,4), "Siberian");
		System.out.println("BrownBear 2 Subspecies " + brownBear2.getSubSpecies());
		try {
			System.out.println("Setting BrownBear 2 to Polar");
			brownBear2.setSubSpecies("Polar");
		} catch (InvalidSubspeciesException e) {
			System.out.println("InvalidSubspeciesException is caught");
		}
	}

	}


