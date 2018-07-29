/**
 * 
 */
package design_pattern.creational.factorymethod;

/**
 * @author vinay
 *
 */
public class WebsiteFactory {
	
	public static Website getWebsite(WebsiteType type) {
		if(WebsiteType.BLOG.equals(type)) {
			return new Blog();
		} else if(WebsiteType.SHOP.equals(type)) {
			return new Shop();
		} 
		return null;
	}

}
