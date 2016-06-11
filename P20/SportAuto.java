package part2.practice.P20;

public class SportAuto extends Auto {

	SportAuto () {
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
		String res = this.getClass().getSimpleName() + ": ";
		res += super.toString();
		return res;
	}

	@Override
	public void wash() {
		System.out.println(this.getClass().getSimpleName() +" was washed");
		
	}
	
}
