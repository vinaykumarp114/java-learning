/**
 * 
 */
package design_pattern.structural.bridge.shape;

/**
 * @author vinay
 *
 */
public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}

	public abstract void applyColor();
}
