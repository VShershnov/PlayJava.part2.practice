package part2.practice.P20;

public class CarWash {
	public Washable[] carsToWash;
	public int carQuantity = 0;
	
	CarWash (){
		carsToWash = new Washable[10];
	}
	
	public void addCar(Washable c){
		if (carQuantity < 10)
			carsToWash[carQuantity++] = c;
	}
	
	public void washAll(){
		if (carQuantity > 0)
			for (int i = 0; i < carQuantity; i++){
				carsToWash[i].wash();
			}
	}
	
	
	public String toString(){
		String res = new String();
		int counter = 1;
		if (carQuantity > 0)
			for (int i = 0; i < carQuantity; i++){
				res += (counter++) + " - " + carsToWash[i].getClass().getSimpleName() + "\n";
			}
		else 
			res = "No Car";
		return res;
	}
}
