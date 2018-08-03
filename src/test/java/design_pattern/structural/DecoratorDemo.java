/**
 * 
 */
package design_pattern.structural;

import design_pattern.structural.decorator.DressingDecorator;
import design_pattern.structural.decorator.MeatDecorator;
import design_pattern.structural.decorator.Sandwich;
import design_pattern.structural.decorator.SimpleSandwich;

/**
 * @author vinay
 *
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}

}
