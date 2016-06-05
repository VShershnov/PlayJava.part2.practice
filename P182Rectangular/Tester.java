package part2.practice.P182Rectangular;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RectParalpd rp = new RectParalpd();
		System.out.println(rp.toString());
		System.out.println("Площа бічної грані w " + rp.surface(1) + "; " 
				+ "площа бічної грані l " + rp.surface(2) 
				+ "; " + "площа грані основи " + rp.surface(3));
		System.out.println("Загальна площа поверхні " + rp.fullSurface() + "; Обєм " + rp.volume());
		
		RectParalpd rp2 = new RectParalpd(2, 4, 8);
		System.out.println(rp2.toString());
		System.out.println("Загальна площа поверхні " + rp2.fullSurface() + "; Обєм " + rp2.volume());
		
		RectParalpd rp3 = new RectParalpd(2, 4);
		System.out.println(rp3.toString());
		System.out.println("Площа бічної грані w " + rp3.surface(1) + "; " 
				+ "площа бічної грані l " + rp3.surface(2) 
				+ "; " + "площа грані основи " + rp3.surface(3));
		System.out.println("Загальна площа поверхні " + rp3.fullSurface() + "; Обєм " + rp3.volume());
		
		rp3.setHigh(10);
		System.out.println(rp3.toString());
		System.out.println("Площа бічної грані w " + rp3.surface(1) + "; " 
				+ "площа бічної грані l " + rp3.surface(2) 
				+ "; " + "площа грані основи " + rp3.surface(3));
		System.out.println("Загальна площа поверхні " + rp3.fullSurface() + "; Обєм " + rp3.volume());
		
		
	}

}
