package part2.practice.P18;

public class Wheel {
	boolean wIsInstalled = false;
	
	public void install(){
		wIsInstalled = true;
	}
	
	public void deInstall(){
		wIsInstalled = false;
	}

	@Override
	public String toString() {
		if (wIsInstalled)
			return ("Колесо встановлено");
		else 
			return ("Колесо знято");
	}
}
