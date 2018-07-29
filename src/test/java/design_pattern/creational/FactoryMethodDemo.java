package design_pattern.creational;

import design_pattern.creational.factorymethod.Website;
import design_pattern.creational.factorymethod.WebsiteFactory;
import design_pattern.creational.factorymethod.WebsiteType;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

		System.out.println(site.getPages());

		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

		System.out.println(site.getPages());
	}

}
