/**
 * 
 */
package design_pattern.structural.decorator;

/**
 * @author vinay
 *
 */
public abstract class SandwichDecorator implements Sandwich {
	
	protected Sandwich sandwich;

	public SandwichDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	public String make() {
		return sandwich.make();
	}
}
