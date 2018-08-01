/**
 * 
 */
package design_pattern.structural.bridge.shape;

/**
 * @author vinay
 *
 */
public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}
