/**
 * 
 */
package design_pattern.structural.composite;

/**
 * @author vinay
 *
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return print(this);
	}

	@Override
	public MenuComponent add(MenuComponent component) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	@Override
	public MenuComponent remove(MenuComponent component) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
}
