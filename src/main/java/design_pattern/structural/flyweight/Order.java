/**
 * 
 */
package design_pattern.structural.flyweight;

/**
 * @author vinay
 *
 */
public class Order {
	private final Item item;
	private final int orderNumber;

	public Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}

	void processOrder() {
		System.out.println("Ordering "+ item + " for order number "+orderNumber);
	}
}