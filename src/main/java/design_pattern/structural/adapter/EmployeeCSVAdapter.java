/**
 * 
 */
package design_pattern.structural.adapter;

/**
 * @author vinay
 *
 */
public class EmployeeCSVAdapter implements Employee {
	private EmployeeCSV _instance;

	public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
		this._instance = employeeCSV;
	}

	
	@Override
	public String getId() {		
		return Integer.toString(_instance.getId());
	}
	
	@Override
	public String getLastName() {		
		return _instance.getFullName().substring(_instance.getFullName().indexOf(" ") + 1);
	}

	@Override
	public String getFirstName() {		
		return _instance.getFullName().substring(0, _instance.getFullName().indexOf(" "));
	}

	@Override
	public String getEmailId() {		
		return _instance.getEmailid();
	}

	@Override
	public String toString() {
		return "EmployeeCSVAdapter [id=" + getId() + ", lastName=" + getLastName() + ", firstName="
				+ getFirstName() + ", emailId=" + getEmailId() + "]";
	}
}
