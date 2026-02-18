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
		String shape = in.next();
		int int1 = in.nextInt();
		int int2 = in.nextInt();
		int int3 = in.nextInt();
		boolean spaceHolder = in.nextBoolean();
		double double1 = in.nextDouble();
		double double2 = in.nextDouble();
		double double3 = in.nextDouble();
		double double4 = in.nextDouble();
		if (shape.equals("rectangle")) {
			StdDraw.rectangle(double1, double2, double3, double4);
		} else if (shape.equals("triangle")) {
			double double5 = in.nextDouble();
			double double6 = in.nextDouble();
			double[] x = {double1, double3, double5};
			double[] y = {double2, double4, double6};
			StdDraw.setPenColor(int1, int2, int3);
			StdDraw.filledPolygon(x, y);
		} else {
			StdDraw.ellipse(double1, double2, double3, double4);
		}
	}
}
