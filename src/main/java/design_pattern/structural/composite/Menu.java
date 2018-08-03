/**
 * 
 */
package design_pattern.structural.composite;

import java.util.Iterator;

/**
 * @author vinay
 *
 */
public class Menu extends MenuComponent {
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public MenuComponent add(MenuComponent component) {
		menuComponents.add(component);
		return component;
	}
	
	@Override
	public MenuComponent remove(MenuComponent component) {
		menuComponents.remove(component);
		return component;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(print(this));
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent c = iterator.next();
			builder.append(c.toString());
		}
		return builder.toString();
	}

}
