package part2.practice.P20;

public class CarShop {
	
	public Vehicle[] carsForSale;
	public int carQuantity = 0;
	
	CarShop (){
		carsForSale = new Vehicle[10];
	}
	
	public void addCar(Vehicle c){
		if (carQuantity < 10)
			carsForSale[carQuantity++] = c;
	}
	
	public String toString(){
		String res = new String();
		int counter = 1;
		if (carQuantity > 0)
			for (int i = 0; i < carQuantity; i++){
				res += (counter++) + " - " + carsForSale[i].getClass().getSimpleName() + "\n";
			}
		else 
			res = "No Car";
		return res;
	}

}

