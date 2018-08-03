/**
 * 
 */
package design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author vinay
 *
 */
public abstract class MenuComponent {
	
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();
	
	public String getName() {
		return this.name;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public abstract String toString();
	
	public abstract MenuComponent add(MenuComponent component);
	
	public abstract MenuComponent remove(MenuComponent component);
	
	String print(MenuComponent menucomponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(":").append(url).append("\n");
		return builder.toString();
	}

}
