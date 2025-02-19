package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		StdDraw.setPenColor(red, green, blue);
		
		if (shapeType.equals("rectangle")) {
			double parameter1 = in.nextDouble();
			double parameter2 = in.nextDouble();
			double parameter3 = in.nextDouble();
			double parameter4 = in.nextDouble();
			if (isFilled) {
				StdDraw.filledRectangle(parameter1, parameter2, parameter3, parameter4);
			} else if (!isFilled) {
				StdDraw.rectangle(parameter1, parameter2, parameter3, parameter4);
			}
		} else if (shapeType.equals("ellipse")) {
			double parameter1 = in.nextDouble();
			double parameter2 = in.nextDouble();
			double parameter3 = in.nextDouble();
			double parameter4 = in.nextDouble();
			if (isFilled) {
				StdDraw.filledEllipse(parameter1, parameter2, parameter3, parameter4);
			} else if (!isFilled) {
				StdDraw.ellipse(parameter1, parameter2, parameter3, parameter4);
			}
		} else if (shapeType.equals("triangle")) {
			double parameter1 = in.nextDouble();
			double parameter2 = in.nextDouble();
			double parameter3 = in.nextDouble();
			double parameter4 = in.nextDouble();
			double parameter5 = in.nextDouble();
			double parameter6 = in.nextDouble();

			double[] x = {parameter1, parameter3, parameter5};
			double[] y = {parameter2, parameter4, parameter6};
			if (isFilled) {
				StdDraw.filledPolygon(x, y);
			} else if (!isFilled) {
				StdDraw.polygon(x, y);
			}
		}
		
	}
}
