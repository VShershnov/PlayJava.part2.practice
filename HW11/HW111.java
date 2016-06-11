package part2.practice.HW11;

import java.awt.event.MouseEvent;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/**
 * Гра Хрестики-Нолики 3*3
 * 
 * @author Vitaly
 *
 */
public class HW111 extends GraphicsProgram {
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private GPoint point;
	private GImage gobj;
	GImage image1Y = imageY1();
	GImage image2Y = imageY2();
	GImage image3Y = imageY3();
	GImage image4Y = imageY4();
	GImage image5Y = imageY5();
	GImage image6Y = imageY6();
	GImage image7Y = imageY7();
	GImage image8Y = imageY8();
	GImage image9Y = imageY9();

	GImage image1X = imageX1();
	GImage image2X = imageX2();
	GImage image3X = imageX3();
	GImage image4X = imageX4();
	GImage image5X = imageX5();
	GImage image6X = imageX6();
	GImage image7X = imageX7();
	GImage image8X = imageX8();
	GImage image9X = imageX9();
	double massifW[][] = new double[3][3];
	double massifH[][] = new double[3][3];
	private RandomGenerator rand = RandomGenerator.getInstance();

	// int ran = rand.nextInt(1,9);

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		GLine lineFirstGoriz = new GLine(0, HEIGHT / 3, WIDTH, HEIGHT / 3);
		add(lineFirstGoriz);
		GLine lineSecondGoriz = new GLine(0, HEIGHT / 1.5, WIDTH, HEIGHT / 1.5);
		add(lineSecondGoriz);
		GLine lineFirstVertic = new GLine(WIDTH / 3, 0, WIDTH / 3, HEIGHT);
		add(lineFirstVertic);
		GLine lineSecondVertic = new GLine(WIDTH / 1.5, 0, WIDTH / 1.5, HEIGHT);
		add(lineSecondVertic);

