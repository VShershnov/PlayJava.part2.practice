package part2.practice.HW152;

public class Manager {
	public String name = "Джек";
	
	void feed (Enimal e){
		if (e.isHungry())
		System.out.println(this.toString() + " погодував " + e.toString());
		else System.out.println(name + "?, " + e.toString() + " ще не голодний.");
	};
	
	void sell (Enimal e){
		System.out.println(this.toString() + " продав " + e.toString() + "за ціною " + e.getPrice());
	}

	void sell (Enimal e, int sum){
		System.out.println(this.toString() + " продав " + e.toString() + "за ціною " + sum);
	}
	
	void cleanZooShop(){
		System.out.println(name + " прибрав у магазині.");
	}
	
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Менеджер на імя " + name;
	}
	
	

}
