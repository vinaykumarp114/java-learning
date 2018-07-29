/**
 * 
 */
package design_pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vinay
 *
 */
public class Registry {

	Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) items.get(type).clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

	private void loadItems() {
		Book book = new Book();
		book.setNumberOfPages(20);
		book.setPrice(6.00);
		book.setTitle("Prototype Pattern");
		items.put("Book", book);

		Movie movie = new Movie();
		movie.setRuntime("30 minutes");
		movie.setPrice(5.00);
		movie.setTitle("Short Film");
		items.put("Movie", movie);
	}
}
