/**
 * 
 */
package design_pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vinay
 *
 */
public class Catalog {
	private Map<String, Item> items = new HashMap<>();
	
	// factory method
	public Item lookup(String itemName) {
		if(!items.containsKey(itemName)) {
			items.put(itemName, new Item(itemName));
		}
		return items.get(itemName);
	}
	
	public int totalItemMade() {
		return items.size();
	}
}
