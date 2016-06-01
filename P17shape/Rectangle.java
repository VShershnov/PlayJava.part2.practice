package part2.practice.P17shape;

public class Rectangle extends Shape {
	int lenth;
	int hight;
	
	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Rectangle.erase()");
	}
	
}
