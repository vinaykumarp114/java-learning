/**
 * 
 */
package design_pattern.creational.factorymethod;

/**
 * @author vinay
 *
 */
public class Blog extends Website {

	/* (non-Javadoc)
	 * @see design_pattern.creational.factory.Website#createWebSite()
	 */
	@Override
	public void createWebSite() {
		pages.add(new PostPage());
		pages.add(new CommonPage());
		pages.add(new ContactPage());
	}

}
