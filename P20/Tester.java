package part2.practice.P20;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car sc = new SportCar();
		System.out.println(sc.toString());
		
		sc.installWheels();
		sc.openDoors();
		sc.startEngine();
		System.out.println(sc.toString());
		
		SportAuto sa = new SportAuto();
		System.out.println(sa.toString());
		
		
		
		CarShop myShop = new CarShop();
		System.out.println(myShop.toString());
		
		myShop.addCar(sc);
		myShop.addCar(sc);
		myShop.addCar(sa);
		System.out.println(myShop.toString());
		
		Vehicle v = new SportAuto();
		System.out.println(v.toString());
		
		
		CarWash myCarWash = new CarWash();
		System.out.println(myCarWash.toString());
		
		myCarWash.addCar(sc);
		myCarWash.addCar(sc);
		myCarWash.addCar(sa);
		System.out.println(myCarWash.toString());
		
		myCarWash.washAll();
		
		
	}

}
