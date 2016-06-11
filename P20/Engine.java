package part2.practice.P20;

public class Engine {

	boolean eIsPowerUp = false;
	
	public void powerUp(){
		eIsPowerUp = true;
	}
	
	public void powerDown(){
		eIsPowerUp = false;
	}

	@Override
	public String toString() {
		if (eIsPowerUp)
			return ("Двигун заведено");
		else 
			return ("Двигун вимкнено");
	}
	
}
