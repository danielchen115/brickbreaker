import java.awt.*;

/*
 * This code is protected under the Gnu General Public License (Copyleft), 2005 by
 * IBM and the Computer Science Teachers of America organization. It may be freely
 * modified and redistributed under educational fair use.
 */


public class Ball extends GameObject {

	private final int BALL_RADIUS = 2;
	//co-ordinates of ball
	private int x,y;
	private double speedx, speedy;

	public Ball(int x, int y, int speed, double angle){
		this.x = x;
		this.y = y;
		speedx = (double)(speed * Math.cos(Math.toRadians(angle)));
		speedy = (double)(-speed * Math.sin(Math.toRadians(angle)));
		setColor(Color.WHITE);
		setSize(5,5);
	}

	/**
	 * Fill in this method with code that describes the behavior
	 * of a ball from one moment to the next 
	 */
	public void act() {
		setX((int)(x+=speedx + 0.5));
		setY((int)(y+=speedy + 0.5));
	}
	// Add any additional methods here
}
