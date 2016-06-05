package part2.practice.P182Rectangular;

import java.util.Random;

public class RectParalpd {
	int high;
	int length;
	int wide;
	
	RectParalpd(){
		Random rnd = new Random();
		high = rnd.nextInt(200);
		length = rnd.nextInt(200);
		wide = rnd.nextInt(200);
	}
	
	RectParalpd(int l, int w){
		high = 0; 		length = l; 	wide = w;
		System.out.println("Створено прямокутник: length = " + length + ", wide = " + wide);
	}
	
	RectParalpd(int l, int w, int h){
		high = h; 		length = l; 	wide = w;
	}
	
	
	

	@Override
	public String toString() {
		return "RectParalpd [high=" + high + ", length=" + length + ", wide="
				+ wide + "]";
	}
	
	
	
	

}
