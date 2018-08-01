/**
 * 
 */
package design_pattern.structural;

import design_pattern.structural.adapter.EmployeeClient;

/**
 * @author vinay
 *
 */
public class AdapterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		System.out.println(client.getEmployeeList());
	}

}
