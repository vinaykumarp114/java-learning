/**
 * 
 */
package design_pattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vinay
 *
 */
public class EmployeeClient {

	public List<Employee> getEmployeeList(){
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new EmployeeDB("1", "Test", "User1", "test-user1@abc.com");
		employees.add(e1);
		
		EmployeeCSV employeeCSV = new EmployeeCSV(5, "Test User2", "test-user2@abc.com");
		employees.add(new EmployeeCSVAdapter(employeeCSV));
		
		return employees;
	}
}
