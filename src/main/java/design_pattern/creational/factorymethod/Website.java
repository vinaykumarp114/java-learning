/**
 * 
 */
package design_pattern.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vinay
 *
 */
public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebSite();
	}
	
	public abstract void createWebSite();

	/**
	 * @return the pages
	 */
	public List<Page> getPages() {
		return pages;
	}
}
