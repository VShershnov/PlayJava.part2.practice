package part2.practice.P18;

public class Wheel {
	boolean wIsInstalled = false;
	
	public void open(){
		wIsInstalled = true;
	}
	
	public void close(){
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
