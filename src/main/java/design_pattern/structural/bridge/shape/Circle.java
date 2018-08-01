/**
 * 
 */
package design_pattern.structural.bridge.shape;

/**
 * @author vinay
 *
 */
public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}
}
