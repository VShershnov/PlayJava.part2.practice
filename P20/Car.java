package part2.practice.P20;

public abstract class Car implements Vehicle, Washable {
	
	Engine mEngine;
	
	Door [] mDoors;
	
	Wheel [] mWheels;
	
	public abstract void startEngine ();	
	public abstract void openDoors ();
	public abstract void installWheels ();
	

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
