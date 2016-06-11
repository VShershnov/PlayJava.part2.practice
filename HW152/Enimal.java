package part2.practice.HW152;

import java.util.Random;

public class Enimal {
	public String type;
	public String name;
	public int price;
	
	Enimal () {}
	
	Enimal (String type){
		this.type = type;
	}
	
	Enimal (String type, String name){
		this.type = type;
		this.name = name;		
	}
	
	Enimal (String type, String name, int price){
		this.type = type;
		this.name = name;		
		this.price = price;
	}
	
	public boolean isHungry(){
		Random rnd = new Random();
		return  rnd.nextBoolean();
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}
	
			
	
}
