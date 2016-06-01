package part2.practice.P17shape;

public class Square extends Rectangle {
	int lenth;
	int hight = lenth;
	
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}
