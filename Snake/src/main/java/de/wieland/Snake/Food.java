package de.wieland.Snake;

import static de.wieland.Snake.SnakeMain.HEIGHT;
import static de.wieland.Snake.SnakeMain.WIDTH;

import java.util.Random;

import javafx.scene.paint.Color;

/**
 * Public class Food.
 * 
 * @author Moritz Wieland
 * @version 1.0
 * @date 12.09.2021
 */
public class Food {
	private static Random random = new Random();
	
	private int x;
	private int y;
	private Color color;
	
	public Food() {
		this.x = randomValue(WIDTH);
		this.y = randomValue(HEIGHT);
		this.color = randomColor();
	}

	/**
	 * Private int randomValue creates a randomValue between 0 and the given bound.
	 * 
	 * @param bound given bound
	 * @return random value between 0 and bound
	 */
	private int randomValue(int bound) {
		return random.nextInt(bound);
	}
	
	/**
	 * Private Color randomColor creates a random color.
	 * 
	 * @return random created color
	 */
	private Color randomColor() {
		float r = random.nextFloat();
		float g = random.nextFloat();
		float b = random.nextFloat();
		return new Color(r, g, b, 1);
	}

	/**
	 * Getter methods.
	 */
	public int getX() { return x; }
	public int getY() { return y; }
	public Color getColor() { return color; }
}
