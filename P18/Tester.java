package part2.practice.P18;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SportCar sc = new SportCar();
		System.out.println(sc.toString());
		
		sc.installWheels();
		sc.openDoors();
		sc.startEngine();
		System.out.println(sc.toString());
		
	}

}
