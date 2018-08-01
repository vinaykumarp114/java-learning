/**
 * 
 */
package design_pattern.structural;

import design_pattern.structural.bridge.Formatter;
import design_pattern.structural.bridge.Movie;
import design_pattern.structural.bridge.MoviePrinter;
import design_pattern.structural.bridge.PrintFormatter;
import design_pattern.structural.bridge.Printer;
import design_pattern.structural.bridge.shape.Circle;
import design_pattern.structural.bridge.shape.Color;
import design_pattern.structural.bridge.shape.Green;
import design_pattern.structural.bridge.shape.Red;
import design_pattern.structural.bridge.shape.Shape;
import design_pattern.structural.bridge.shape.Square;

/**
 * @author vinay
 *
 */
public class BridgeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		shape();
		movie();
	}

	private static void shape() {
		Color red = new Red();
		Color green = new Green();
		
		Shape square = new Square(red);
		Shape circle = new Circle(green);
		
		square.applyColor();
		circle.applyColor();
	}
	
	private static void movie() {
		Movie movie = new Movie("1 hour", "Bridge Pattern", "Learning", 8.00);
		
		Formatter formatter = new PrintFormatter();
		Printer printer = new MoviePrinter(movie);
		System.out.println(printer.print(formatter));
	}
}