		addMouseListeners();
		int i;
		double H = 0;
		double stepH = 0;
		for (int a = 0; a < 3; a++) {
			double stepW = 0;
			double W = 0;
			for (i = 0; i < 3; i++) {
				massifW[a][i] = W;
				massifH[a][i] = H;
				stepW += 1.5;
				W = WIDTH / stepW;
			}
			stepH += 1.5;
			H = HEIGHT / stepH;
		}
	}

	double w;
	double h;

	public void mouseMoved(MouseEvent e) {
		w = e.getX();
		h = e.getY();
	}

	int x1 = 0;
	int x2 = 0;
	int x3 = 0;
	int x4 = 0;
	int x5 = 0;
	int x6 = 0;
	int x7 = 0;
	int x8 = 0;
	int x9 = 0;

	public void mousePressed(MouseEvent e) {
		
		System.out.print(ran + ";");

		if (w < WIDTH / 3 && w > 0 && h > 0 && h < HEIGHT / 3) {
			add(image1X, massifW[0][0], massifH[0][0]);
			x1++;
		}
		if (w < WIDTH / 1.5 && w > WIDTH / 3 && h > 0 && h < HEIGHT / 3) {
			add(image2X, massifW[0][2], massifH[0][2]);
			x2++;
		}
		if (w < WIDTH && w > WIDTH / 1.5 && h > 0 && h < HEIGHT / 3) {
			add(image3X, massifW[0][1], massifH[0][1]);
			x3++;
		}
		if (w < WIDTH / 3 && w > 0 && h > HEIGHT / 3 && h < HEIGHT / 1.5) {
			add(image7X, massifW[2][0], massifH[2][0]);
			x4++;
		}
		if (w < WIDTH / 1.5 && w > WIDTH / 3 && h > HEIGHT / 3
				&& h < HEIGHT / 1.5) {
			add(image8X, massifW[2][2], massifH[2][2]);
			x5++;
		}
		if (w < WIDTH && w > WIDTH / 1.5 && h > HEIGHT / 3 && h < HEIGHT / 1.5) {
			add(image9X, massifW[2][1], massifH[2][1]);
			x6++;
		}
		if (w < WIDTH / 3 && w > 0 && h > HEIGHT / 1.5 && h < HEIGHT) {
			add(image4X, massifW[1][0], massifH[1][0]);
			x7++;
		}
		if (w < WIDTH / 1.5 && w > WIDTH / 3 && h > HEIGHT / 1.5 && h < HEIGHT) {
			add(image5X, massifW[1][2], massifH[1][2]);
			x8++;
		}
		if (w < WIDTH && w > WIDTH / 1.5 && h > HEIGHT / 1.5 && h < HEIGHT) {
			add(image6X, massifW[1][1], massifH[1][1]);
			x9++;
		}

		while (true) {
			ran = rand.nextInt(1, 9);
			System.out.print(ran + ",");
			if (ran == 1 & (ran * x1) == 0) {
				break;
			}
			if (ran == 2 & (ran * x2) == 0) {
				break;
			}
			if (ran == 3 & (ran * x3) == 0) {
				break;
			}
			if (ran == 4 & (ran * x4) == 0) {
				break;
			}
			if (ran == 5 & (ran * x5) == 0) {
				break;
			}
			if (ran == 6 & (ran * x6) == 0) {
				break;
			}
			if (ran == 7 & (ran * x7) == 0) {
				break;
			}
			if (ran == 8 & (ran * x8) == 0) {
				break;
			}
			if (ran == 9 & (ran * x9) == 0) {
				break;
			}
			if (x1 != 0 & x2 != 0 & x3 != 0 & x4 != 0 & x5 != 0 & x6 != 0 & x7 != 0
					& x8 != 0 & x9 != 0) {
				GLabel label = new GLabel("Game Over");
				label.setFont("Times New Roman-36");
				add(label, WIDTH / 3, HEIGHT / 2);
				break;
			}

		}
		if (ran == 1 & x1 == 0) {
			add(image1Y, massifW[0][0], massifH[0][0]);
			x1++;
		}
		if (ran == 2 & x2 == 0) {
			add(image2Y, massifW[0][2], massifH[0][2]);
			x2++;
		}
		if (ran == 3 & x3 == 0) {
			add(image3Y, massifW[0][1], massifH[0][1]);
			x3++;
		}
		if (ran == 4 & x4 == 0) {
			add(image4Y, massifW[2][0], massifH[2][0]);
			x4++;
		}
		if (ran == 5 & x5 == 0) {
			add(image5Y, massifW[2][2], massifH[2][2]);
			x5++;
		}
		if (ran == 6 & x6 == 0) {
			add(image6Y, massifW[2][1], massifH[2][1]);
			x6++;
		}
		if (ran == 7 & x7 == 0) {
			add(image7Y, massifW[1][0], massifH[1][0]);
			x7++;
		}
		if (ran == 8 & x8 == 0) {
			add(image8Y, massifW[1][2], massifH[1][2]);
			x8++;
		}
		if (ran == 9 & x9 == 0) {
			add(image9Y, massifW[1][1], massifH[1][1]);
			x9++;
		}
		if (x1 != 0 & x2 != 0 & x3 != 0 & x4 != 0 & x5 != 0 & x6 != 0 & x7 != 0
				& x8 != 0 & x9 != 0) {
			GLabel label = new GLabel("Game Over");
			label.setFont("Times New Roman-36");
			add(label, WIDTH / 3, HEIGHT / 2);

		}
	}

	int ran;

	private GImage imageY1() {
		GImage imageY1 = new GImage("0.gif");
		imageY1.scale(0.79, 0.835);
		return imageY1;
	}

	private GImage imageY2() {
		GImage imageY2 = new GImage("0.gif");
		imageY2.scale(0.79, 0.835);
		return imageY2;
	}

	private GImage imageY3() {
		GImage imageY3 = new GImage("0.gif");
		imageY3.scale(0.79, 0.835);
		return imageY3;
	}

	private GImage imageY4() {
		GImage imageY4 = new GImage("0.gif");
		imageY4.scale(0.79, 0.835);
		return imageY4;
	}

	private GImage imageY5() {
		GImage imageY5 = new GImage("0.gif");
		imageY5.scale(0.79, 0.835);
		return imageY5;
	}

	private GImage imageY6() {
		GImage imageY6 = new GImage("0.gif");
		imageY6.scale(0.79, 0.835);
		return imageY6;
	}

	private GImage imageY7() {
		GImage imageY7 = new GImage("0.gif");
		imageY7.scale(0.79, 0.835);
		return imageY7;
	}

	private GImage imageY8() {
		GImage imageY8 = new GImage("0.gif");
		imageY8.scale(0.79, 0.835);
		return imageY8;
	}

	private GImage imageY9() {
		GImage imageY9 = new GImage("0.gif");
		imageY9.scale(0.79, 0.835);
		return imageY9;
	}

	private GImage imageX1() {
		GImage imageX1 = new GImage("X.gif");
		imageX1.scale(0.79, 0.835);
		return imageX1;
	}

	private GImage imageX2() {
		GImage imageX2 = new GImage("X.gif");
		imageX2.scale(0.79, 0.835);
		return imageX2;
	}

	private GImage imageX3() {
		GImage imageX3 = new GImage("X.gif");
		imageX3.scale(0.79, 0.835);
		return imageX3;
	}

	private GImage imageX4() {
		GImage imageX4 = new GImage("X.gif");
		imageX4.scale(0.79, 0.835);
		return imageX4;
	}

	private GImage imageX5() {
		GImage imageX5 = new GImage("X.gif");
		imageX5.scale(0.79, 0.835);
		return imageX5;
	}

	private GImage imageX6() {
		GImage imageX6 = new GImage("X.gif");
		imageX6.scale(0.79, 0.835);
		return imageX6;
	}

	private GImage imageX7() {
		GImage imageX7 = new GImage("X.gif");
		imageX7.scale(0.79, 0.835);
		return imageX7;
	}

	private GImage imageX8() {
		GImage imageX8 = new GImage("X.gif");
		imageX8.scale(0.79, 0.835);
		return imageX8;
	}

	private GImage imageX9() {
		GImage imageX9 = new GImage("X.gif");
		imageX9.scale(0.79, 0.835);
		return imageX9;
	}

	/*private GImage image() {
		GImage image[] = new GImage[8];
		GImage image1;
		int i;
		for (i = 0; i < 9; i++) {
			image1 = new GImage("X.gif");
			image1.scale(0.79, 0.835);
			image[i] = image1;
		}
		return image[i];

	}*/
	
	GImage[][] imsgr = new GImage[3][3];

}
