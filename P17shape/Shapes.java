package part2.practice.P17shape;

public class Shapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomShapeGenerator rsh = new RandomShapeGenerator();
		Shape[] shapes = new Shape[5];
		for (int i = 0; i < 5; i++)
			shapes[i] = rsh.next();

		for (Shape s : shapes)
			s.draw();
		for (Shape s : shapes)
			s.erase();
	}

}
