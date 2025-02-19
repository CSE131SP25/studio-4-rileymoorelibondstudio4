package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//Green, purple, yellow, red
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, (5.0/6.0), 0.5, (1.0/6.0));
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5, (3.0/6.0), 0.5, (1.0/6.0));
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, (1.0/6.0), 0.5, (1.0/6.0));
		
		StdDraw.setPenColor(Color.YELLOW);
		double[] x = {0.5, 0.56, 0.65, 0.58, 0.62, 0.5, 0.38, 0.42, 0.35, 0.44};
		double[] y = {0.65, 0.56, 0.56, 0.50, 0.42, 0.47, 0.42, 0.50, 0.56, 0.56};
		
		StdDraw.filledPolygon(x, y);
		
		for (int i = 0; i < y.length; i++) {
			y[i] *= 0.2;
		}
		for (int i = 0; i < x.length; i++) {
			x[i] *= 0.2;
		}
		
		StdDraw.filledPolygon(x, y);
	}
}