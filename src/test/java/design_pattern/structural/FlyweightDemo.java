/**
 * 
 */
package design_pattern.structural;

import design_pattern.structural.flyweight.InventorySystem;

/**
 * @author vinay
 *
 */
public class FlyweightDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InventorySystem inventory = new InventorySystem();
		
		inventory.takeOrder("Item-1", 123);
		inventory.takeOrder("Item-2", 321);
		inventory.takeOrder("Item-3", 312);
		inventory.takeOrder("Item-3", 456);
		inventory.takeOrder("Item-1", 654);
		inventory.takeOrder("Item-2", 546);
		inventory.takeOrder("Item-2", 789);
		inventory.takeOrder("Item-3", 987);
		inventory.takeOrder("Item-1", 879);
		
		inventory.process();
		
		System.out.println(inventory.report());
	}

}
