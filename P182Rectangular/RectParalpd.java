package part2.practice.P182Rectangular;

import java.util.Random;

public class RectParalpd {
	private int high;
	private int length;
	private int wide;
	
	RectParalpd(){
		Random rnd = new Random();
		high = rnd.nextInt(200);
		length = rnd.nextInt(200);
		wide = rnd.nextInt(200);
	}
	
	private void emptyDataMsg(int l, int w, int h){
		String s = "Сторони паралепіпеда не можуть бути 0 або відємними. Додайте корректно ";
		
		if (l<=0)
			s += "довжину основи ";
		if (w<=0) 
			s += "ширину основи ";
		if (h<=0)
			s += "висоту";
		
		System.out.println(s);
		
	}
	
	RectParalpd(int l, int w){
		if (l*w>0){
			high = 0; 		length = l; 	wide = w;
			System.out.println("Створено прямокутник: length = " + length + ", wide = " + wide);
			System.out.println("Щоб отрімати паралепіпед, додайте висоту");
		}
		else 
			emptyDataMsg(l, w, 1);
	}
	
	RectParalpd(int l, int w, int h){
		high = h; 		length = l; 	wide = w;
		if (high*wide*length<=0) 
			emptyDataMsg(l, w, h);
	}
	
	public int surface (int i){ // 1 - h+w; 2 - h+l; 3 - l+w
		if (high*wide*length>0){
			switch (i) {
		    case 1: 
			    return high*wide;
			case 2: 
				return high*length;
			case 3:		    
			default: 
				return length*wide;
			}
		}
		else { 
			
			emptyDataMsg(length, wide, high);
			return 0;
		}
	}
	
	public int fullSurface(){
		if (high*wide*length>0)
			return 2*(surface(1) + surface(2) + surface(3));
		else { 
			emptyDataMsg(length, wide, high);
			return 0;
		}
	}
	
	public int volume(){
		if (high*wide*length>0)
			return high*wide*length;
		else { 
			emptyDataMsg(length, wide, high);
			return 0;
		}
	}
	

	@Override
	public String toString() {
		return "RectParalpd [high=" + high + ", length=" + length + ", wide="
				+ wide + "]";
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}
	
	
	
	

}
