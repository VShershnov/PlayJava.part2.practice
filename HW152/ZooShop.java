package part2.practice.HW152;

public class ZooShop {
	int count = 0;
	int sum = 0;
	String name;
	
	ZooShop (String name){
		this.name = name;
	}
	
	/**
	 * @param args
	 */
	 void add(Manager m){
		System.out.println("Магазин " + this.name + " найняв " + m.toString());
	}
	
	 void add(Enimal e){
		System.out.println("Магазин " + this.name + " отримав " + e.toString() + ", що коштує " + e.price);
		count++;
		sum+=e.price;
	}
	
	public static void main(String[] args) {
		ZooShop Z = new ZooShop ("Швидкий");
			
		Manager wrk = new Manager();
		Z.add(wrk);
		
		Enimal p1 = new Enimal ("Пінгвін", "Заб");
		Enimal p2 = new Enimal ("Пінгвін", "Джцді");
		p1.setPrice(100);
		p2.setPrice(200);
		Z.add(p1);
		Z.add(p2);
		
		Enimal c = new Enimal ("Кіт", "Рижик", 50);
		Z.add(c);
		Enimal d1 = new Enimal ("Собака");
		d1.setName("Барсік");
		d1.setPrice(70);
		Z.add(d1);
		
		Enimal d2 = new Enimal ("Собака", "Леді");
		d2.setPrice(800);
		Z.add(d2);
		
		System.out.println(Z.toString());
		
		wrk.feed(d2);
		wrk.feed(d1);
		wrk.feed(c);
		
		wrk.sell(p1, 200);
		wrk.sell(p2);
		
		wrk.cleanZooShop();
		
		
		
	}

	@Override
	public String toString() {
		return "ZooShop " + name + " має " + count + " тварин для продажу. Загальною вартістю " + sum;
	}

	public String getName() {
		return name;
	}

	
	public int getCount() {
		return count;
	}

}
