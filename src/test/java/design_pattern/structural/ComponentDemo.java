package design_pattern.structural;

import design_pattern.structural.composite.Menu;
import design_pattern.structural.composite.MenuItem;

public class ComponentDemo {
	
	public static void main(String[] args) {
		Menu menu = new Menu("Main", "/root");
		MenuItem safeMenuItem = new MenuItem("Safety", "/safety");		
		menu.add(safeMenuItem);
		
		Menu claimMenu = new Menu("Claims", "/claims");
		menu.add(claimMenu);
		
		MenuItem subClaimMenu = new MenuItem("Sub Claims", "/subclaims");
		claimMenu.add(subClaimMenu);
		
		System.out.println(menu.toString());
	}

}
