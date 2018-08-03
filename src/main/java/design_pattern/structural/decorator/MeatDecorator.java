/**
 * 
 */
package design_pattern.structural.decorator;

/**
 * @author vinay
 *
 */
public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return sandwich.make() + addMeat();
	}

	private String addMeat() {
		return "+ Ham";
	}

}
