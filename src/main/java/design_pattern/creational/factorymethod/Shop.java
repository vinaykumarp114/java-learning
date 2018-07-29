/**
 * 
 */
package design_pattern.creational.factorymethod;

/**
 * @author vinay
 *
 */
public class Shop extends Website {

	/* (non-Javadoc)
	 * @see design_pattern.creational.factory.Website#createWebSite()
	 */
	@Override
	public void createWebSite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
	}

}
