/**
 * 
 */
package design_pattern.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author vinay
 *
 */
public class InventorySystem {

	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<>();

	public void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	public void process() {
		orders.stream().forEach(a -> {
			a.processOrder();
			orders.remove(a);
		});
	}

	public String report() {
		return "\n Total Item Objects moade: " + catalog.totalItemMade();
	}
}
