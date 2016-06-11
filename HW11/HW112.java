package part2.practice.HW11;

import acm.program.*; 
import acm.graphics.*; 
import java.awt.*; 
import java.awt.event.*;

public class HW112 extends GraphicsProgram {

	private static final int WIDTH_SCREEN = 600;
	private static final int HEIGHT_SCREEN = 400;
	private static final int AIRCRAFT_WIDTH = 40;
	private static final int AIRCRAFT_HEIGHT = AIRCRAFT_WIDTH / 2;
	private static final int AIRCRAFT_SPEED = 10;
	private static final int BALL_DIAM = 5;
	private static final int BALL_SPEED = 20;
	private static final int DELAY = 50;
	private static final int ENEMY_WIDTH=100;
	private static final int ENEMY_HEIGHT=20;
	private GRect aircraft;
	private GRect enemy;
	private boolean moveLeft = true;
	private GOval ball;

	public void run() {
		setup();
		while (!gameOver()) {
			moveAircraft();
			moveBall();
			collise();
			pause(DELAY);
		}

	}

	
	private void collise() {
		colliseWithEnemy();
		colliseWithBall();
	}


	private void colliseWithEnemy() {
		if(ball!=null){
			GObject coll = getElementAt(ball.getX(), ball.getY());
			if(coll==enemy){
				remove(enemy);
				remove(ball);
				enemy=null;
				ball=null;
				
			}
		}
	}


	private void colliseWithBall() {
		if(ball!=null){
			if(ball.getY()>=HEIGHT_SCREEN){
				remove(ball);
				ball=null;
			}
		}
	}


	private boolean gameOver() {
		return (aircraft == null)
				|| (aircraft.getY() >= getHeight() - AIRCRAFT_HEIGHT)||(enemy==null);
	}
	

	public void mouseClicked(MouseEvent e) {
		if(ball==null){
			ball=new GOval(BALL_DIAM, BALL_DIAM);
			ball.setFillColor(Color.RED);
			ball.setFilled(true);
			add(ball,aircraft.getX()+AIRCRAFT_WIDTH/2,aircraft.getY()+AIRCRAFT_HEIGHT);
			
		}
	}

	private void moveAircraft() {
		if (moveLeft) {
			aircraft.move(-AIRCRAFT_SPEED, 0);
			if (aircraft.getX() <= 0) {
				moveLeft = false;
				aircraft.move(0, AIRCRAFT_HEIGHT);
			}
		} else {
			aircraft.move(AIRCRAFT_SPEED, 0);
			if (aircraft.getX() >= WIDTH_SCREEN - AIRCRAFT_WIDTH) {
				moveLeft = true;
				aircraft.move(0, AIRCRAFT_HEIGHT);
			}
		}
	}

	

	private void setup() {
		this.setSize(WIDTH_SCREEN, HEIGHT_SCREEN);
		aircraft = new GRect(AIRCRAFT_WIDTH, AIRCRAFT_HEIGHT);
		aircraft.setFillColor(Color.BLUE);
		aircraft.setFilled(true);
		add(aircraft, WIDTH_SCREEN, 0);
		enemy = new GRect(ENEMY_WIDTH, ENEMY_HEIGHT);
		enemy.setFilled(true);
		enemy.setColor(Color.RED);
		enemy.setFillColor(Color.BLACK);
		add(enemy,(WIDTH_SCREEN/2-ENEMY_WIDTH),HEIGHT_SCREEN-ENEMY_HEIGHT);
		addMouseListeners();

	}
	
	private void moveBall() {
		if(ball!=null){
			ball.move(0, BALL_SPEED);
		}
	}

}
