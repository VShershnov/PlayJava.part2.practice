package part2.practice.P18;

public class Car {
	
	Engine mEngine;
	
	Door [] mDoors;
	
	Wheel [] mWheels;
	
	public void startEngine (){}	
	public void openDoors (){}
	public void installWheels (){}
	

	@Override
	public String toString() {
		String res = new String();
		res += mEngine.toString() + "; ";
		
		for (Door d: mDoors)
			res += d.toString() + ", ";
		res += "; ";
		
		for (Wheel w: mWheels)
			res += w.toString() + ", ";
		res += ". ";
		
		return res;
		
	}
	
	
}
