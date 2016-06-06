package part2.practice.P20;

public class SportCar extends Car {
	
	SportCar () {
		mEngine = new Engine ();
		
		mDoors = new Door[2];
		for (int i=0; i < 2; i++)
			mDoors[i] = new Door();
		
		mWheels = new Wheel[4];
		for (int i=0; i < 4; i++)
			mWheels[i] = new Wheel();
		
	}

	@Override
	public void startEngine (){
		if (!mEngine.eIsPowerUp)
			mEngine.powerUp();
	}
	
	@Override
	public void openDoors (){
		for (Door d:mDoors)
			if (!d.dIsOpened)
				d.open();
	}
	
	@Override
	public void installWheels (){
		for (Wheel w:mWheels)
			if (!w.wIsInstalled)
				w.install();
	}

	@Override
	public String toString() {
		String res = "SportCar: ";
		res += super.toString();
		return res;
	}
	
	
}
