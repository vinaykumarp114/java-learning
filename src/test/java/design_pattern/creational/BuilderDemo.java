/**
 * 
 */
package design_pattern.creational;

import design_pattern.creational.LunchOrderBuilder.Builder;

/**
 * @author vinay
 *
 */
public class BuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder builder = new LunchOrderBuilder.Builder();
		builder.bread("Honey Wheat").dressing("Mayo").condiments("Lettuce");
		
		LunchOrderBuilder lc = builder.build();
		System.out.println(lc.getBread());
		System.out.println(lc.getCondiments());
		System.out.println(lc.getDressing());
		System.out.println(lc.getMeat());
	}

}
