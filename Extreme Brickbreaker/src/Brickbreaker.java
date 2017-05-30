/*
 * This code is protected under the Gnu General Public License (Copyleft), 2005 by
 * IBM and the Computer Science Teachers of America organization. It may be freely
 * modified and redistributed under educational fair use.
 */

public class Brickbreaker extends Game {
	private Ball b;
	private Paddle p;
	
	/**
	 * Fill in this method with code that tells the game what to do
	 * before actual play begins
	 */
	public void setup() {
		b = new Ball(getFieldWidth()/2, getFieldHeight() - 15, 0, 30);
		add(b);
		p = new Paddle(getFieldWidth()/2 - 20, getFieldHeight() - 10, 50, 10);
		add(p);
		
	}
	
	/**
	 * Fill in this method with code that tells the playing field what to do
	 * from one moment to the next
	 */
	public void act() {
		if (ZKeyPressed()){
			p.moveLeft();
		}
		if (XKeyPressed()){
			p.moveRight();
		}
	}
	
	// Add any additional methods here
	
	
	/**
	 * This code has been provided for you, and should not be modified
	 */
	public static void main(String[] args) {
		Brickbreaker b = new Brickbreaker();
		b.setVisible(true);
		b.initComponents();	
	}
}